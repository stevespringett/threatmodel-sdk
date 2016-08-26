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
package us.springett.threatmodeling.tools.mstmt2016.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;

public class ThreatMapAdapter extends XmlAdapter<ThreatMapAdapter.KeyValueOfStringThreats, Map<String, ThreatInstance>> {


    @XmlRootElement(name = "KeyValueOfstringThreatpc_P0_PhOB")
    static class KeyValueOfStringThreats {
        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
        String key;

        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
        ThreatInstance value;
    }

    @Override
    public Map<String, ThreatInstance> unmarshal(KeyValueOfStringThreats keyValuePair) throws Exception {
        Map<String, ThreatInstance> map = new HashMap<String, ThreatInstance>();
        map.put(keyValuePair.key, keyValuePair.value);
        return map;
    }

    @Override
    public KeyValueOfStringThreats marshal(Map<String, ThreatInstance> map) throws Exception {
        KeyValueOfStringThreats keyValuePair = new KeyValueOfStringThreats();
        for(Map.Entry<String, ThreatInstance> mapEntry : map.entrySet()) {
            keyValuePair.key = mapEntry.getKey();
            keyValuePair.value = mapEntry.getValue();
        }
        return keyValuePair;
    }
}