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

public class Threat {

    private String id;
    private String name;
    private String description;
    private ThreatClassification threatClassification;
    private int cweId;
    private boolean mitigated;
    private String knownMitigation;
    private String investigationNotes;
    private String entryPoints;
    private List<Asset> assets;

    /**
     * Returns the unique ID of the threat.
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
     * Returns a brief name of the asset threat.
     * @return a brief name of the asset threat.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the asset threat.
     * @param name a brief name of the asset threat.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a detailed description of the threat and its importance.
     * @return a detailed description of the threat and its importance.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a detailed description of the threat and its importance.
     * @param description a detailed description of the threat and its importance.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns how the threat is classified.
     * @return how the threat is classified.
     */
    public ThreatClassification getThreatClassification() {
        return threatClassification;
    }

    /**
     * Sets how the threat is classified.
     * @param threatClassification how the threat is classified.
     */
    public void setThreatClassification(ThreatClassification threatClassification) {
        this.threatClassification = threatClassification;
    }

    /**
     * Returns the Common Weakness Enumeration (CWE) identifier of the threat.
     * @return the Common Weakness Enumeration (CWE) identifier of the threat.
     */
    public int getCweId() {
        return cweId;
    }

    /**
     * Sets the the Common Weakness Enumeration (CWE) identifier of the threat.
     * @param cweId the Common Weakness Enumeration (CWE) identifier of the threat.
     */
    public void setCweId(int cweId) {
        this.cweId = cweId;
    }

    /**
     * Returns if the threat has been mitigated or has mitigating controls.
     * @return a boolean indicating if the threat has been mitigated or has mitigating controls.
     */
    public boolean isMitigated() {
        return mitigated;
    }

    /**
     * Sets whether or not the threat has been mitigated or has mitigating controls.
     * @param mitigated a boolean indicating if the threat has been mitigated or has mitigating controls.
     */
    public void setMitigated(boolean mitigated) {
        this.mitigated = mitigated;
    }

    /**
     * Returns how is the threat being protected and by what means.
     * @return how is the threat being protected and by what means.
     */
    public String getKnownMitigation() {
        return knownMitigation;
    }

    /**
     * Sets how is the threat being protected and by what means.
     * @param knownMitigation how is the threat being protected and by what means.
     */
    public void setKnownMitigation(String knownMitigation) {
        this.knownMitigation = knownMitigation;
    }

    /**
     * Returns what is known about this threat thus far.
     * @return what is known about this threat thus far.
     */
    public String getInvestigationNotes() {
        return investigationNotes;
    }

    /**
     * Sets what is known about this threat thus far.
     * @param investigationNotes what is known about this threat thus far.
     */
    public void setInvestigationNotes(String investigationNotes) {
        this.investigationNotes = investigationNotes;
    }

    /**
     * Returns the possible means of entry the adversary has.
     * @return the possible means of entry the adversary has.
     */
    public String getEntryPoints() {
        return entryPoints;
    }

    /**
     * Sets the possible means of entry the adversary has.
     * @param entryPoints the possible means of entry the adversary has.
     */
    public void setEntryPoints(String entryPoints) {
        this.entryPoints = entryPoints;
    }

    /**
     * Returns a list of Assets that could be damaged by this threat.
     * @return a list of Assets that could be damaged by this threat.
     */
    public List<Asset> getAssets() {
        return assets;
    }

    /**
     * Sets a list of Assets that could be damaged by this threat.
     * @param assets a list of Assets that could be damaged by this threat.
     */
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
