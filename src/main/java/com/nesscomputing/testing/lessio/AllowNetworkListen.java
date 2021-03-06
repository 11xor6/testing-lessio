/**
 * Copyright (C) 2011-2012 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nesscomputing.testing.lessio;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Under the regime of {@link LessIOSecurityManager}, only classes annotated
 * with this annotation may listen to an IP port. {@link #ports()} is the list
 * of allowed ports.  0 stands for "any ephemeral port" which defaults to
 * <code>32768 - 65535</code>, inclusive.  This may be adjusted via the Java properties
 * <code>kawala.testing.low-ephemeral-port</code> and <code>kawala.testing.high-ephemeral-port</code>
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface AllowNetworkListen {
  int[] ports();
}
