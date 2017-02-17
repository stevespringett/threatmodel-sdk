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

import us.springett.threatmodeling.model.*;
import us.springett.threatmodeling.tools.mstmt2016.model.*;
import us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public static List<Asset> lookupAssets(ThreatModel threatModel) {
        List<Asset> assets = new ArrayList<>();

        DrawingSurfaceList dsl = threatModel.getDrawingSurfaceList();
        if (dsl == null) return assets;

        DrawingSurfaceModel dsm = dsl.getDrawingSurfaceModel();
        if (dsm == null) return assets;

        for (Border border: dsm.getBorders()) {
            Asset asset = new Asset();
            asset.setId(border.getKey());
            if (border.getValue() != null && border.getValue().getAnyTypes() != null) {
                for (Border.AnyType anytype: border.getValue().getAnyTypes()) {
                    if (anytype.getDisplayName() != null && anytype.getDisplayName().equals("Name")) {
                        asset.setName(anytype.getValue().trim());
                    } else if (anytype.getDisplayName() != null && anytype.getDisplayName().equals("Out Of Scope")) {
                        asset.setOutOfScope(Boolean.parseBoolean(anytype.getValue()));
                    }
                }
            }
            assets.add(asset);
        }
        return assets;
    }

    public static Map<String, Asset> mapAssetsByIds(List<Asset> assets) {
        Map<String, Asset> idAssetMap = new HashMap<>();
        for (Asset asset : assets) {
            idAssetMap.put(asset.getId(),asset);
        }
        return idAssetMap;
    }

    public static Map<String, DataFlow> mapDataflowsByIds(List<DataFlow> dataFlows) {
        Map<String, DataFlow> idDataFlowMap = new HashMap<>();
        for (DataFlow asset : dataFlows) {
            idDataFlowMap.put(asset.getId(),asset);
        }
        return idDataFlowMap;
    }

    public static List<Asset> lookupTargetAsset(List<Asset> assets, ThreatInstance ti) {
        List<Asset> assetList = new ArrayList<Asset>();
        assetList.add(mapAssetsByIds(assets).get(ti.getTargetGuid()));
        return assetList;
    }

    public static ThreatState lookupState(ThreatInstance ti) {
        ThreatState state;
        try {
            state = ThreatState.fromString(ti.getState());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid threat state: ["+ti.getState()+"]");
        }
        return state;
    }

    public static List<DataFlow> lookupDataFlows(ThreatModel nativeModel) {
        List<DataFlow> dataFlows = new ArrayList<>();
        for (Line line : nativeModel.getDrawingSurfaceList().getDrawingSurfaceModel().getLines()) {
            //The first item in the AnyTypes is the name that's displayed.
            dataFlows.add(new DataFlow(line.getKey(),line.getValue().getAnyTypes().get(0).getDisplayName()));
        }
        return dataFlows;
    }

    public static DataFlow lookupAssociatedDataFlows(List<Asset> assets, List<DataFlow> dataFlows, ThreatInstance ti) {
        String interactionKey[] = ti.getInteractionKey().trim().split(":");
        String sourceId = interactionKey[0];
        String dataFlowId = interactionKey[1];
        String targetId = interactionKey[2];
        Map<String,Asset> idToAssetMap = mapAssetsByIds(assets);
        DataFlow dataFlow = mapDataflowsByIds(dataFlows).get(dataFlowId);
        dataFlow.setSource(idToAssetMap.get(sourceId));
        dataFlow.setDestination(idToAssetMap.get(targetId));
        return dataFlow;
    }

}
