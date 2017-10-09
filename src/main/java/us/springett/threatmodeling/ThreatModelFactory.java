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
package us.springett.threatmodeling;

import us.springett.threatmodeling.exception.ParseException;
import us.springett.threatmodeling.model.ThreatModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Convenience class that creates normalized ThreatModel objects from
 * vendor-specific threat models.
 *
 * @since 1.0.0
 */
public class ThreatModelFactory {

    /**
     * Factory method that executes the correct vendor-specific parser.
     *
     * @param inputStream the threat model to parse
     * @param tool the vendor-specific tool the threat model was created in
     * @return a normalized ThreatModel object
     * @throws ParseException thrown if errors are encountered with parsing the
     * threat model
     * @since 1.0.1
     */
    public ThreatModel parse(InputStream inputStream, ThreatModelingTool tool) throws ParseException {
        if (ThreatModelingTool.MICROSOFT_THREAT_MODELING_TOOL_2016 == tool) {
            IParser parser = new us.springett.threatmodeling.tools.mstmt2016.Parser();
            return parser.parse(inputStream);
        }
        return null;
    }

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

        try (InputStream inputStream = new FileInputStream(file)) {
            return this.parse(inputStream, tool);
        } catch (IOException e) {
            throw new ParseException("ThreatModel could not be processed.");
        }
    }

}
