/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Jul 07 13:51:06 JST 2019
//----------------------------------------------------

package org.netbeans.modules.php.editor.parser;

/** CUP generated interface containing symbol constants. */
public interface ASTPHP5Symbols {
  /* terminals */
  public static final int T_BOOLEAN_AND = 103;
  public static final int T_INLINE_HTML = 10;
  public static final int T_EMPTY = 48;
  public static final int T_PROTECTED = 146;
  public static final int T_CLOSE_RECT = 137;
  public static final int T_TRAIT_C = 60;
  public static final int T_IS_NOT_EQUAL = 108;
  public static final int T_INCLUDE = 78;
  public static final int T_QUATE = 152;
  public static final int T_GLOBAL = 44;
  public static final int T_PRINT = 87;
  public static final int T_OR_EQUAL = 96;
  public static final int T_LOGICAL_XOR = 85;
  public static final int T_COALESCE = 161;
  public static final int T_FUNCTION = 34;
  public static final int T_STATIC = 142;
  public static final int T_NEKUDA = 125;
  public static final int T_THROW = 41;
  public static final int T_CLASS = 50;
  public static final int T_ABSTRACT = 143;
  public static final int T_ENCAPSED_AND_WHITESPACE = 11;
  public static final int T_MOD_EQUAL = 94;
  public static final int T_BREAK = 30;
  public static final int T_WHILE = 15;
  public static final int T_DO = 14;
  public static final int T_CONST = 35;
  public static final int T_CONTINUE = 31;
  public static final int T_FUNC_C = 62;
  public static final int T_DIV = 121;
  public static final int T_LOGICAL_OR = 84;
  public static final int T_DIR = 74;
  public static final int T_OPEN_PARENTHESE = 148;
  public static final int T_REFERENCE = 106;
  public static final int T_COMMA = 83;
  public static final int T_FINALLY = 42;
  public static final int T_ELSE = 141;
  public static final int T_IS_EQUAL = 107;
  public static final int T_LIST = 56;
  public static final int T_NAMESPACE = 72;
  public static final int T_NS_SEPARATOR = 75;
  public static final int T_OR = 104;
  public static final int T_IS_IDENTICAL = 109;
  public static final int T_INC = 126;
  public static final int T_ELSEIF = 140;
  public static final int T_TRY = 39;
  public static final int T_START_NOWDOC = 154;
  public static final int T_PRIVATE = 145;
  public static final int T_UNSET_CAST = 134;
  public static final int T_INCLUDE_ONCE = 79;
  public static final int T_ENDIF = 139;
  public static final int T_SR_EQUAL = 99;
  public static final int EOF = 0;
  public static final int T_CALLABLE = 58;
  public static final int T_PUBLIC = 147;
  public static final int T_OBJECT_OPERATOR = 54;
  public static final int T_TILDA = 124;
  public static final int T_PAAMAYIM_NEKUDOTAYIM = 71;
  public static final int T_IS_SMALLER_OR_EQUAL = 111;
  public static final int T_ELLIPSIS = 160;
  public static final int T_XOR_EQUAL = 97;
  public static final int T_ENDFOREACH = 20;
  public static final int T_CONSTANT_ENCAPSED_STRING = 12;
  public static final int T_BACKQUATE = 153;
  public static final int T_AT = 135;
  public static final int T_AS = 25;
  public static final int T_CURLY_CLOSE = 70;
  public static final int T_ENDDECLARE = 22;
  public static final int T_CATCH = 40;
  public static final int T_CASE = 28;
  public static final int T_VARIABLE = 8;
  public static final int T_INSTEADOF = 157;
  public static final int T_NEW = 138;
  public static final int T_MINUS_EQUAL = 90;
  public static final int T_PLUS = 118;
  public static final int T_SL_EQUAL = 98;
  public static final int T_ENDWHILE = 16;
  public static final int T_ENDFOR = 18;
  public static final int T_TRAIT = 156;
  public static final int T_CLONE = 24;
  public static final int T_BOOLEAN_OR = 102;
  public static final int T_UNSET = 46;
  public static final int T_INTERFACE = 51;
  public static final int T_SWITCH = 26;
  public static final int T_IS_GREATER_OR_EQUAL = 112;
  public static final int T_OPEN_RECT = 136;
  public static final int T_CURLY_OPEN_WITH_DOLAR = 68;
  public static final int T_FINAL = 144;
  public static final int T_REQUIRE = 81;
  public static final int T_FILE = 64;
  public static final int T_DEC = 127;
  public static final int T_CLOSE_PARENTHESE = 149;
  public static final int T_CLASS_C = 59;
  public static final int T_EVAL = 80;
  public static final int T_POW = 158;
  public static final int T_RGREATER = 114;
  public static final int T_IS_NOT_IDENTICAL = 110;
  public static final int T_NOT = 123;
  public static final int T_REQUIRE_ONCE = 82;
  public static final int T_POW_EQUAL = 159;
  public static final int T_NS_C = 73;
  public static final int T_DOLLAR_OPEN_CURLY_BRACES = 67;
  public static final int T_SPACESHIP = 113;
  public static final int T_VAR = 45;
  public static final int T_START_HEREDOC = 65;
  public static final int T_ENDSWITCH = 27;
  public static final int T_OBJECT_CAST = 132;
  public static final int T_ECHO = 13;
  public static final int T_LINE = 63;
  public static final int T_FOR = 17;
  public static final int T_IMPLEMENTS = 53;
  public static final int T_ARRAY_CAST = 131;
  public static final int T_DOLLAR = 151;
  public static final int T_TIMES = 120;
  public static final int T_DOUBLE_CAST = 129;
  public static final int T_BOOL_CAST = 133;
  public static final int T_PRECENT = 122;
  public static final int T_LNUMBER = 4;
  public static final int T_CURLY_OPEN = 69;
  public static final int T_DEFINE = 77;
  public static final int T_QUESTION_MARK = 100;
  public static final int T_END_NOWDOC = 155;
  public static final int T_USE = 43;
  public static final int T_KOVA = 105;
  public static final int T_IF = 3;
  public static final int T_MUL_EQUAL = 91;
  public static final int T_ARRAY = 57;
  public static final int T_LGREATER = 115;
  public static final int T_COALESCE_EQUAL = 162;
  public static final int T_SEMICOLON = 101;
  public static final int T_NEKUDOTAIM = 150;
  public static final int T_VAR_COMMENT = 76;
  public static final int T_CONCAT_EQUAL = 93;
  public static final int T_YIELD = 37;
  public static final int T_AND_EQUAL = 95;
  public static final int T_DNUMBER = 5;
  public static final int T_MINUS = 119;
  public static final int T_FOREACH = 19;
  public static final int T_EXIT = 2;
  public static final int T_DECLARE = 21;
  public static final int T_STRING_VARNAME = 7;
  public static final int T_EXTENDS = 52;
  public static final int T_METHOD_C = 61;
  public static final int T_INT_CAST = 128;
  public static final int T_ISSET = 47;
  public static final int T_LOGICAL_AND = 86;
  public static final int error = 1;
  public static final int T_RETURN = 36;
  public static final int T_DEFAULT = 29;
  public static final int T_SR = 117;
  public static final int T_YIELD_FROM = 38;
  public static final int T_EQUAL = 88;
  public static final int T_SL = 116;
  public static final int T_END_HEREDOC = 66;
  public static final int T_DOUBLE_ARROW = 55;
  public static final int T_STRING_CAST = 130;
  public static final int T_STRING = 6;
  public static final int T_PLUS_EQUAL = 89;
  public static final int T_FN = 33;
  public static final int T_INSTANCEOF = 23;
  public static final int T_DIV_EQUAL = 92;
  public static final int T_NUM_STRING = 9;
  public static final int T_HALT_COMPILER = 49;
  public static final int T_GOTO = 32;
}
