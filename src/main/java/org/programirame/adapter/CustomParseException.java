package org.programirame.adapter;

/**
 * Our custom exception we throw when there is any parse exception.
 *
 */
public class CustomParseException extends Exception {

    public CustomParseException(String s, NumberFormatException e) {
        super(s, e);
    }
}
