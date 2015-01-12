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
 * List of dialog types
 *
 * @author Ryan Gilera
 */
public enum DialogType {

    /**
     * Confirmation dialog
     */
    CONFIRMATION,
    /**
     * Information dialog
     */
    INFORMATION,
    /**
     * Warning dialog
     */
    WARNING,
    /**
     * Error dialog
     */
    ERROR,
    /**
     * Exception dialog
     */
    EXCEPTION,
    /**
     * Input text dialog
     */
    INPUT_TEXT,
    /**
     * Generic OK dialog
     */
    GENERIC_OK,
    /**
     * Generic OK and CANCEL dialog
     */
    GENERIC_OK_CANCEL,
    /**
     * Generic YES and NO dialog
     */
    GENERIC_YES_NO;
}