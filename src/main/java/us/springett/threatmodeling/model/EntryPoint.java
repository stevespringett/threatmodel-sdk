/*
 * This file is part of the ThreatModeling SDK.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.springett.threatmodeling.model;

import java.util.List;

/**
 * Entry points define the interfaces through which potential attackers can
 * interact with the application or system to supply it with data. In order
 * for a potential attacker perform a successful attack, entry points must
 * exist.
 *
 * @since 1.0.0
 */
public class EntryPoint {

    private String id;
    private String name;
    private String description;
    private List<TrustLevel> trustLevels;

    /**
     * Returns the unique ID of the entry point.
     * @return the unique ID of the entry point.
     * @since 1.0.0
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the entry point.
     * @param id the unique ID of the entry point.
     * @since 1.0.0
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns a brief name of the entry point.
     * @return a brief name of the entry point.
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the entry point.
     * @param name a brief name of the entry point.
     * @since 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a textual description detailing the interaction or processing that occurs at the entry point.
     * @return a textual description detailing the interaction or processing that occurs at the entry point.
     * @since 1.0.0
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a textual description detailing the interaction or processing that occurs at the entry point.
     * @param description a textual description detailing the interaction or processing that occurs at the entry point.
     * @since 1.0.0
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the level of access required at the entry point.
     * @return the level of access required at the entry point.
     * @since 1.0.0
     */
    public List<TrustLevel> getTrustLevels() {
        return trustLevels;
    }

    /**
     * Sets the level of access required at the entry point.
     * @param trustLevels the level of access required at the entry point.
     * @since 1.0.0
     */
    public void setTrustLevels(List<TrustLevel> trustLevels) {
        this.trustLevels = trustLevels;
    }
}
