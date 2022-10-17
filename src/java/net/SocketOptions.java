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

package java.net;
public abstract interface SocketOptions {
	public abstract java.lang.Object getOption(int var0) throws java.net.SocketException;
	public abstract void setOption(int var0, java.lang.Object var1) throws java.net.SocketException;
	public final static int IP_MULTICAST_IF = 16;
	public final static int IP_MULTICAST_IF2 = 31;
	public final static int IP_MULTICAST_LOOP = 18;
	public final static int IP_TOS = 3;
	public final static int SO_BINDADDR = 15;
	public final static int SO_BROADCAST = 32;
	public final static int SO_KEEPALIVE = 8;
	public final static int SO_LINGER = 128;
	public final static int SO_OOBINLINE = 4099;
	public final static int SO_RCVBUF = 4098;
	public final static int SO_REUSEADDR = 4;
	public final static int SO_SNDBUF = 4097;
	public final static int SO_TIMEOUT = 4102;
	public final static int TCP_NODELAY = 1;
}

