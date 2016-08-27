/*
 * This file is part of the ThreatModeling SDK.
 *
 * ThreatModeling SDK is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * ThreatModeling SDK is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * ThreatModeling SDK. If not, see http://www.gnu.org/licenses/.
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
}
