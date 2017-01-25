/*******************************************************************************
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *******************************************************************************/
package org.jetbrains.kotlin.projectsextensions.maven;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.Date;
import org.jetbrains.kotlin.diagnostics.netbeans.parser.KotlinAnalysisProjectCache;
import org.jetbrains.kotlin.model.KotlinEnvironment;
import org.jetbrains.kotlin.projectsextensions.KotlinProjectHelper;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.api.project.Project;
import org.netbeans.modules.maven.api.NbMavenProject;
import org.netbeans.spi.project.ui.ProjectOpenedHook;
import org.openide.filesystems.FileObject;

/**
 *
 * @author Alexander.Baratynski
 */
public class MavenProjectOpenedHook extends ProjectOpenedHook{

    private static volatile boolean progressHandleRun = false;
    private final Project project;
    
    public MavenProjectOpenedHook(Project project) {
        this.project = project;
    }
    
    @Override
    protected void projectOpened() {
        Thread thread = new Thread(){
                @Override
                public void run(){
                        Runnable run = new Runnable(){
                            @Override
                            public void run(){
                                progressHandleRun = true;
                                final ProgressHandle progressBar = 
                                    ProgressHandleFactory.createHandle("Loading Kotlin environment");
                                progressBar.start();
                                KotlinEnvironment.Companion.getEnvironment(project);
                                progressBar.finish();
                                progressHandleRun = false;
                            }
                        };
                        if (!progressHandleRun) {
                            KotlinProjectHelper.INSTANCE.postTask(run);
                        }
                        
                        final FileObject pomXml = project.getProjectDirectory().getFileObject("pom.xml");
                        
                        getProjectWatcher().addPropertyChangeListener(new PropertyChangeListener() {
                            @Override
                            public void propertyChange(PropertyChangeEvent evt) {
                                int second = 1000;// ms
                                boolean pomModified = (new Date().getTime() - 
                                        pomXml.lastModified().getTime()) < 3 * second; // hack
                                
                                if (pomModified) {
                                    KotlinProjectHelper.INSTANCE.updateExtendedClassPath(project);
                                }
                            }
                        });
                        
                        KotlinProjectHelper.INSTANCE.doInitialScan(project);
                }
            };
        thread.start();
    }
    private NbMavenProject getProjectWatcher() {
        Class clazz = project.getClass();
        try {
            Method getProjectWatcher = clazz.getMethod("getProjectWatcher");
            return (NbMavenProject) getProjectWatcher.invoke(project);
        } catch (ReflectiveOperationException ex) {} 
        
        return null;
    }
    @Override
    protected void projectClosed() {
        KotlinAnalysisProjectCache.INSTANCE.removeProjectCache(project);
        KotlinProjectHelper.INSTANCE.removeProjectCache(project);
    }
    
}
