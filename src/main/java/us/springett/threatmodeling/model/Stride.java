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
 * The Stride threat classification system developed by Microsoft and later
 * implemented by many organizations.
 *
 * @since 1.0.0
 */
public enum Stride implements ThreatClassification {

    SPOOFING,
    TAMPERING,
    REPUDIATION,
    INFORMATION_DISCLOSURE,
    DENIAL_OF_SERVICE,
    ELEVATION_OF_PRIVILEGE,
    ABUSE

}
