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

import us.springett.threatmodeling.ThreatModelFactory;
import us.springett.threatmodeling.ThreatModelingTool;
import us.springett.threatmodeling.exception.ParseException;
import us.springett.threatmodeling.model.Asset;
import us.springett.threatmodeling.model.Threat;
import us.springett.threatmodeling.model.ThreatModel;
import java.io.File;

/**
 * Sample console application that parses a Microsoft Threat Modeling Tool 2016
 * file and prints all threats and assets to the system console.
 */
public class tmconsole {

    public static void main(String args[]) throws Exception {
        tmconsole tmconsole = new tmconsole();
        if (args.length != 1) {
            System.out.println("Usage: tmconsole /path/to/threatmodel.tm7");
            System.exit(1);
        }
        tmconsole.parseAndDisplay(new File(args[0]));
    }

    public void parseAndDisplay(File file) throws ParseException {
        // Parse the specified threat model
        ThreatModel threatModel = new ThreatModelFactory()
                .parse(file, ThreatModelingTool.MICROSOFT_THREAT_MODELING_TOOL_2016);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Threat Model Metadata");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Model Name:     " + threatModel.getName());
        System.out.println("Description:    " + threatModel.getDescription());
        System.out.println("Contributors:   " + threatModel.getContributors());
        System.out.println("Assumptions:    " + threatModel.getAssumptions());
        System.out.println("Owner:          " + threatModel.getOwner());
        System.out.println("Reviewer:       " + threatModel.getReviewer());
        System.out.println("# of Threats:   " + threatModel.getThreats().size());
        System.out.println("# of Assets:    " + threatModel.getAssets().size());
        System.out.println("\n");


        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Analyzed Threats");
        System.out.println("-------------------------------------------------------------------------------");
        // Iterate through all threats and print some info to the console
        for (Threat threat: threatModel.getThreats()) {
            System.out.println("Threat Name:    " + threat.getName());
            System.out.println("Description:    " + threat.getDescription());
            System.out.println("Classification: " + threat.getThreatClassification().toString());
            System.out.println("Severity:       " + threat.getRisk());
            System.out.println("Mitigated:      " + threat.isMitigated());
            System.out.println("\n");
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Assets Defined");
        System.out.println("-------------------------------------------------------------------------------");
        // Iterate through all assets and print some info to the console
        for (Asset asset: threatModel.getAssets()) {
            System.out.println("Asset Name:     " + asset.getName());
            System.out.println("Description:    " + asset.getDescription());
            System.out.println("Out of Scope:   " + asset.isOutOfScope());
            System.out.println("\n");
        }
    }
}
