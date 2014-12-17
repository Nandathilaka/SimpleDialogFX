/* 
 * The MIT License
 *
 * Copyright 2014 Ryan Gilera.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.daytron.simpledialogfx.data;

/**
 * List of FXML files.
 *
 * @author Ryan Gilera ryangilera@gmail.com
 */
public enum Fxml {

    /**
     * Confirmation Dialog FXML file path
     */
    CONFIRMATION_DIALOG("/fxml/ConfirmationDialog.fxml"),
    /**
     * Information Dialog FXML file path
     */
    INFO_DIALOG("/fxml/InfoDialog.fxml"),
    /**
     * Warning Dialog FXML file path
     */
    WARNING_DIALOG("/fxml/WarningDialog.fxml"),
    /**
     * Error Dialog FXML file path
     */
    ERROR_DIALOG("/fxml/ErrorDialog.fxml"),
    /**
     * Generic OK Dialog FXML file path
     */
    OK_DIALOG("/fxml/GenericOKDialog.fxml");

    private final String path;

    private Fxml(String msg) {
        this.path = msg;
    }

    /**
     * Retrieve the FXML file path
     *
     * @return The <code>String</code> object as file path
     */
    public String getPath() {
        return path;
    }
}
