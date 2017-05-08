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
package us.springett.threatmodeling.exception;

/**
 * Exception for when parsing vendor-specific threat models fails.
 *
 * @since 1.0.0
 */
public class ParseException extends Exception {

    /**
     * Creates a new ParseException.
     * @param message the message describing the reason for the exception
     * @since 1.0.0
     */
    public ParseException(String message) {
        super(message);
    }

    /**
     * Creates a new ParseException.
     * @param cause the exception that caused the parse exception
     * @since 1.0.0
     */
    public ParseException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new ParseException.
     * @param message the message describing the reason for the exception
     * @param cause the exception that caused the parse exception
     * @since 1.0.0
     */
    public ParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
