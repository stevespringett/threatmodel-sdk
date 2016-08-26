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

import java.util.List;

public class ThreatModel {

    private String id;
    private String name;
    private String assumptions;
    private List<String> contributors;
    private String owner;
    private String reviewer;
    private List<Threat> threats;
    private Object nativeThreatModel;

    /**
     * Returns the unique ID of the threat model.
     * @return the unique ID of the threat model.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID of the threat model.
     * @param id the unique ID of the threat model.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns a brief name of the asset threat model.
     * @return a brief name of the asset threat model.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the asset threat model.
     * @param name a brief name of the asset threat model.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a summary of assumptions that were made during the creation of the threat model.
     * @return a summary of assumptions that were made during the creation of the threat model.
     */
    public String getAssumptions() {
        return assumptions;
    }

    /**
     * Sets a summary of assumptions that were made during the creation of the threat model.
     * @param assumptions a summary of assumptions that were made during the creation of the threat model.
     */
    public void setAssumptions(String assumptions) {
        this.assumptions = assumptions;
    }

    /**
     * Returns a list of contributors to the threat model.
     * @return a list of contributors to the threat model.
     */
    public List<String> getContributors() {
        return contributors;
    }

    /**
     * Sets the list of contributors to the threat model.
     * @param contributors a list of contributors to the threat model.
     */
    public void setContributors(List<String> contributors) {
        this.contributors = contributors;
    }

    /**
     * Returns the owner of the threat modeling document.
     * @return the owner of the threat modeling document.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the threat modeling document.
     * @param owner the owner of the threat modeling document.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Returns the individual who responsible for reviewing the threat modeling document.
     * @return the individual who responsible for reviewing the threat modeling document.
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * Set the individual who responsible for reviewing the threat modeling document.
     * @param reviewer the individual who responsible for reviewing the threat modeling document.
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * Returns a list of threats identified during the threat modeling exercise.
     * @return a list of threats identified during the threat modeling exercise.
     */
    public List<Threat> getThreats() {
        return threats;
    }

    /**
     * Sets a list of threats identified during the threat modeling exercise.
     * @param threats a list of threats identified during the threat modeling exercise.
     */
    public void setThreats(List<Threat> threats) {
        this.threats = threats;
    }

    /**
     * Returns an object representing the threat modeling tool's native object type. This
     * object may be desired if additional metadata or content from the native object is not
     * represented by the ThreatModel SDK object model.
     * @return an Object specific to the threat modeling tool used.
     */
    public Object getNativeThreatModel() {
        return nativeThreatModel;
    }

    /**
     * Set an object representing the threat modeling tool's native object type. This
     * object may be desired if additional metadata or content from the native object is not
     * represented by the ThreatModel SDK object model.
     * @param nativeThreatModel an Object specific to the threat modeling tool used.
     */
    public void setNativeThreatModel(Object nativeThreatModel) {
        this.nativeThreatModel = nativeThreatModel;
    }
}
