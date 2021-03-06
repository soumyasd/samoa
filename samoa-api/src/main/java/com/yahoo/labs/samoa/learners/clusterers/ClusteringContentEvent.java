package com.yahoo.labs.samoa.learners.clusterers;

/*
 * #%L
 * SAMOA
 * %%
 * Copyright (C) 2013 Yahoo! Inc.
 * %%
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
 * #L%
 */
import com.yahoo.labs.samoa.core.ContentEvent;
import com.yahoo.labs.samoa.instances.Instance;
import net.jcip.annotations.Immutable;

/**
 * The Class ClusteringContentEvent.
 */
@Immutable
final public class ClusteringContentEvent implements ContentEvent {

    private static final long serialVersionUID = -7746983521296618922L;
    private Instance instance;
    private boolean isLast = false;
    private String key;

    public ClusteringContentEvent() {
        // Necessary for kryo serializer
    }

    /**
     * Instantiates a new clustering event.
     *
     * @param index the index
     * @param instance the instance
     * @param isTraining the is training
     */
    public ClusteringContentEvent(long index, Instance instance) {
        /*if (instance != null) {
         this.instance = new SerializableInstance(instance);
         }*/
        this.instance = instance;
        this.setKey(Long.toString(index));
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public boolean isLastEvent() {
        return this.isLast;
    }

    void setLast(boolean isLast) {
        this.isLast = isLast;
    }

    Instance getInstance() {
        return this.instance;
    }
}
