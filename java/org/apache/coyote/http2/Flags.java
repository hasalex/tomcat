/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.coyote.http2;

class Flags {

    private Flags() {
        // Utility class. Hide default constructor
    }


    static boolean isEndOfStream(int flags) {
        return (flags & 0x01) > 0;
    }


    static boolean isAck(int flags) {
        return (flags & 0x01) > 0;
    }


    static boolean isEndOfHeaders(int flags) {
        return (flags & 0x04) > 0;
    }


    static boolean hasPadding(int flags) {
        return (flags & 0x08) > 0;
    }


    static boolean hasPriority(int flags) {
        return (flags & 0x20) > 0;
    }
}
