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
 * External dependencies are items external to the application of system being threat modeled
 * that may still pose a threat. External dependencies are typically still within the control
 * of an organization, but possibly outside of the control of development or operations team.
 *
 * @since 1.0.0
 */
public class ExternalDependency {

    private String id;
    private String description;

    /**
     * Returns the unique ID of the external dependency.
     * @return the unique ID of the external dependency.
     * @since 1.0.0
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the external dependency.
     * @param id the unique ID of the external dependency.
     * @since 1.0.0
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Fluent interface for {@link #setId(String)}
     * @since 1.0.0
     */
    public ExternalDependency id(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns the textual description of the external dependency.
     * @return the textual description of the external dependency.
     * @since 1.0.0
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the textual description of the external dependency.
     * @param description the textual description of the external dependency.
     * @since 1.0.0
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Fluent interface for {@link #setDescription(String)}
     * @since 1.0.0
     */
    public ExternalDependency description(String description) {
        setDescription(description);
        return this;
    }
}
