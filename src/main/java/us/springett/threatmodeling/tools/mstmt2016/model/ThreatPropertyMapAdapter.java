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