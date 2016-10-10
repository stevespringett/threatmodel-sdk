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
 * The system must have something that the attacker is interested in; these
 * items/areas of interest are defined as assets. Assets are essentially threat
 * targets, i.e. they are the reason threats will exist. Assets can be both
 * physical assets and abstract assets.
 *
 * @since 1.0.0
 */
public class Asset {

    private String id;
    private String name;
    private String description;

    /**
     * Return the unique ID of the threat.
     * @return the unique ID of the threat.
     * @since 1.0.0
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the threat.
     * @param id the unique ID of the threat.
     * @since 1.0.0
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Fluent interface for {@link #setId(String)}
     * @since 1.0.0
     */
    public Asset id(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns a brief name of the asset.
     * @return a brief name of the asset.
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the asset.
     * @param name a brief name of the asset.
     * @since 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Fluent interface for {@link #setName(String)}
     * @since 1.0.0
     */
    public Asset name(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a detailed description of the asset.
     * @return a detailed description of the asset.
     * @since 1.0.0
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a detailed description of the asset.
     * @param description a detailed description of the asset.
     * @since 1.0.0
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Fluent interface for {@link #setDescription(String)}}
     * @since 1.0.0
     */
    public Asset description(String description) {
        setDescription(description);
        return this;
    }
}
