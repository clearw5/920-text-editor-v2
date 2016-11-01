/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class MarkdownLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"4\",\"NAME\":\"tabSize\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"4\",\"NAME\":\"indentSize\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"120\",\"NAME\":\"maxLineLen\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"<!--\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"-->\",\"NAME\":\"commentEnd\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"html::JAVASCRIPT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<script\"},{\"tag\":\"END\",\"text\":\"<\\/script>\"}]},{\"tag\":\"SEQ_REGEXP\",\"text\":\"<hr\\\\b([^<>])*?/?>\",\"attrs\":{\"TYPE\":\"MARKUP\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"BLOCK_HTML_TAGS\",\"HASH_CHAR\":\"<\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<(p|div|h[1-6]|blockquote|pre|table|dl|ol|ul|noscript|form|fieldset|iframe|math|ins|del)\\\\b\"},{\"tag\":\"END\",\"text\":\"<\\/$1>\"}]},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"INLINE_MARKUP\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"MARKDOWN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"INLINE_MARKUP\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"html::TAGS\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"BLOCK_HTML_TAGS\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"[\\\\S]+\",\"attrs\":{\"TYPE\":\"INVALID\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"{1,3}[\\\\S]+\",\"attrs\":{\"TYPE\":\"INVALID\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"( {4}|\\\\t)\",\"attrs\":{\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"html::MAIN\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"MARKDOWN\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"[ \\\\t]*(>[ \\\\t]{1})+\",\"attrs\":{\"HASH_CHARS\":\" >\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"MARKDOWN_BLOCKQUOTE\",\"MATCH_TYPE\":\"LITERAL3\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"_\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\][\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\\\\\[\\\\Q*_\\\\`[](){}#+.!-\\\\E]\",\"attrs\":{\"TYPE\":\"NULL\",\"HASH_CHAR\":\"\\\\\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL2\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"ruby::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"``` ruby\"},{\"tag\":\"END\",\"text\":\"```\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL2\",\"AT_LINE_START\":\"TRUE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"```\"},{\"tag\":\"END\",\"text\":\"```\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\"`\",\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(`{1,2})\"},{\"tag\":\"END\",\"text\":\"$1\"}]},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"( {4,}|\\\\t+)\\\\S\",\"attrs\":{\"HASH_CHARS\":\" \\t\",\"TYPE\":\"LITERAL2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"[=-]+\",\"attrs\":{\"HASH_CHARS\":\"=-\",\"TYPE\":\"KEYWORD1\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"#{1,6}[ \\\\t]*(.+?)\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"AT_LINE_START\":\"TRUE\",\"HASH_CHAR\":\"#\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"[ ]{0,2}([ ]?[-_*][ ]?){3,}[ \\\\t]*\",\"attrs\":{\"HASH_CHARS\":\"-*_ \\t\",\"TYPE\":\"KEYWORD1\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"[ \\\\t]{0,}[*+-][ \\\\t]+\",\"attrs\":{\"HASH_CHARS\":\"+-* \\t\",\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"[ \\\\t]{0,}\\\\d+\\\\.[ \\\\t]+\",\"attrs\":{\"HASH_CHARS\":\"0123456789 \\t\",\"TYPE\":\"KEYWORD2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"\\\\[(.*?)\\\\]\\\\:\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LABEL\",\"DELEGATE\":\"LINK_LABEL_DEFINITION\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\" ![\",\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"AT_LINE_START\":\"FALSE\",\"DELEGATE\":\"LINK_INLINE_URL_TITLE\",\"MATCH_TYPE\":\"OPERATOR\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"!?\\\\[[\\\\p{Alnum}\\\\p{Blank}]*\"},{\"tag\":\"END\",\"text\":\"\\\\]\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\"*_\",\"AT_WORD_START\":\"TRUE\",\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(\\\\*\\\\*|__)\"},{\"tag\":\"END\",\"text\":\"$1\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\"*_\",\"AT_WORD_START\":\"TRUE\",\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL4\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(\\\\*|_)\"},{\"tag\":\"END\",\"text\":\"$1\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LINK_LABEL_DEFINITION\",\"DEFAULT\":\"KEYWORD3\"},\"child\":[{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\\\\\[\\\\Q*_\\\\`[](){}#+.!-\\\\E]\",\"attrs\":{\"TYPE\":\"NULL\",\"HASH_CHAR\":\"\\\\\"}},{\"tag\":\"SEQ\",\"text\":\"\\\"\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"MARKDOWN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LINK_INLINE_URL_TITLE\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"]\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"AT_LINE_START\":\"FALSE\",\"DELEGATE\":\"LINK_INLINE_LABEL_CLOSE\",\"MATCH_TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"[\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\[\"},{\"tag\":\"END\",\"text\":\"\\\\]\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"AT_LINE_START\":\"FALSE\",\"DELEGATE\":\"LINK_INLINE_URL_TITLE_CLOSE\",\"MATCH_TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"(\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\(\"},{\"tag\":\"END\",\"text\":\"\\\\)\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LINK_INLINE_URL_TITLE_CLOSE\",\"DEFAULT\":\"KEYWORD3\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\")\",\"attrs\":{\"TYPE\":\"NULL\",\"DELEGATE\":\"MAIN\",\"MATCH_TYPE\":\"OPERATOR\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LINK_INLINE_LABEL_CLOSE\",\"DEFAULT\":\"LABEL\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\"]\",\"attrs\":{\"TYPE\":\"NULL\",\"DELEGATE\":\"MAIN\",\"MATCH_TYPE\":\"OPERATOR\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"MARKDOWN_BLOCKQUOTE\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"INLINE_MARKUP\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"_\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\][\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\\\\\[\\\\Q*_\\\\`[](){}#+.!-\\\\E]\",\"attrs\":{\"TYPE\":\"NULL\",\"HASH_CHAR\":\"\\\\\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\"`\",\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(`{1,2})\"},{\"tag\":\"END\",\"text\":\"$1\"}]},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"( {4,}|\\\\t+)\\\\S\",\"attrs\":{\"HASH_CHARS\":\" \\t\",\"TYPE\":\"LITERAL2\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"[=-]+\",\"attrs\":{\"HASH_CHARS\":\"=-\",\"TYPE\":\"KEYWORD1\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"#{1,6}[ \\\\t]*(.+?)\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\"#\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"[ ]{0,2}([ ]?[-_*][ ]?){3,}[ \\\\t]*\",\"attrs\":{\"HASH_CHARS\":\"-*_ \\t\",\"TYPE\":\"KEYWORD1\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"[ \\\\t]{0,}[*+-][ \\\\t]+\",\"attrs\":{\"HASH_CHARS\":\"*+- \\t\",\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"[ \\\\t]{0,}\\\\d+\\\\.[ \\\\t]+\",\"attrs\":{\"HASH_CHARS\":\"0123456789 \\t\",\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"\\\\[(.*?)\\\\]\\\\:\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"LINK_LABEL_DEFINITION\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\" ![\",\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"AT_LINE_START\":\"FALSE\",\"DELEGATE\":\"LINK_INLINE_URL_TITLE\",\"MATCH_TYPE\":\"OPERATOR\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"!?\\\\[[\\\\p{Alnum}\\\\p{Blank}]*\"},{\"tag\":\"END\",\"text\":\"\\\\]\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\"*_\",\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(\\\\*\\\\*|__)\"},{\"tag\":\"END\",\"text\":\"$1\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"HASH_CHARS\":\"*_\",\"TYPE\":\"LITERAL4\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(\\\\*|_)\"},{\"tag\":\"END\",\"text\":\"$1\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}