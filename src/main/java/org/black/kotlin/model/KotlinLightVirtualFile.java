package org.black.kotlin.model;

import com.intellij.testFramework.LightVirtualFile;
import org.jetbrains.kotlin.idea.KotlinLanguage;
import org.openide.filesystems.FileObject;

/**
 *
 * @author Александр
 */
public class KotlinLightVirtualFile extends LightVirtualFile {
   
    private String path;
    
    public KotlinLightVirtualFile(FileObject file, String text){
        super(file.getName(),KotlinLanguage.INSTANCE, text);
        path = file.getPath();
    }
    
    @Override
    public String getPath(){
        return path;
    }
}
