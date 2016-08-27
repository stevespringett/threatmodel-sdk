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
