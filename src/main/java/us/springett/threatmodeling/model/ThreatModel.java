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
 * The root level object for a threat model and/or threat modeling exercise.
 *
 * @since 1.0.0
 */
public class ThreatModel {

    private String id;
    private String name;
    private String description;
    private String assumptions;
    private String contributors;
    private String owner;
    private String reviewer;
    private List<ExternalDependency> externalDependencies;
    private List<EntryPoint> entryPoints;
    private List<Asset> assets;
    private List<Threat> threats;
    private Object nativeThreatModel;

    /**
     * Returns the unique ID of the threat model.
     * @return the unique ID of the threat model.
     * @since 1.0.0
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the threat model.
     * @param id the unique ID of the threat model.
     * @since 1.0.0
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns a brief name of the asset threat model.
     * @return a brief name of the asset threat model.
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the asset threat model.
     * @param name a brief name of the asset threat model.
     * @since 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a high-level description of the threat model.
     * @return a high-level description of the threat model.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a high-level description of the threat model.
     * @param description a high-level description of the threat model.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns a summary of assumptions that were made during the creation of the threat model.
     * @return a summary of assumptions that were made during the creation of the threat model.
     * @since 1.0.0
     */
    public String getAssumptions() {
        return assumptions;
    }

    /**
     * Sets a summary of assumptions that were made during the creation of the threat model.
     * @param assumptions a summary of assumptions that were made during the creation of the threat model.
     * @since 1.0.0
     */
    public void setAssumptions(String assumptions) {
        this.assumptions = assumptions;
    }

    /**
     * Returns the contributors to the threat model.
     * @return the contributors to the threat model.
     * @since 1.0.0
     */
    public String getContributors() {
        return contributors;
    }

    /**
     * Sets the contributors to the threat model.
     * @param contributors the contributors to the threat model.
     * @since 1.0.0
     */
    public void setContributors(String contributors) {
        this.contributors = contributors;
    }

    /**
     * Returns the owner of the threat modeling document.
     * @return the owner of the threat modeling document.
     * @since 1.0.0
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the threat modeling document.
     * @param owner the owner of the threat modeling document.
     * @since 1.0.0
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Returns the individual who responsible for reviewing the threat modeling document.
     * @return the individual who responsible for reviewing the threat modeling document.
     * @since 1.0.0
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * Set the individual who responsible for reviewing the threat modeling document.
     * @param reviewer the individual who responsible for reviewing the threat modeling document.
     * @since 1.0.0
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * Returns a list of external dependencies.
     * @return a list of external dependencies.
     * @since 1.0.0
     */
    public List<ExternalDependency> getExternalDependencies() {
        return externalDependencies;
    }

    /**
     * Sets a list of external dependencies.
     * @param externalDependencies a list of external dependencies.
     * @since 1.0.0
     */
    public void setExternalDependencies(List<ExternalDependency> externalDependencies) {
        this.externalDependencies = externalDependencies;
    }

    /**
     * Returns a list of entry points.
     * @return a list of entry points.
     * @since 1.0.0
     */
    public List<EntryPoint> getEntryPoints() {
        return entryPoints;
    }

    /**
     * Sets a list of entry points.
     * @param entryPoints a list of entry points.
     * @since 1.0.0
     */
    public void setEntryPoints(List<EntryPoint> entryPoints) {
        this.entryPoints = entryPoints;
    }

    /**
     * Returns a list of assets.
     * @return a list of assets.
     * @since 1.0.0
     */
    public List<Asset> getAssets() {
        return assets;
    }

    /**
     * Sets a list of assets.
     * @param assets a list of assets.
     * @since 1.0.0
     */
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    /**
     * Returns a list of threats identified during the threat modeling exercise.
     * @return a list of threats identified during the threat modeling exercise.
     * @since 1.0.0
     */
    public List<Threat> getThreats() {
        return threats;
    }

    /**
     * Sets a list of threats identified during the threat modeling exercise.
     * @param threats a list of threats identified during the threat modeling exercise.
     * @since 1.0.0
     */
    public void setThreats(List<Threat> threats) {
        this.threats = threats;
    }

    /**
     * Returns an object representing the threat modeling tool's native object type. This
     * object may be desired if additional metadata or content from the native object is not
     * represented by the ThreatModel SDK object model.
     * @return an Object specific to the threat modeling tool used.
     * @since 1.0.0
     */
    public Object getNativeThreatModel() {
        return nativeThreatModel;
    }

    /**
     * Set an object representing the threat modeling tool's native object type. This
     * object may be desired if additional metadata or content from the native object is not
     * represented by the ThreatModel SDK object model.
     * @param nativeThreatModel an Object specific to the threat modeling tool used.
     * @since 1.0.0
     */
    public void setNativeThreatModel(Object nativeThreatModel) {
        this.nativeThreatModel = nativeThreatModel;
    }
}
