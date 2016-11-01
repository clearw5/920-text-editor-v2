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
public class TclLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"true\",\"NAME\":\"lineUpClosingBracket\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"#\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"0x\\\\p{XDigit}+|\\\\d+\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"\\\\\\\\$\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"\\\\\"}},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\";\\\\s*(?=#)\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"TCL_COMMENT\",\"HASH_CHAR\":\";\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"TCL_COMMENT\",\"HASH_CHAR\":\"{\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\{\\\\s*(?=#)\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"TCL_STRING\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"NULL\",\"DELEGATE\":\"MAIN\",\"HASH_CHAR\":\"$\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\$(\\\\w|::)+\\\\(\"},{\"tag\":\"END\",\"text\":\")\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"NULL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"${\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\$(\\\\w|::)+\",\"attrs\":{\"TYPE\":\"NULL\",\"HASH_CHAR\":\"$\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"[\"},{\"tag\":\"END\",\"text\":\"]\"}]},{\"tag\":\"SEQ\",\"text\":\"\\\\a\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\b\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\f\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\n\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\r\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\t\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\v\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\";\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"MAIN\"}},{\"tag\":\"SEQ\",\"text\":\"::\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"append\"},{\"tag\":\"KEYWORD1\",\"text\":\"array\"},{\"tag\":\"KEYWORD1\",\"text\":\"concat\"},{\"tag\":\"KEYWORD1\",\"text\":\"console\"},{\"tag\":\"KEYWORD1\",\"text\":\"eval\"},{\"tag\":\"KEYWORD1\",\"text\":\"expr\"},{\"tag\":\"KEYWORD1\",\"text\":\"format\"},{\"tag\":\"KEYWORD1\",\"text\":\"global\"},{\"tag\":\"KEYWORD1\",\"text\":\"set\"},{\"tag\":\"KEYWORD1\",\"text\":\"trace\"},{\"tag\":\"KEYWORD1\",\"text\":\"unset\"},{\"tag\":\"KEYWORD1\",\"text\":\"upvar\"},{\"tag\":\"KEYWORD1\",\"text\":\"join\"},{\"tag\":\"KEYWORD1\",\"text\":\"lappend\"},{\"tag\":\"KEYWORD1\",\"text\":\"lindex\"},{\"tag\":\"KEYWORD1\",\"text\":\"linsert\"},{\"tag\":\"KEYWORD1\",\"text\":\"list\"},{\"tag\":\"KEYWORD1\",\"text\":\"llength\"},{\"tag\":\"KEYWORD1\",\"text\":\"lrange\"},{\"tag\":\"KEYWORD1\",\"text\":\"lreplace\"},{\"tag\":\"KEYWORD1\",\"text\":\"lsearch\"},{\"tag\":\"KEYWORD1\",\"text\":\"lsort\"},{\"tag\":\"KEYWORD1\",\"text\":\"split\"},{\"tag\":\"KEYWORD1\",\"text\":\"scan\"},{\"tag\":\"KEYWORD1\",\"text\":\"string\"},{\"tag\":\"KEYWORD1\",\"text\":\"regexp\"},{\"tag\":\"KEYWORD1\",\"text\":\"regsub\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"elseif\"},{\"tag\":\"KEYWORD1\",\"text\":\"switch\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"foreach\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD1\",\"text\":\"continue\"},{\"tag\":\"KEYWORD1\",\"text\":\"proc\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"source\"},{\"tag\":\"KEYWORD1\",\"text\":\"unknown\"},{\"tag\":\"KEYWORD1\",\"text\":\"uplevel\"},{\"tag\":\"KEYWORD1\",\"text\":\"cd\"},{\"tag\":\"KEYWORD1\",\"text\":\"close\"},{\"tag\":\"KEYWORD1\",\"text\":\"eof\"},{\"tag\":\"KEYWORD1\",\"text\":\"file\"},{\"tag\":\"KEYWORD1\",\"text\":\"flush\"},{\"tag\":\"KEYWORD1\",\"text\":\"gets\"},{\"tag\":\"KEYWORD1\",\"text\":\"glob\"},{\"tag\":\"KEYWORD1\",\"text\":\"open\"},{\"tag\":\"KEYWORD1\",\"text\":\"read\"},{\"tag\":\"KEYWORD1\",\"text\":\"puts\"},{\"tag\":\"KEYWORD1\",\"text\":\"pwd\"},{\"tag\":\"KEYWORD1\",\"text\":\"seek\"},{\"tag\":\"KEYWORD1\",\"text\":\"tell\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD1\",\"text\":\"error\"},{\"tag\":\"KEYWORD1\",\"text\":\"exec\"},{\"tag\":\"KEYWORD1\",\"text\":\"pid\"},{\"tag\":\"KEYWORD1\",\"text\":\"after\"},{\"tag\":\"KEYWORD1\",\"text\":\"time\"},{\"tag\":\"KEYWORD1\",\"text\":\"exit\"},{\"tag\":\"KEYWORD1\",\"text\":\"history\"},{\"tag\":\"KEYWORD1\",\"text\":\"rename\"},{\"tag\":\"KEYWORD1\",\"text\":\"info\"},{\"tag\":\"KEYWORD1\",\"text\":\"ceil\"},{\"tag\":\"KEYWORD1\",\"text\":\"floor\"},{\"tag\":\"KEYWORD1\",\"text\":\"round\"},{\"tag\":\"KEYWORD1\",\"text\":\"incr\"},{\"tag\":\"KEYWORD1\",\"text\":\"abs\"},{\"tag\":\"KEYWORD1\",\"text\":\"acos\"},{\"tag\":\"KEYWORD1\",\"text\":\"cos\"},{\"tag\":\"KEYWORD1\",\"text\":\"cosh\"},{\"tag\":\"KEYWORD1\",\"text\":\"asin\"},{\"tag\":\"KEYWORD1\",\"text\":\"sin\"},{\"tag\":\"KEYWORD1\",\"text\":\"sinh\"},{\"tag\":\"KEYWORD1\",\"text\":\"atan\"},{\"tag\":\"KEYWORD1\",\"text\":\"atan2\"},{\"tag\":\"KEYWORD1\",\"text\":\"tan\"},{\"tag\":\"KEYWORD1\",\"text\":\"tanh\"},{\"tag\":\"KEYWORD1\",\"text\":\"log\"},{\"tag\":\"KEYWORD1\",\"text\":\"log10\"},{\"tag\":\"KEYWORD1\",\"text\":\"fmod\"},{\"tag\":\"KEYWORD1\",\"text\":\"pow\"},{\"tag\":\"KEYWORD1\",\"text\":\"hypot\"},{\"tag\":\"KEYWORD1\",\"text\":\"sqrt\"},{\"tag\":\"KEYWORD1\",\"text\":\"double\"},{\"tag\":\"KEYWORD1\",\"text\":\"int\"},{\"tag\":\"KEYWORD1\",\"text\":\"bgerror\"},{\"tag\":\"KEYWORD1\",\"text\":\"binary\"},{\"tag\":\"KEYWORD1\",\"text\":\"clock\"},{\"tag\":\"KEYWORD1\",\"text\":\"dde\"},{\"tag\":\"KEYWORD1\",\"text\":\"encoding\"},{\"tag\":\"KEYWORD1\",\"text\":\"fblocked\"},{\"tag\":\"KEYWORD1\",\"text\":\"fconfigure\"},{\"tag\":\"KEYWORD1\",\"text\":\"fcopy\"},{\"tag\":\"KEYWORD1\",\"text\":\"fileevent\"},{\"tag\":\"KEYWORD1\",\"text\":\"filename\"},{\"tag\":\"KEYWORD1\",\"text\":\"http\"},{\"tag\":\"KEYWORD1\",\"text\":\"interp\"},{\"tag\":\"KEYWORD1\",\"text\":\"load\"},{\"tag\":\"KEYWORD1\",\"text\":\"lset\"},{\"tag\":\"KEYWORD1\",\"text\":\"memory\"},{\"tag\":\"KEYWORD1\",\"text\":\"msgcat\"},{\"tag\":\"KEYWORD1\",\"text\":\"namespace\"},{\"tag\":\"KEYWORD1\",\"text\":\"package\"},{\"tag\":\"KEYWORD1\",\"text\":\"pkg::create\"},{\"tag\":\"KEYWORD1\",\"text\":\"pkg_mkIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"registry\"},{\"tag\":\"KEYWORD1\",\"text\":\"resource\"},{\"tag\":\"KEYWORD1\",\"text\":\"socket\"},{\"tag\":\"KEYWORD1\",\"text\":\"subst\"},{\"tag\":\"KEYWORD1\",\"text\":\"update\"},{\"tag\":\"KEYWORD1\",\"text\":\"variable\"},{\"tag\":\"KEYWORD1\",\"text\":\"vwait\"},{\"tag\":\"KEYWORD1\",\"text\":\"auto_execok\"},{\"tag\":\"KEYWORD1\",\"text\":\"auto_import\"},{\"tag\":\"KEYWORD1\",\"text\":\"auto_load\"},{\"tag\":\"KEYWORD1\",\"text\":\"auto_mkindex\"},{\"tag\":\"KEYWORD1\",\"text\":\"auto_mkindex_old\"},{\"tag\":\"KEYWORD1\",\"text\":\"auto_qualify\"},{\"tag\":\"KEYWORD1\",\"text\":\"auto_reset\"},{\"tag\":\"KEYWORD1\",\"text\":\"parray\"},{\"tag\":\"KEYWORD1\",\"text\":\"tcl_endOfWord\"},{\"tag\":\"KEYWORD1\",\"text\":\"tcl_findLibrary\"},{\"tag\":\"KEYWORD1\",\"text\":\"tcl_startOfNextWord\"},{\"tag\":\"KEYWORD1\",\"text\":\"tcl_startOfPreviousWord\"},{\"tag\":\"KEYWORD1\",\"text\":\"tcl_wordBreakAfter\"},{\"tag\":\"KEYWORD1\",\"text\":\"tcl_wordBreakBefore\"},{\"tag\":\"KEYWORD2\",\"text\":\"bind\"},{\"tag\":\"KEYWORD2\",\"text\":\"button\"},{\"tag\":\"KEYWORD2\",\"text\":\"canvas\"},{\"tag\":\"KEYWORD2\",\"text\":\"checkbutton\"},{\"tag\":\"KEYWORD2\",\"text\":\"destroy\"},{\"tag\":\"KEYWORD2\",\"text\":\"entry\"},{\"tag\":\"KEYWORD2\",\"text\":\"focus\"},{\"tag\":\"KEYWORD2\",\"text\":\"frame\"},{\"tag\":\"KEYWORD2\",\"text\":\"grab\"},{\"tag\":\"KEYWORD2\",\"text\":\"image\"},{\"tag\":\"KEYWORD2\",\"text\":\"label\"},{\"tag\":\"KEYWORD2\",\"text\":\"listbox\"},{\"tag\":\"KEYWORD2\",\"text\":\"lower\"},{\"tag\":\"KEYWORD2\",\"text\":\"menu\"},{\"tag\":\"KEYWORD2\",\"text\":\"menubutton\"},{\"tag\":\"KEYWORD2\",\"text\":\"message\"},{\"tag\":\"KEYWORD2\",\"text\":\"option\"},{\"tag\":\"KEYWORD2\",\"text\":\"pack\"},{\"tag\":\"KEYWORD2\",\"text\":\"placer\"},{\"tag\":\"KEYWORD2\",\"text\":\"radiobutton\"},{\"tag\":\"KEYWORD2\",\"text\":\"raise\"},{\"tag\":\"KEYWORD2\",\"text\":\"scale\"},{\"tag\":\"KEYWORD2\",\"text\":\"scrollbar\"},{\"tag\":\"KEYWORD2\",\"text\":\"selection\"},{\"tag\":\"KEYWORD2\",\"text\":\"send\"},{\"tag\":\"KEYWORD2\",\"text\":\"text\"},{\"tag\":\"KEYWORD2\",\"text\":\"tk\"},{\"tag\":\"KEYWORD2\",\"text\":\"tkerror\"},{\"tag\":\"KEYWORD2\",\"text\":\"tkwait\"},{\"tag\":\"KEYWORD2\",\"text\":\"toplevel\"},{\"tag\":\"KEYWORD2\",\"text\":\"update\"},{\"tag\":\"KEYWORD2\",\"text\":\"winfo\"},{\"tag\":\"KEYWORD2\",\"text\":\"wm\"},{\"tag\":\"KEYWORD2\",\"text\":\"debug\"},{\"tag\":\"KEYWORD2\",\"text\":\"disconnect\"},{\"tag\":\"KEYWORD2\",\"text\":\"exp_continue\"},{\"tag\":\"KEYWORD2\",\"text\":\"exp_internal\"},{\"tag\":\"KEYWORD2\",\"text\":\"exp_open\"},{\"tag\":\"KEYWORD2\",\"text\":\"exp_pid\"},{\"tag\":\"KEYWORD2\",\"text\":\"exp_version\"},{\"tag\":\"KEYWORD2\",\"text\":\"expect\"},{\"tag\":\"KEYWORD2\",\"text\":\"expect_after\"},{\"tag\":\"KEYWORD2\",\"text\":\"expect_background\"},{\"tag\":\"KEYWORD2\",\"text\":\"expect_before\"},{\"tag\":\"KEYWORD2\",\"text\":\"expect_tty\"},{\"tag\":\"KEYWORD2\",\"text\":\"expect_user\"},{\"tag\":\"KEYWORD2\",\"text\":\"fork\"},{\"tag\":\"KEYWORD2\",\"text\":\"inter_return\"},{\"tag\":\"KEYWORD2\",\"text\":\"interact\"},{\"tag\":\"KEYWORD2\",\"text\":\"interpreter\"},{\"tag\":\"KEYWORD2\",\"text\":\"log_file\"},{\"tag\":\"KEYWORD2\",\"text\":\"log_user\"},{\"tag\":\"KEYWORD2\",\"text\":\"match_max\"},{\"tag\":\"KEYWORD2\",\"text\":\"overlay\"},{\"tag\":\"KEYWORD2\",\"text\":\"parity\"},{\"tag\":\"KEYWORD2\",\"text\":\"promptl\"},{\"tag\":\"KEYWORD2\",\"text\":\"prompt2\"},{\"tag\":\"KEYWORD2\",\"text\":\"remove_nulls\"},{\"tag\":\"KEYWORD2\",\"text\":\"send_error\"},{\"tag\":\"KEYWORD2\",\"text\":\"send_log\"},{\"tag\":\"KEYWORD2\",\"text\":\"send_tty\"},{\"tag\":\"KEYWORD2\",\"text\":\"send_user\"},{\"tag\":\"KEYWORD2\",\"text\":\"sleep\"},{\"tag\":\"KEYWORD2\",\"text\":\"spawn\"},{\"tag\":\"KEYWORD2\",\"text\":\"strace\"},{\"tag\":\"KEYWORD2\",\"text\":\"stty\"},{\"tag\":\"KEYWORD2\",\"text\":\"system\"},{\"tag\":\"KEYWORD2\",\"text\":\"timestamp\"},{\"tag\":\"KEYWORD2\",\"text\":\"trap\"},{\"tag\":\"KEYWORD2\",\"text\":\"wait\"},{\"tag\":\"KEYWORD3\",\"text\":\"full_buffer\"},{\"tag\":\"KEYWORD3\",\"text\":\"timeout\"},{\"tag\":\"KEYWORD3\",\"text\":\"argv0\"},{\"tag\":\"KEYWORD3\",\"text\":\"argv\"},{\"tag\":\"KEYWORD3\",\"text\":\"argc\"},{\"tag\":\"KEYWORD3\",\"text\":\"tk_version\"},{\"tag\":\"KEYWORD3\",\"text\":\"tk_library\"},{\"tag\":\"KEYWORD3\",\"text\":\"tk_strictMotif\"},{\"tag\":\"KEYWORD3\",\"text\":\"env\"},{\"tag\":\"KEYWORD3\",\"text\":\"errorCode\"},{\"tag\":\"KEYWORD3\",\"text\":\"errorInfo\"},{\"tag\":\"KEYWORD3\",\"text\":\"geometry\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_library\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_patchLevel\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_pkgPath\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_platform\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_precision\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_rcFileName\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_rcRsrcName\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_traceCompile\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_traceExec\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_wordchars\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_nonwordchars\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_version\"},{\"tag\":\"KEYWORD3\",\"text\":\"tcl_interactive\"},{\"tag\":\"KEYWORD3\",\"text\":\"exact\"},{\"tag\":\"KEYWORD3\",\"text\":\"all\"},{\"tag\":\"KEYWORD3\",\"text\":\"indices\"},{\"tag\":\"KEYWORD3\",\"text\":\"nocase\"},{\"tag\":\"KEYWORD3\",\"text\":\"nocomplain\"},{\"tag\":\"KEYWORD3\",\"text\":\"nonewline\"},{\"tag\":\"KEYWORD3\",\"text\":\"code\"},{\"tag\":\"KEYWORD3\",\"text\":\"errorinfo\"},{\"tag\":\"KEYWORD3\",\"text\":\"errorcode\"},{\"tag\":\"KEYWORD3\",\"text\":\"atime\"},{\"tag\":\"KEYWORD3\",\"text\":\"anymore\"},{\"tag\":\"KEYWORD3\",\"text\":\"args\"},{\"tag\":\"KEYWORD3\",\"text\":\"body\"},{\"tag\":\"KEYWORD3\",\"text\":\"compare\"},{\"tag\":\"KEYWORD3\",\"text\":\"cmdcount\"},{\"tag\":\"KEYWORD3\",\"text\":\"commands\"},{\"tag\":\"KEYWORD3\",\"text\":\"ctime\"},{\"tag\":\"KEYWORD3\",\"text\":\"current\"},{\"tag\":\"KEYWORD3\",\"text\":\"default\"},{\"tag\":\"KEYWORD3\",\"text\":\"dev\"},{\"tag\":\"KEYWORD3\",\"text\":\"dirname\"},{\"tag\":\"KEYWORD3\",\"text\":\"donesearch\"},{\"tag\":\"KEYWORD3\",\"text\":\"errorinfo\"},{\"tag\":\"KEYWORD3\",\"text\":\"executable\"},{\"tag\":\"KEYWORD3\",\"text\":\"extension\"},{\"tag\":\"KEYWORD3\",\"text\":\"first\"},{\"tag\":\"KEYWORD3\",\"text\":\"globals\"},{\"tag\":\"KEYWORD3\",\"text\":\"gid\"},{\"tag\":\"KEYWORD3\",\"text\":\"index\"},{\"tag\":\"KEYWORD3\",\"text\":\"ino\"},{\"tag\":\"KEYWORD3\",\"text\":\"isdirectory\"},{\"tag\":\"KEYWORD3\",\"text\":\"isfile\"},{\"tag\":\"KEYWORD3\",\"text\":\"keep\"},{\"tag\":\"KEYWORD3\",\"text\":\"last\"},{\"tag\":\"KEYWORD3\",\"text\":\"level\"},{\"tag\":\"KEYWORD3\",\"text\":\"length\"},{\"tag\":\"KEYWORD3\",\"text\":\"library\"},{\"tag\":\"KEYWORD3\",\"text\":\"locals\"},{\"tag\":\"KEYWORD3\",\"text\":\"lstat\"},{\"tag\":\"KEYWORD3\",\"text\":\"match\"},{\"tag\":\"KEYWORD3\",\"text\":\"mode\"},{\"tag\":\"KEYWORD3\",\"text\":\"mtime\"},{\"tag\":\"KEYWORD3\",\"text\":\"names\"},{\"tag\":\"KEYWORD3\",\"text\":\"nextelement\"},{\"tag\":\"KEYWORD3\",\"text\":\"nextid\"},{\"tag\":\"KEYWORD3\",\"text\":\"nlink\"},{\"tag\":\"KEYWORD3\",\"text\":\"none\"},{\"tag\":\"KEYWORD3\",\"text\":\"procs\"},{\"tag\":\"KEYWORD3\",\"text\":\"owned\"},{\"tag\":\"KEYWORD3\",\"text\":\"range\"},{\"tag\":\"KEYWORD3\",\"text\":\"readable\"},{\"tag\":\"KEYWORD3\",\"text\":\"readlink\"},{\"tag\":\"KEYWORD3\",\"text\":\"redo\"},{\"tag\":\"KEYWORD3\",\"text\":\"release\"},{\"tag\":\"KEYWORD3\",\"text\":\"rootname\"},{\"tag\":\"KEYWORD3\",\"text\":\"script\"},{\"tag\":\"KEYWORD3\",\"text\":\"show\"},{\"tag\":\"KEYWORD3\",\"text\":\"size\"},{\"tag\":\"KEYWORD3\",\"text\":\"startsearch\"},{\"tag\":\"KEYWORD3\",\"text\":\"stat\"},{\"tag\":\"KEYWORD3\",\"text\":\"status\"},{\"tag\":\"KEYWORD3\",\"text\":\"substitute\"},{\"tag\":\"KEYWORD3\",\"text\":\"tail\"},{\"tag\":\"KEYWORD3\",\"text\":\"tclversion\"},{\"tag\":\"KEYWORD3\",\"text\":\"tolower\"},{\"tag\":\"KEYWORD3\",\"text\":\"toupper\"},{\"tag\":\"KEYWORD3\",\"text\":\"trim\"},{\"tag\":\"KEYWORD3\",\"text\":\"trimleft\"},{\"tag\":\"KEYWORD3\",\"text\":\"trimright\"},{\"tag\":\"KEYWORD3\",\"text\":\"type\"},{\"tag\":\"KEYWORD3\",\"text\":\"uid\"},{\"tag\":\"KEYWORD3\",\"text\":\"variable\"},{\"tag\":\"KEYWORD3\",\"text\":\"vars\"},{\"tag\":\"KEYWORD3\",\"text\":\"vdelete\"},{\"tag\":\"KEYWORD3\",\"text\":\"vinfo\"},{\"tag\":\"KEYWORD3\",\"text\":\"visibility\"},{\"tag\":\"KEYWORD3\",\"text\":\"window\"},{\"tag\":\"KEYWORD3\",\"text\":\"writable\"},{\"tag\":\"KEYWORD3\",\"text\":\"accelerator\"},{\"tag\":\"KEYWORD3\",\"text\":\"activeforeground\"},{\"tag\":\"KEYWORD3\",\"text\":\"activebackground\"},{\"tag\":\"KEYWORD3\",\"text\":\"anchor\"},{\"tag\":\"KEYWORD3\",\"text\":\"aspect\"},{\"tag\":\"KEYWORD3\",\"text\":\"background\"},{\"tag\":\"KEYWORD3\",\"text\":\"before\"},{\"tag\":\"KEYWORD3\",\"text\":\"bg\"},{\"tag\":\"KEYWORD3\",\"text\":\"borderwidth\"},{\"tag\":\"KEYWORD3\",\"text\":\"bd\"},{\"tag\":\"KEYWORD3\",\"text\":\"bitmap\"},{\"tag\":\"KEYWORD3\",\"text\":\"command\"},{\"tag\":\"KEYWORD3\",\"text\":\"cursor\"},{\"tag\":\"KEYWORD3\",\"text\":\"default\"},{\"tag\":\"KEYWORD3\",\"text\":\"expand\"},{\"tag\":\"KEYWORD3\",\"text\":\"family\"},{\"tag\":\"KEYWORD3\",\"text\":\"fg\"},{\"tag\":\"KEYWORD3\",\"text\":\"fill\"},{\"tag\":\"KEYWORD3\",\"text\":\"font\"},{\"tag\":\"KEYWORD3\",\"text\":\"force\"},{\"tag\":\"KEYWORD3\",\"text\":\"foreground\"},{\"tag\":\"KEYWORD3\",\"text\":\"from\"},{\"tag\":\"KEYWORD3\",\"text\":\"height\"},{\"tag\":\"KEYWORD3\",\"text\":\"icon\"},{\"tag\":\"KEYWORD3\",\"text\":\"question\"},{\"tag\":\"KEYWORD3\",\"text\":\"warning\"},{\"tag\":\"KEYWORD3\",\"text\":\"in\"},{\"tag\":\"KEYWORD3\",\"text\":\"ipadx\"},{\"tag\":\"KEYWORD3\",\"text\":\"ipady\"},{\"tag\":\"KEYWORD3\",\"text\":\"justify\"},{\"tag\":\"KEYWORD3\",\"text\":\"left\"},{\"tag\":\"KEYWORD3\",\"text\":\"center\"},{\"tag\":\"KEYWORD3\",\"text\":\"right\"},{\"tag\":\"KEYWORD3\",\"text\":\"length\"},{\"tag\":\"KEYWORD3\",\"text\":\"padx\"},{\"tag\":\"KEYWORD3\",\"text\":\"pady\"},{\"tag\":\"KEYWORD3\",\"text\":\"offvalue\"},{\"tag\":\"KEYWORD3\",\"text\":\"onvalue\"},{\"tag\":\"KEYWORD3\",\"text\":\"orient\"},{\"tag\":\"KEYWORD3\",\"text\":\"horizontal\"},{\"tag\":\"KEYWORD3\",\"text\":\"vertical\"},{\"tag\":\"KEYWORD3\",\"text\":\"outline\"},{\"tag\":\"KEYWORD3\",\"text\":\"oversrike\"},{\"tag\":\"KEYWORD3\",\"text\":\"relief\"},{\"tag\":\"KEYWORD3\",\"text\":\"raised\"},{\"tag\":\"KEYWORD3\",\"text\":\"sunken\"},{\"tag\":\"KEYWORD3\",\"text\":\"flat\"},{\"tag\":\"KEYWORD3\",\"text\":\"groove\"},{\"tag\":\"KEYWORD3\",\"text\":\"ridge\"},{\"tag\":\"KEYWORD3\",\"text\":\"solid\"},{\"tag\":\"KEYWORD3\",\"text\":\"screen\"},{\"tag\":\"KEYWORD3\",\"text\":\"selectbackground\"},{\"tag\":\"KEYWORD3\",\"text\":\"selectforeground\"},{\"tag\":\"KEYWORD3\",\"text\":\"setgrid\"},{\"tag\":\"KEYWORD3\",\"text\":\"side\"},{\"tag\":\"KEYWORD3\",\"text\":\"size\"},{\"tag\":\"KEYWORD3\",\"text\":\"slant\"},{\"tag\":\"KEYWORD3\",\"text\":\"left\"},{\"tag\":\"KEYWORD3\",\"text\":\"right\"},{\"tag\":\"KEYWORD3\",\"text\":\"top\"},{\"tag\":\"KEYWORD3\",\"text\":\"bottom\"},{\"tag\":\"KEYWORD3\",\"text\":\"spacing1\"},{\"tag\":\"KEYWORD3\",\"text\":\"spacing2\"},{\"tag\":\"KEYWORD3\",\"text\":\"spacing3\"},{\"tag\":\"KEYWORD3\",\"text\":\"state\"},{\"tag\":\"KEYWORD3\",\"text\":\"stipple\"},{\"tag\":\"KEYWORD3\",\"text\":\"takefocus\"},{\"tag\":\"KEYWORD3\",\"text\":\"tearoff\"},{\"tag\":\"KEYWORD3\",\"text\":\"textvariable\"},{\"tag\":\"KEYWORD3\",\"text\":\"title\"},{\"tag\":\"KEYWORD3\",\"text\":\"to\"},{\"tag\":\"KEYWORD3\",\"text\":\"type\"},{\"tag\":\"KEYWORD3\",\"text\":\"abortretryignore\"},{\"tag\":\"KEYWORD3\",\"text\":\"ok\"},{\"tag\":\"KEYWORD3\",\"text\":\"okcancel\"},{\"tag\":\"KEYWORD3\",\"text\":\"retrycancel\"},{\"tag\":\"KEYWORD3\",\"text\":\"yesno\"},{\"tag\":\"KEYWORD3\",\"text\":\"yesnocancel\"},{\"tag\":\"KEYWORD3\",\"text\":\"underline\"},{\"tag\":\"KEYWORD3\",\"text\":\"value\"},{\"tag\":\"KEYWORD3\",\"text\":\"variable\"},{\"tag\":\"KEYWORD3\",\"text\":\"weight\"},{\"tag\":\"KEYWORD3\",\"text\":\"width\"},{\"tag\":\"KEYWORD3\",\"text\":\"xscrollcommand\"},{\"tag\":\"KEYWORD3\",\"text\":\"yscrollcommand\"},{\"tag\":\"KEYWORD3\",\"text\":\"active\"},{\"tag\":\"KEYWORD3\",\"text\":\"add\"},{\"tag\":\"KEYWORD3\",\"text\":\"arc\"},{\"tag\":\"KEYWORD3\",\"text\":\"aspect\"},{\"tag\":\"KEYWORD3\",\"text\":\"bitmap\"},{\"tag\":\"KEYWORD3\",\"text\":\"cascade\"},{\"tag\":\"KEYWORD3\",\"text\":\"cget\"},{\"tag\":\"KEYWORD3\",\"text\":\"children\"},{\"tag\":\"KEYWORD3\",\"text\":\"class\"},{\"tag\":\"KEYWORD3\",\"text\":\"clear\"},{\"tag\":\"KEYWORD3\",\"text\":\"client\"},{\"tag\":\"KEYWORD3\",\"text\":\"create\"},{\"tag\":\"KEYWORD3\",\"text\":\"colormodel\"},{\"tag\":\"KEYWORD3\",\"text\":\"command\"},{\"tag\":\"KEYWORD3\",\"text\":\"configure\"},{\"tag\":\"KEYWORD3\",\"text\":\"deiconify\"},{\"tag\":\"KEYWORD3\",\"text\":\"delete\"},{\"tag\":\"KEYWORD3\",\"text\":\"disabled\"},{\"tag\":\"KEYWORD3\",\"text\":\"exists\"},{\"tag\":\"KEYWORD3\",\"text\":\"focusmodel\"},{\"tag\":\"KEYWORD3\",\"text\":\"flash\"},{\"tag\":\"KEYWORD3\",\"text\":\"forget\"},{\"tag\":\"KEYWORD3\",\"text\":\"geometry\"},{\"tag\":\"KEYWORD3\",\"text\":\"get\"},{\"tag\":\"KEYWORD3\",\"text\":\"group\"},{\"tag\":\"KEYWORD3\",\"text\":\"handle\"},{\"tag\":\"KEYWORD3\",\"text\":\"iconbitmap\"},{\"tag\":\"KEYWORD3\",\"text\":\"iconify\"},{\"tag\":\"KEYWORD3\",\"text\":\"iconmask\"},{\"tag\":\"KEYWORD3\",\"text\":\"iconname\"},{\"tag\":\"KEYWORD3\",\"text\":\"iconposition\"},{\"tag\":\"KEYWORD3\",\"text\":\"iconwindow\"},{\"tag\":\"KEYWORD3\",\"text\":\"idletasks\"},{\"tag\":\"KEYWORD3\",\"text\":\"insert\"},{\"tag\":\"KEYWORD3\",\"text\":\"interps\"},{\"tag\":\"KEYWORD3\",\"text\":\"itemconfigure\"},{\"tag\":\"KEYWORD3\",\"text\":\"invoke\"},{\"tag\":\"KEYWORD3\",\"text\":\"line\"},{\"tag\":\"KEYWORD3\",\"text\":\"mark\"},{\"tag\":\"KEYWORD3\",\"text\":\"maxsize\"},{\"tag\":\"KEYWORD3\",\"text\":\"minsize\"},{\"tag\":\"KEYWORD3\",\"text\":\"move\"},{\"tag\":\"KEYWORD3\",\"text\":\"name\"},{\"tag\":\"KEYWORD3\",\"text\":\"normal\"},{\"tag\":\"KEYWORD3\",\"text\":\"overrideredirect\"},{\"tag\":\"KEYWORD3\",\"text\":\"oval\"},{\"tag\":\"KEYWORD3\",\"text\":\"own\"},{\"tag\":\"KEYWORD3\",\"text\":\"photo\"},{\"tag\":\"KEYWORD3\",\"text\":\"polygon\"},{\"tag\":\"KEYWORD3\",\"text\":\"positionfrom\"},{\"tag\":\"KEYWORD3\",\"text\":\"propagate\"},{\"tag\":\"KEYWORD3\",\"text\":\"protocol\"},{\"tag\":\"KEYWORD3\",\"text\":\"ranges\"},{\"tag\":\"KEYWORD3\",\"text\":\"rectangle\"},{\"tag\":\"KEYWORD3\",\"text\":\"remove\"},{\"tag\":\"KEYWORD3\",\"text\":\"resizable\"},{\"tag\":\"KEYWORD3\",\"text\":\"separator\"},{\"tag\":\"KEYWORD3\",\"text\":\"slaves\"},{\"tag\":\"KEYWORD3\",\"text\":\"sizefrom\"},{\"tag\":\"KEYWORD3\",\"text\":\"state\"},{\"tag\":\"KEYWORD3\",\"text\":\"tag\"},{\"tag\":\"KEYWORD3\",\"text\":\"title\"},{\"tag\":\"KEYWORD3\",\"text\":\"transient\"},{\"tag\":\"KEYWORD3\",\"text\":\"window\"},{\"tag\":\"KEYWORD3\",\"text\":\"withdraw\"},{\"tag\":\"KEYWORD3\",\"text\":\"xview\"},{\"tag\":\"KEYWORD3\",\"text\":\"yview\"},{\"tag\":\"KEYWORD3\",\"text\":\"Activate\"},{\"tag\":\"KEYWORD3\",\"text\":\"Alt\"},{\"tag\":\"KEYWORD3\",\"text\":\"Any\"},{\"tag\":\"KEYWORD3\",\"text\":\"B1\"},{\"tag\":\"KEYWORD3\",\"text\":\"B2\"},{\"tag\":\"KEYWORD3\",\"text\":\"B3\"},{\"tag\":\"KEYWORD3\",\"text\":\"Button1\"},{\"tag\":\"KEYWORD3\",\"text\":\"Button2\"},{\"tag\":\"KEYWORD3\",\"text\":\"Button3\"},{\"tag\":\"KEYWORD3\",\"text\":\"ButtonPress\"},{\"tag\":\"KEYWORD3\",\"text\":\"ButtonRelease\"},{\"tag\":\"KEYWORD3\",\"text\":\"Double\"},{\"tag\":\"KEYWORD3\",\"text\":\"Circulate\"},{\"tag\":\"KEYWORD3\",\"text\":\"Colormap\"},{\"tag\":\"KEYWORD3\",\"text\":\"Configure\"},{\"tag\":\"KEYWORD3\",\"text\":\"Control\"},{\"tag\":\"KEYWORD3\",\"text\":\"Deactivate\"},{\"tag\":\"KEYWORD3\",\"text\":\"Escape\"},{\"tag\":\"KEYWORD3\",\"text\":\"Expose\"},{\"tag\":\"KEYWORD3\",\"text\":\"FocusIn\"},{\"tag\":\"KEYWORD3\",\"text\":\"FocusOut\"},{\"tag\":\"KEYWORD3\",\"text\":\"Gravity\"},{\"tag\":\"KEYWORD3\",\"text\":\"Key\"},{\"tag\":\"KEYWORD3\",\"text\":\"KeyPress\"},{\"tag\":\"KEYWORD3\",\"text\":\"KeyRelease\"},{\"tag\":\"KEYWORD3\",\"text\":\"Lock\"},{\"tag\":\"KEYWORD3\",\"text\":\"Meta\"},{\"tag\":\"KEYWORD3\",\"text\":\"Property\"},{\"tag\":\"KEYWORD3\",\"text\":\"Reparent\"},{\"tag\":\"KEYWORD3\",\"text\":\"Shift\"},{\"tag\":\"KEYWORD3\",\"text\":\"Unmap\"},{\"tag\":\"KEYWORD3\",\"text\":\"Visibility\"},{\"tag\":\"KEYWORD3\",\"text\":\"Button\"},{\"tag\":\"KEYWORD3\",\"text\":\"ButtonPress\"},{\"tag\":\"KEYWORD3\",\"text\":\"ButtonRelease\"},{\"tag\":\"KEYWORD3\",\"text\":\"Destroy\"},{\"tag\":\"KEYWORD3\",\"text\":\"Escape\"},{\"tag\":\"KEYWORD3\",\"text\":\"Enter\"},{\"tag\":\"KEYWORD3\",\"text\":\"Leave\"},{\"tag\":\"KEYWORD3\",\"text\":\"Motion\"},{\"tag\":\"KEYWORD3\",\"text\":\"MenuSelect\"},{\"tag\":\"KEYWORD3\",\"text\":\"Triple\"},{\"tag\":\"KEYWORD3\",\"text\":\"all\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TCL_COMMENT\",\"DEFAULT\":\"OPERATOR\"},\"child\":[{\"tag\":\"SEQ_REGEXP\",\"text\":\"#.*\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"DELEGATE\":\"MAIN\",\"HASH_CHAR\":\"#\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TCL_STRING\",\"DEFAULT\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\",\"NAME\":\"indentCloseBrackets\"}}]},{\"tag\":\"EOL_SPAN_REGEXP\",\"text\":\"\\\\\\\\$\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"\\\\\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"NULL\",\"DELEGATE\":\"MAIN\",\"HASH_CHAR\":\"$\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\$(\\\\w|::)+\\\\(\"},{\"tag\":\"END\",\"text\":\")\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"NULL\",\"DELEGATE\":\"MAIN\",\"HASH_CHAR\":\"$\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\$\\\\{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\$(\\\\w|::)+\",\"attrs\":{\"TYPE\":\"NULL\",\"HASH_CHAR\":\"$\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"[\"},{\"tag\":\"END\",\"text\":\"]\"}]},{\"tag\":\"SEQ\",\"text\":\"\\\\a\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\b\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\f\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\n\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\r\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\t\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\v\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}