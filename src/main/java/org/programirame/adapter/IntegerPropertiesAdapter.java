package org.programirame.adapter;

import java.util.Properties;

/**
 * Adapter that adapts the {@link Properties} class to return int values instead of {@link String} values.
 *
 */
public class IntegerPropertiesAdapter {
    private Properties properties;

    public IntegerPropertiesAdapter(Properties properties) {
        this.properties = properties;
    }

    /**
     * Get the int value of the property with the given key.
     *
     * @param key key of the property
     * @return int representation of the value
     * @throws CustomParseException in case the value could not be parsed into {@code String}.
     */
    public int getProperty(String key) throws CustomParseException {
        try {
            return Integer.parseInt(properties.getProperty(key));

        } catch(NumberFormatException e) {
            throw new CustomParseException("Problem parsing property", e);
        }
    }
}
