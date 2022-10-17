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

package java.lang;
public final class StackTraceElement implements java.io.Serializable {
	public java.lang.String getClassName() { return null; }
	public java.lang.String getFileName() { return null; }
	public int getLineNumber() { return 0; }
	public java.lang.String getMethodName() { return null; }
	public boolean isNativeMethod() { return false; }
	private StackTraceElement() { } /* generated constructor to prevent compiler adding default public constructor */
}

