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
 * A theoretical event with the potential to adversely impact an asset through
 * unauthorized access, destruction, disclosure, modification of data, and/or
 * denial of service.
 *
 * @since 1.0.0
 */
public class Threat {

    private String id;
    private String name;
    private String description;
    private ThreatClassification threatClassification;
    private Risk risk;
    private CWE cwe;
    private boolean mitigated;
    private String knownMitigation;
    private String investigationNotes;
    private String entryPoints;
    private List<Asset> assets;

    /**
     * Returns the unique ID of the threat.
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
     * Returns a brief name of the asset threat.
     * @return a brief name of the asset threat.
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a brief name of the asset threat.
     * @param name a brief name of the asset threat.
     * @since 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a detailed description of the threat and its importance.
     * @return a detailed description of the threat and its importance.
     * @since 1.0.0
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a detailed description of the threat and its importance.
     * @param description a detailed description of the threat and its importance.
     * @since 1.0.0
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns how the threat is classified.
     * @return how the threat is classified.
     * @since 1.0.0
     */
    public ThreatClassification getThreatClassification() {
        return threatClassification;
    }

    /**
     * Sets how the threat is classified.
     * @param threatClassification how the threat is classified.
     * @since 1.0.0
     */
    public void setThreatClassification(ThreatClassification threatClassification) {
        this.threatClassification = threatClassification;
    }

    /**
     * Returns the risk of the threat
     * @return the risk of the threat
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Sets the risk of the threat
     * @param risk the risk of the threat
     */
    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    /**
     * Returns the Common Weakness Enumeration (CWE) identifier of the threat.
     * @return the Common Weakness Enumeration (CWE) identifier of the threat.
     * @since 1.0.0
     */
    public CWE getCWE() {
        return cwe;
    }

    /**
     * Sets the the Common Weakness Enumeration (CWE) identifier of the threat.
     * @param cwe the Common Weakness Enumeration (CWE) identifier of the threat.
     * @since 1.0.0
     */
    public void setCWE(CWE cwe) {
        this.cwe = cwe;
    }

    /**
     * Returns if the threat has been mitigated or has mitigating controls.
     * @return a boolean indicating if the threat has been mitigated or has mitigating controls.
     * @since 1.0.0
     */
    public boolean isMitigated() {
        return mitigated;
    }

    /**
     * Sets whether or not the threat has been mitigated or has mitigating controls.
     * @param mitigated a boolean indicating if the threat has been mitigated or has mitigating controls.
     * @since 1.0.0
     */
    public void setMitigated(boolean mitigated) {
        this.mitigated = mitigated;
    }

    /**
     * Returns how is the threat being protected and by what means.
     * @return how is the threat being protected and by what means.
     * @since 1.0.0
     */
    public String getKnownMitigation() {
        return knownMitigation;
    }

    /**
     * Sets how is the threat being protected and by what means.
     * @param knownMitigation how is the threat being protected and by what means.
     * @since 1.0.0
     */
    public void setKnownMitigation(String knownMitigation) {
        this.knownMitigation = knownMitigation;
    }

    /**
     * Returns what is known about this threat thus far.
     * @return what is known about this threat thus far.
     * @since 1.0.0
     */
    public String getInvestigationNotes() {
        return investigationNotes;
    }

    /**
     * Sets what is known about this threat thus far.
     * @param investigationNotes what is known about this threat thus far.
     * @since 1.0.0
     */
    public void setInvestigationNotes(String investigationNotes) {
        this.investigationNotes = investigationNotes;
    }

    /**
     * Returns the possible means of entry the adversary has.
     * @return the possible means of entry the adversary has.
     * @since 1.0.0
     */
    public String getEntryPoints() {
        return entryPoints;
    }

    /**
     * Sets the possible means of entry the adversary has.
     * @param entryPoints the possible means of entry the adversary has.
     * @since 1.0.0
     */
    public void setEntryPoints(String entryPoints) {
        this.entryPoints = entryPoints;
    }

    /**
     * Returns a list of Assets that could be damaged by this threat.
     * @return a list of Assets that could be damaged by this threat.
     * @since 1.0.0
     */
    public List<Asset> getAssets() {
        return assets;
    }

    /**
     * Sets a list of Assets that could be damaged by this threat.
     * @param assets a list of Assets that could be damaged by this threat.
     * @since 1.0.0
     */
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
