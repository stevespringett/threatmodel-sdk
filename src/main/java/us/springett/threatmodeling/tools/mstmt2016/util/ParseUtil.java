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
package us.springett.threatmodeling.tools.mstmt2016.util;

import us.springett.threatmodeling.model.Risk;
import us.springett.threatmodeling.model.Stride;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatInstance;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatType;
import java.util.Map;

public class ParseUtil {

    public static ThreatType lookupThreatType(ThreatModel nativeModel, ThreatInstance threatInstance) {
        if (threatInstance.getTypeId() == null) {
            return null;
        }
        for (ThreatType threatType: nativeModel.getKnowledgeBase().getThreatTypes()) {
            if (threatType.getId().equals(threatInstance.getTypeId())) {
                return threatType;
            }
        }
        return null;
    }

    public static Stride lookupClassification(ThreatType threatType) {
        if (threatType == null) {
            return null;
        }
        switch (threatType.getCategory()) {
            case "S":
                return Stride.SPOOFING;
            case "T":
                return Stride.TAMPERING;
            case "R":
                return Stride.REPUDIATION;
            case "I":
                return Stride.INFORMATION_DISCLOSURE;
            case "D":
                return Stride.DENIAL_OF_SERVICE;
            case "E":
                return Stride.ELEVATION_OF_PRIVILEGE;
            case "A":
                return Stride.ABUSE;
        }
        return null;
    }

    public static Risk lookupRisk(ThreatInstance threatInstance) {
        switch (threatInstance.getPriority()) {
            case "Critical":
                return Risk.CRITICAL;
            case "High":
                return Risk.HIGH;
            case "Medium":
                return Risk.MEDIUM;
            case "Low":
                return Risk.LOW;
        }
        return null;
    }

    /**
     * The default template in MS TMT 2016 has a number of 'user' defined properties
     * that can be retrieved via this method. Some of the default properties are:
     * <pre>
     * Title
     * UserThreatCategory
     * UserThreatShortDescription
     * UserThreatDescription
     * StateInformation
     * InteractionString
     * Priority
     * </pre>
     * Simply specifying these names as the Key will retrieve the relevant value from
     * the specified ThreatInstance. Returns null if property cannot be found.
     */
    public static String lookupPropertyValueByKey(ThreatInstance threatInstance, String key) {
        for (Map<String, String> map : threatInstance.getProperties()) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
        }
        return null;
    }

    public static boolean isMitigated(ThreatInstance threatInstance) {
        return "Mitigated".equals(threatInstance.getState());
    }

}
