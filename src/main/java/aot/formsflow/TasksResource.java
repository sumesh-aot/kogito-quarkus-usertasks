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

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

//@Path("/tasks")
public class TasksResource {

    private Set<Task> tasks = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public TasksResource() {
        tasks.add(new Task("Apple", "Winter fruit"));
        tasks.add(new Task("Pineapple", "Tropical fruit"));
    }

    @GET
    public Set<Task> list() {
        return tasks;
    }

    @POST
    public Set<Task> add(Task fruit) {
        tasks.add(fruit);
        return tasks;
    }

    @DELETE
    public Set<Task> delete(Task fruit) {
        tasks.removeIf(existingFruit -> existingFruit.name.contentEquals(fruit.name));
        return tasks;
    }
}
