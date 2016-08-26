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
package us.springett.threatmodeling.tools.mstmt2016;

import us.springett.threatmodeling.IParser;
import us.springett.threatmodeling.exception.ParseException;
import us.springett.threatmodeling.model.ThreatModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public final class Parser implements IParser {

    public ThreatModel parse(File file) throws ParseException {
        try {
            // Parse the native threat model
            JAXBContext jaxbContext = JAXBContext.newInstance(us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel nativeModel =
                    (us.springett.threatmodeling.tools.mstmt2016.model.ThreatModel) unmarshaller.unmarshal(file);

            // Create a new threat model object
            ThreatModel threatModel = new ThreatModel();

            // Add the native threat model object format to the threat model object
            threatModel.setNativeThreatModel(nativeModel);

            // Query the native model and set the threat model object with the values


            return threatModel;

        } catch (JAXBException e) {
            throw new ParseException(e);
        }
    }

}
