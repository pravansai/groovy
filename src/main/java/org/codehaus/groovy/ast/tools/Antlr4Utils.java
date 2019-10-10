/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.codehaus.groovy.ast.tools;

import org.apache.groovy.parser.antlr4.Antlr4ParserPlugin;
import org.apache.groovy.parser.antlr4.Antlr4PluginFactory;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.ParserPluginFactory;

public class Antlr4Utils {
    private Antlr4Utils() {
    }

    public static ClassNode parse(String option, CompilerConfiguration configuration) {
        Antlr4PluginFactory antlr4PluginFactory = (Antlr4PluginFactory) ParserPluginFactory.antlr4(configuration);
        Antlr4ParserPlugin antlr4ParserPlugin = (Antlr4ParserPlugin) antlr4PluginFactory.createParserPlugin();
        return antlr4ParserPlugin.makeType(option);
    }
}