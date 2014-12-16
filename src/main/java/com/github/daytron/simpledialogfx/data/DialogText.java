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
 * List of default window titles for the dialogs.
 *
 * @author Ryan Gilera
 */
public enum DialogText {

    /**
     * Confirmation Dialog window title
     */
    CONFIRMATION_HEAD_TITLE("Confirmation Dialog"),
    /**
     * Error Dialog window title
     */
    ERROR_HEAD_TITLE("Error Dialog"),
    /**
     * Information Dialog window title
     */
    INFO_HEAD_TITLE("Information Dialog"),
    /**
     * Warning Dialog window title
     */
    WARNING_HEAD_TITLE("Warning Dialog");

    private String text;

    private DialogText(String text) {
        this.text = text;
    }

    /**
     * Retrieve text value
     *
     * @return The <code>String</code> object as the text.
     */
    public String getText() {
        return text;
    }

}