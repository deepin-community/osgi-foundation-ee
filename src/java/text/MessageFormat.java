/*
 * $Revision: 6107 $
 *
 * (C) Copyright 2001 Sun Microsystems, Inc.
 * Copyright (c) OSGi Alliance (2001, 2008). All Rights Reserved.
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

package java.text;
public class MessageFormat extends java.text.Format {
	public MessageFormat(java.lang.String var0) { }
	public MessageFormat(java.lang.String var0, java.util.Locale var1) { }
	public void applyPattern(java.lang.String var0) { }
	public final java.lang.StringBuffer format(java.lang.Object var0, java.lang.StringBuffer var1, java.text.FieldPosition var2) { return null; }
	public static java.lang.String format(java.lang.String var0, java.lang.Object[] var1) { return null; }
	public final java.lang.StringBuffer format(java.lang.Object[] var0, java.lang.StringBuffer var1, java.text.FieldPosition var2) { return null; }
	public java.text.Format[] getFormats() { return null; }
	public java.text.Format[] getFormatsByArgumentIndex() { return null; }
	public java.util.Locale getLocale() { return null; }
	public java.lang.Object[] parse(java.lang.String var0) throws java.text.ParseException { return null; }
	public java.lang.Object[] parse(java.lang.String var0, java.text.ParsePosition var1) { return null; }
	public java.lang.Object parseObject(java.lang.String var0, java.text.ParsePosition var1) { return null; }
	public void setFormat(int var0, java.text.Format var1) { }
	public void setFormatByArgumentIndex(int var0, java.text.Format var1) { }
	public void setFormats(java.text.Format[] var0) { }
	public void setFormatsByArgumentIndex(java.text.Format[] var0) { }
	public void setLocale(java.util.Locale var0) { }
	public java.lang.String toPattern() { return null; }
	public static class Field extends java.text.Format.Field {
		protected Field(java.lang.String var0) { super((java.lang.String) null); }
		public final static java.text.MessageFormat.Field ARGUMENT; static { ARGUMENT = null; }
	}
}

