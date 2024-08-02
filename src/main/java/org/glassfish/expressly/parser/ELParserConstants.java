/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
 
/* Generated By:JJTree&JavaCC: Do not edit this line. ELParserConstants.java */
package org.glassfish.expressly.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ELParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int LITERAL_EXPRESSION = 1;
  /** RegularExpression Id. */
  int START_DYNAMIC_EXPRESSION = 2;
  /** RegularExpression Id. */
  int START_DEFERRED_EXPRESSION = 3;
  /** RegularExpression Id. */
  int START_MAP = 9;
  /** RegularExpression Id. */
  int RCURL = 10;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 11;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 12;
  /** RegularExpression Id. */
  int EXPONENT = 13;
  /** RegularExpression Id. */
  int STRING_LITERAL = 14;
  /** RegularExpression Id. */
  int BADLY_ESCAPED_STRING_LITERAL = 15;
  /** RegularExpression Id. */
  int TRUE = 16;
  /** RegularExpression Id. */
  int FALSE = 17;
  /** RegularExpression Id. */
  int NULL = 18;
  /** RegularExpression Id. */
  int DOT = 19;
  /** RegularExpression Id. */
  int LPAREN = 20;
  /** RegularExpression Id. */
  int RPAREN = 21;
  /** RegularExpression Id. */
  int LBRACK = 22;
  /** RegularExpression Id. */
  int RBRACK = 23;
  /** RegularExpression Id. */
  int COLON = 24;
  /** RegularExpression Id. */
  int COMMA = 25;
  /** RegularExpression Id. */
  int SEMICOLON = 26;
  /** RegularExpression Id. */
  int GT0 = 27;
  /** RegularExpression Id. */
  int GT1 = 28;
  /** RegularExpression Id. */
  int LT0 = 29;
  /** RegularExpression Id. */
  int LT1 = 30;
  /** RegularExpression Id. */
  int GE0 = 31;
  /** RegularExpression Id. */
  int GE1 = 32;
  /** RegularExpression Id. */
  int LE0 = 33;
  /** RegularExpression Id. */
  int LE1 = 34;
  /** RegularExpression Id. */
  int EQ0 = 35;
  /** RegularExpression Id. */
  int EQ1 = 36;
  /** RegularExpression Id. */
  int NE0 = 37;
  /** RegularExpression Id. */
  int NE1 = 38;
  /** RegularExpression Id. */
  int NOT0 = 39;
  /** RegularExpression Id. */
  int NOT1 = 40;
  /** RegularExpression Id. */
  int AND0 = 41;
  /** RegularExpression Id. */
  int AND1 = 42;
  /** RegularExpression Id. */
  int OR0 = 43;
  /** RegularExpression Id. */
  int OR1 = 44;
  /** RegularExpression Id. */
  int EMPTY = 45;
  /** RegularExpression Id. */
  int INSTANCEOF = 46;
  /** RegularExpression Id. */
  int MULT = 47;
  /** RegularExpression Id. */
  int PLUS = 48;
  /** RegularExpression Id. */
  int MINUS = 49;
  /** RegularExpression Id. */
  int QUESTIONMARK = 50;
  /** RegularExpression Id. */
  int DIV0 = 51;
  /** RegularExpression Id. */
  int DIV1 = 52;
  /** RegularExpression Id. */
  int MOD0 = 53;
  /** RegularExpression Id. */
  int MOD1 = 54;
  /** RegularExpression Id. */
  int CONCAT = 55;
  /** RegularExpression Id. */
  int ASSIGN = 56;
  /** RegularExpression Id. */
  int ARROW = 57;
  /** RegularExpression Id. */
  int IDENTIFIER = 58;
  /** RegularExpression Id. */
  int IMPL_OBJ_START = 59;
  /** RegularExpression Id. */
  int LETTER = 60;
  /** RegularExpression Id. */
  int DIGIT = 61;
  /** RegularExpression Id. */
  int ILLEGAL_CHARACTER = 62;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_EXPRESSION = 1;
  /** Lexical state. */
  int IN_MAP = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<LITERAL_EXPRESSION>",
    "\"${\"",
    "\"#{\"",
    "\"\\\\\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"{\"",
    "\"}\"",
    "<INTEGER_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<STRING_LITERAL>",
    "<BADLY_ESCAPED_STRING_LITERAL>",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "\".\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\":\"",
    "\",\"",
    "\";\"",
    "\">\"",
    "\"gt\"",
    "\"<\"",
    "\"lt\"",
    "\">=\"",
    "\"ge\"",
    "\"<=\"",
    "\"le\"",
    "\"==\"",
    "\"eq\"",
    "\"!=\"",
    "\"ne\"",
    "\"!\"",
    "\"not\"",
    "\"&&\"",
    "\"and\"",
    "\"||\"",
    "\"or\"",
    "\"empty\"",
    "\"instanceof\"",
    "\"*\"",
    "\"+\"",
    "\"-\"",
    "\"?\"",
    "\"/\"",
    "\"div\"",
    "\"%\"",
    "\"mod\"",
    "\"+=\"",
    "\"=\"",
    "\"->\"",
    "<IDENTIFIER>",
    "\"#\"",
    "<LETTER>",
    "<DIGIT>",
    "<ILLEGAL_CHARACTER>",
  };

}