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

public class Asset {

    private String id;
    private String name;
    private String description;

    /**
     * Return the unique ID of the threat.
     * @return the unique ID of the threat.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the threat.
     * @param id the unique ID of the threat.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns a brief name of the asset.
     * @return a brief name of the asset.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the asset.
     * @param name a brief name of the asset.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a detailed description of the asset.
     * @return a detailed description of the asset.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a detailed description of the asset.
     * @param description a detailed description of the asset.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
