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

/**
 * Trust levels represent the access rights that the application will grant
 * to external entities. The trust levels are used by entry points and assets.
 * This provides the ability to define the access rights or privileges required
 * at each entry point, and those required to interact with each asset.
 *
 * @since 1.0.0
 */
public class TrustLevel {

    private String id;
    private String name;
    private String description;

    /**
     * Returns the unique ID of the trust level.
     * @return the unique ID of the trust level.
     * @since 1.0.0
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the trust level.
     * @param id the unique ID of the trust level.
     * @since 1.0.0
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns a descriptive name that allows you to identify the external entities that have been granted this trust level.
     * @return a descriptive name that allows you to identify the external entities that have been granted this trust level.
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a descriptive name that allows you to identify the external entities that have been granted this trust level.
     * @param name a descriptive name that allows you to identify the external entities that have been granted this trust level.
     * @since 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a textual description of the trust level detailing the external entity who has been granted the trust level.
     * @return a textual description of the trust level detailing the external entity who has been granted the trust level.
     * @since 1.0.0
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a textual description of the trust level detailing the external entity who has been granted the trust level.
     * @param description a textual description of the trust level detailing the external entity who has been granted the trust level.
     * @since 1.0.0
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
