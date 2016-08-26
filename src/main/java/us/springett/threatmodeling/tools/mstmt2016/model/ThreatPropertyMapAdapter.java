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

public class ThreatPropertyMapAdapter extends XmlAdapter<ThreatPropertyMapAdapter.KeyValueOfStringString, Map<String, String>> {

    @XmlRootElement(name = "KeyValueOfstringstring", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    static class KeyValueOfStringString {
        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
        String key;

        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
        String value;
    }

    @Override
    public Map<String, String> unmarshal(KeyValueOfStringString keyValuePair) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put(keyValuePair.key, keyValuePair.value);
        return map;
    }

    @Override
    public KeyValueOfStringString marshal(Map<String, String> map) throws Exception {
        KeyValueOfStringString keyValuePair = new KeyValueOfStringString();
        for(Map.Entry<String, String> mapEntry : map.entrySet()) {
            keyValuePair.key = mapEntry.getKey();
            keyValuePair.value = mapEntry.getValue();
        }
        return keyValuePair;
    }
}