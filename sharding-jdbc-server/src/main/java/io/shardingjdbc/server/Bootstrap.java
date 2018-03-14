/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.server;

/**
 * Sharding-JDBC Server Bootstrap.
 *
 * @author zhangliang
 */
public final class Bootstrap {
    
    private static final int DEFAULT_PORT = 3307;
    
    /**
     * Main Entrance.
     * 
     * @param args startup arguments.
     * @throws InterruptedException interrupted exception
     */
    // CHECKSTYLE:OFF
    public static void main(final String[] args) throws InterruptedException {
        // CHECKSTYLE:ON
        new ShardingJDBCServer().start(getPort(args));
    }
    
    private static int getPort(final String[] args) {
        if (0 == args.length) {
            return DEFAULT_PORT;
        }
        try {
            return Integer.parseInt(args[0]);
        } catch (final NumberFormatException ex) {
            return DEFAULT_PORT;
        }
    }
}
