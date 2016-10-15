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
 * SPOOFING:
 * Spoofing is when a process or entity is something other than its claimed
 * identity. Examples include substituting a process, a file, website or a
 * network address.
 *
 * TAMPERING:
 * Tampering is the act of altering the bits. Tampering with a process
 * involves changing bits in the running process. Similarly, Tampering with
 * a data flow involves changing bits on the wire or between two running
 * processes.
 *
 * REPUDIATION:
 * Repudiation threats involve an adversary denying that something happened.
 *
 * INFORMATION DISCLOSURE:
 * Information disclosure happens when the information can be read by an
 * unauthorized party.
 *
 * DENIAL OF SERVICE:
 * Denial of Service happens when the process or a datastore is not able
 * to service incoming requests or perform up to spec.
 *
 * ELEVATION OF PRIVILEGE:
 * A user subject gains increased capability or privilege by taking
 * advantage of an implementation bug.
 *
 * ABUSE:
 * Abuse is when a legitimate user violates the terms of use for the
 * system without violating a system security policy.
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
