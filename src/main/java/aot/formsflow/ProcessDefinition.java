/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package aot.formsflow;

public class ProcessDefinition {
    public String name;
    public String id;
    public String type;
    public String version;

    public ProcessDefinition(String id, String name, String version, String type) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.type = type;
    }

    public ProcessDefinition() {
    }

}
