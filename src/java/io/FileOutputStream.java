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

package java.io;
public class FileOutputStream extends java.io.OutputStream {
	public FileOutputStream(java.io.File var0) throws java.io.FileNotFoundException { }
	public FileOutputStream(java.io.File var0, boolean var1) throws java.io.FileNotFoundException { }
	public FileOutputStream(java.io.FileDescriptor var0) { }
	public FileOutputStream(java.lang.String var0) throws java.io.FileNotFoundException { }
	public FileOutputStream(java.lang.String var0, boolean var1) throws java.io.FileNotFoundException { }
	protected void finalize() throws java.io.IOException { }
	public final java.io.FileDescriptor getFD() throws java.io.IOException { return null; }
	public void write(int var0) throws java.io.IOException { }
}

