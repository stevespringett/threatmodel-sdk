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

/**
 * An interface that defines a common way to parse tool-specific threat models.
 *
 * @since 1.0.0
 */
public interface IParser {

    /**
     * Parses a tool-specific threat model and returns a normalized,
     * vendor-neutral ThreatModel object.
     * @param file the threat model file to parse
     * @return a normalized, vendor-neutral ThreatModel object
     * @throws ParseException thrown if errors are encountered with parsing the threat model
     * @since 1.0.0
     */
    ThreatModel parse(File file) throws ParseException;

}
