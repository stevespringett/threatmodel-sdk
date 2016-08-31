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

public enum Risk {

    CRITICAL,
    HIGH,
    MEDIUM,
    LOW;

    enum Likelihood {
        HIGH,
        MEDIUM,
        LOW
    }

    enum Impact {
        HIGH,
        MEDIUM,
        LOW
    }

    /**
     * Attempts to calculate risk based on the values of Likelihood of a
     * threat occurring and the impact it would have should it occur.
     *
     * <pre>
     *                  +----------+----------+----------+
     *                  |          |          |          |
     *   High      L    |  Medium  |   High   | Critical |
     *             i    |          |          |          |
     *             k    +----------+----------+----------+
     *             e    |          |          |          |
     *   Medium    l    |    Low   |  Medium  |   High   |
     *             i    |          |          |          |
     *             h    +----------+----------+----------+
     *             o    |          |          |          |
     *   Low       o    |    Low   |    Low   |  Medium  |
     *             d    |          |          |          |
     *                  +----------+----------+----------+
     *
     *                              I m p a c t
     *
     *                       Low      Medium      High
     * </pre>
     *
     * @param likelihood the likelihood of a treat occurring
     * @param impact the impact the threat would have should it occur
     * @return a Risk rating of the threat (Critical, High, Medium, and Low)
     */
    public Risk calculate(Likelihood likelihood, Impact impact) {
        if (Likelihood.HIGH == likelihood && Impact.HIGH == impact) {
            return Risk.CRITICAL;
        } else if (
                (Likelihood.HIGH == likelihood && Impact.MEDIUM == impact) ||
                (Likelihood.MEDIUM == likelihood && Impact.HIGH == impact)) {
            return Risk.HIGH;
        } else if (
                (Likelihood.HIGH == likelihood && Impact.LOW == impact) ||
                (Likelihood.LOW == likelihood && Impact.HIGH == impact) ||
                (Likelihood.MEDIUM == likelihood && Impact.MEDIUM == impact)) {
            return Risk.MEDIUM;
        } else {
            return Risk.LOW;
        }
    }
}
