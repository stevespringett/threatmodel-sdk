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
package us.springett.threatmodeling;

import us.springett.threatmodeling.exception.ParseException;
import us.springett.threatmodeling.model.ThreatModel;
import java.io.File;

/**
 * Convenience class that creates normalized ThreatModel objects from
 * vendor-specific threat models.
 *
 * @since 1.0.0
 */
public class ThreatModelFactory {

    /**
     * Factory method that executes the correct vendor-specific parser.
     * @param file the threat model to parse
     * @param tool the vendor-specific tool the threat model was created in
     * @return a normalized ThreatModel object
     * @throws ParseException thrown if errors are encountered with parsing the threat model
     * @since 1.0.0
     */
    public ThreatModel parse(File file, ThreatModelingTool tool) throws ParseException {
        if (!file.exists() || !file.isFile()) {
            throw new ParseException("ThreatModel file does not exist.");
        }

        if (ThreatModelingTool.MICROSOFT_THREAT_MODELING_TOOL_2016 == tool) {
            IParser parser = new us.springett.threatmodeling.tools.mstmt2016.Parser();
            return parser.parse(file);
        }
        return null;
    }

}
