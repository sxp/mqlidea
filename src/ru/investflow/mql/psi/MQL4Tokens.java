package ru.investflow.mql.psi;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

public interface MQL4Tokens extends TokenType {

    IElementType IDENTIFIER = new MQL4ElementType("IDENTIFIER");

    // Comments
    IElementType LINE_COMMENT = new MQL4ElementType("LINE_COMMENT");
    IElementType BLOCK_COMMENT = new MQL4ElementType("BLOCK_COMMENT");

    // Line terminators
    IElementType LINE_TERMINATOR = new MQL4ElementType("LINE_TERMINATOR");

    // review if this type is really needed after parser is finished.
    @Deprecated
    IElementType RECOVERY_LINE_TERMINATOR = new MQL4ElementType("RECOVERY_LINE_TERMINATOR");

    // Literals
    IElementType CHAR_LITERAL = new MQL4ElementType("CHAR_LITERAL");
    IElementType DOUBLE_LITERAL = new MQL4ElementType("DOUBLE_LITERAL");
    IElementType INTEGER_LITERAL = new MQL4ElementType("INTEGER_LITERAL");
    IElementType STRING_LITERAL = new MQL4ElementType("STRING_LITERAL");
    IElementType INCLUDE_STRING_LITERAL = new MQL4ElementType("INCLUDE_STRING_LITERAL");

    // Braces and separators
    IElementType COMMA = new MQL4ElementType("COMMA");
    IElementType DOT = new MQL4ElementType("DOT");
    IElementType LBRACE = new MQL4ElementType("LBRACE");
    IElementType LBRACKET = new MQL4ElementType("LBRACKET");
    IElementType LPARENTH = new MQL4ElementType("LPARENTH");
    IElementType RBRACE = new MQL4ElementType("RBRACE");
    IElementType RBRACKET = new MQL4ElementType("RBRACKET");
    IElementType RPARENTH = new MQL4ElementType("RPARENTH");
    IElementType COLON = new MQL4ElementType("COLON");
    IElementType SEMICOLON = new MQL4ElementType("SEMICOLON");
    IElementType LT = new MQL4ElementType("LT");
    IElementType GT = new MQL4ElementType("GT");

    // Preprocessor
    IElementType DEFINE_KEYWORD = new MQL4ElementType("DEFINE_KEYWORD");
    IElementType IMPORT_KEYWORD = new MQL4ElementType("IMPORT_KEYWORD");
    IElementType INCLUDE_KEYWORD = new MQL4ElementType("INCLUDE_KEYWORD");
    IElementType PROPERTY_KEYWORD = new MQL4ElementType("PROPERTY_KEYWORD");
    IElementType UNDEF_KEYWORD = new MQL4ElementType("UNDEF_KEYWORD");

    // Data types
    IElementType BOOL_KEYWORD = new MQL4ElementType("BOOL_KEYWORD");
    IElementType CHAR_KEYWORD = new MQL4ElementType("CHAR_KEYWORD");
    IElementType CLASS_KEYWORD = new MQL4ElementType("CLASS_KEYWORD");
    IElementType COLOR_KEYWORD = new MQL4ElementType("COLOR_KEYWORD");
    IElementType DATETIME_KEYWORD = new MQL4ElementType("DATETIME_KEYWORD");
    IElementType DOUBLE_KEYWORD = new MQL4ElementType("DOUBLE_KEYWORD");
    IElementType ENUM_KEYWORD = new MQL4ElementType("ENUM_KEYWORD");
    IElementType FLOAT_KEYWORD = new MQL4ElementType("FLOAT_KEYWORD");
    IElementType INT_KEYWORD = new MQL4ElementType("INT_KEYWORD");
    IElementType LONG_KEYWORD = new MQL4ElementType("LONG_KEYWORD");
    IElementType SHORT_KEYWORD = new MQL4ElementType("SHORT_KEYWORD");
    IElementType STRING_KEYWORD = new MQL4ElementType("STRING_KEYWORD");
    IElementType STRUCT_KEYWORD = new MQL4ElementType("STRUCT_KEYWORD");
    IElementType UCHAR_KEYWORD = new MQL4ElementType("UCHAR_KEYWORD");
    IElementType UINT_KEYWORD = new MQL4ElementType("UINT_KEYWORD");
    IElementType ULONG_KEYWORD = new MQL4ElementType("ULONG_KEYWORD");
    IElementType USHORT_KEYWORD = new MQL4ElementType("USHORT_KEYWORD");
    IElementType VOID_KEYWORD = new MQL4ElementType("VOID_KEYWORD");

    /**
     * Special marker. Used only during parsing and never appear in the final PSI model.
     */
    IElementType PARSING_MARKER = new MQL4ElementType("PARSING_MARKER");
}
