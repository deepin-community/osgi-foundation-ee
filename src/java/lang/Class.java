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
public final class Class implements java.io.Serializable {
	public boolean desiredAssertionStatus() { return false; }
	public static java.lang.Class forName(java.lang.String var0) throws java.lang.ClassNotFoundException { return null; }
	public static java.lang.Class forName(java.lang.String var0, boolean var1, java.lang.ClassLoader var2) throws java.lang.ClassNotFoundException { return null; }
	public java.lang.ClassLoader getClassLoader() { return null; }
	public java.lang.Class[] getClasses() { return null; }
	public java.lang.Class getComponentType() { return null; }
	public java.lang.reflect.Constructor getConstructor(java.lang.Class[] var0) throws java.lang.NoSuchMethodException { return null; }
	public java.lang.reflect.Constructor[] getConstructors() { return null; }
	public java.lang.Class[] getDeclaredClasses() { return null; }
	public java.lang.reflect.Constructor getDeclaredConstructor(java.lang.Class[] var0) throws java.lang.NoSuchMethodException { return null; }
	public java.lang.reflect.Constructor[] getDeclaredConstructors() { return null; }
	public java.lang.reflect.Field getDeclaredField(java.lang.String var0) throws java.lang.NoSuchFieldException { return null; }
	public java.lang.reflect.Field[] getDeclaredFields() { return null; }
	public java.lang.reflect.Method getDeclaredMethod(java.lang.String var0, java.lang.Class[] var1) throws java.lang.NoSuchMethodException { return null; }
	public java.lang.reflect.Method[] getDeclaredMethods() { return null; }
	public java.lang.Class getDeclaringClass() { return null; }
	public java.lang.reflect.Field getField(java.lang.String var0) throws java.lang.NoSuchFieldException { return null; }
	public java.lang.reflect.Field[] getFields() { return null; }
	public java.lang.Class[] getInterfaces() { return null; }
	public java.lang.reflect.Method getMethod(java.lang.String var0, java.lang.Class[] var1) throws java.lang.NoSuchMethodException { return null; }
	public java.lang.reflect.Method[] getMethods() { return null; }
	public int getModifiers() { return 0; }
	public java.lang.String getName() { return null; }
	public java.lang.Package getPackage() { return null; }
	public java.security.ProtectionDomain getProtectionDomain() { return null; }
	public java.net.URL getResource(java.lang.String var0) { return null; }
	public java.io.InputStream getResourceAsStream(java.lang.String var0) { return null; }
	public java.lang.Object[] getSigners() { return null; }
	public java.lang.Class getSuperclass() { return null; }
	public boolean isArray() { return false; }
	public boolean isAssignableFrom(java.lang.Class var0) { return false; }
	public boolean isInstance(java.lang.Object var0) { return false; }
	public boolean isInterface() { return false; }
	public boolean isPrimitive() { return false; }
	public java.lang.Object newInstance() throws java.lang.IllegalAccessException, java.lang.InstantiationException { return null; }
	private Class() { } /* generated constructor to prevent compiler adding default public constructor */
}

