/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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
package org.drools.bpmn2;

import java.util.Map;
import org.kie.kogito.UserTask;

@UserTask(taskName = "GDX task 2", processName = "GDXProcess")
public class GDXProcess_3_TaskInput {

    public static GDXProcess_3_TaskInput fromMap(Map<String, Object> params) {
        GDXProcess_3_TaskInput item = new GDXProcess_3_TaskInput();
        return item;
    }
}
// Task input for user task 'GDX task 2' in process 'GDXProcess'
