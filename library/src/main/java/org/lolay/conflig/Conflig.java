/*
 * Copyright 2010 Lolay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lolay.conflig;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public interface Conflig {
    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     */
    String getString(String key, String defaultValue, Locale locale);

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @return The found value or <code>null</code> if not found
     */
    String getString(String key, String defaultValue);

    /**
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     */
    String getString(String key, Locale locale);
    
    /**
     * @param key The key to be retrieved.
     * @return value The found value or <code>null</code> if not found
     */
    String getString(String key);

    /**
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as an Integer.
     */
    Integer getInteger(String key, Locale locale) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as an Integer.
     */
    Integer getInteger(String key) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as an Integer.
     */
    Integer getInteger(String key, Integer defaultValue) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as an Integer.
     */
    Integer getInteger(String key, Integer defaultValue, Locale locale) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Long.
     */
    Long getLong(String key, Locale locale) throws NumberFormatException;
    
    /**
     * @param key The key to be retrieved.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Long.
     */
    Long getLong(String key) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Long.
     */
    Long getLong(String key, Long defaultValue, Locale locale) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Long.
     */
    Long getLong(String key, Long defaultValue) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Float.
     */
    Float getFloat(String key, Locale locale) throws NumberFormatException;
    
    /**
     * @param key The key to be retrieved.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Float.
     */
    Float getFloat(String key) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Float.
     */
    Float getFloat(String key, Float defaultValue, Locale locale) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Float.
     */
    Float getFloat(String key, Float defaultValue) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Double.
     */
    Double getDouble(String key, Locale locale) throws NumberFormatException;
    
    /**
     * @param key The key to be retrieved.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Double.
     */
    Double getDouble(String key) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Double.
     */
    Double getPropertyDouble(String key, Double defaultValue, Locale locale) throws NumberFormatException;

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @return The found value or <code>null</code> if not found
     * @throws NumberFormatException If the value cannot be interpreted as a Double.
     */
    Double getDouble(String key, Double defaultValue) throws NumberFormatException;

    /**
     * Gets a list from a property where the value is configured as a comma separated list. 
     * i.e., key=value1, value2, value3... Will ignore leading spaces, trailing spaces, empty
     * spaces, trailing commas.
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The list of string values, or <code>null<code> if the key can't be found
     */
    List<String> getList(String key, Locale locale);
    
    /**
     * Gets a list from a property where the value is configured as a comma separated list. 
     * i.e., key=value1, value2, value3... Will ignore leading spaces, trailing spaces, empty
     * spaces, trailing commas.
     * @param key The key to be retrieved.
     * @return The list of string values, or <code>null<code> if the key can't be found
     */
    List<String> getList(String key);
    
    /**
     * Gets a list from a property where the value is configured as a delimiter separated list. 
     * i.e., key=value1, value2, value3... Will ignore leading spaces, trailing spaces, empty
     * spaces, trailing commas. Spring.split() is used therefore the delimiter is used as a regular expression.
     * Therefore, choose your delimiter carefully (don't use on that has special meaning in a regular
     * expression). colon(:), pound(#), comma(,), tilde(~) are good ones to choose from.
     * @param key The key to be retrieved.
     * @param delimiter The delimiter instead of a comma.
     * @param locale The localized version of the property if one is specified.
     * @return The list of string values, or <code>null<code> if the key can't be found
     */
    List<String> getList(String key, String delimiter, Locale locale);

    /**
     * Gets a list from a property where the value is configured as a delimiter separated list. 
     * i.e., key=value1, value2, value3... Will ignore leading spaces, trailing spaces, empty
     * spaces, trailing commas. Spring.split() is used therefore the delimiter is used as a regular expression.
     * Therefore, choose your delimiter carefully (don't use on that has special meaning in a regular
     * expression). colon(:), pound(#), comma(,), tilde(~) are good ones to choose from.
     * @param key The key to be retrieved.
     * @param delimiter The delimiter instead of a comma.
     * @return The list of string values, or <code>null<code> if the key can't be found
     */
    List<String> getList(String key, String delimiter);

    /**
     * Gets a map from a property where the value is configured as a delimiter separated list of
     * delimiter separated pairs. key=key1:value1,key2:value2:key3:value3.
     * Will ignore leading spaces, trailing spaces for key names. Empty spaces will
     * result in a null value for a key.
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The map of string values, or <code>null<code> if the key can't be found
     */
    Map<String, String> getMap(String key, Locale locale);
    
    /**
     * Gets a map from a property where the value is configured as a delimiter separated list of
     * delimiter separated pairs. key=key1:value1,key2:value2:key3:value3.
     * Will ignore leading spaces, trailing spaces for key names. Empty spaces will
     * result in a null value for a key.
     * @param key The key to be retrieved.
     * @return The map of string values, or <code>null<code> if the key can't be found
     */
    Map<String, String> getMap(String key);

    /**
     * Gets a map from a property where the value is configured as a delimiter separated list of
     * delimiter separated pairs. key=key1:value1,key2:value2:key3:value3.
     * Will ignore leading spaces, trailing spaces for key names. Empty spaces will
     * result in a null value for a key. Spring.split() is used therefore the delimiter is used as
     * a regular expression. Therefore, choose your delimiter carefully (don't use on that has
     * special meaning in a regular expression). colon(:), pound(#), comma(,), tilde(~) are good
     * ones to choose from.
     * @param key The key to be retrieved.
     * @param delimiter The delimiter instead of a comma.
     * @param keyValueDelimeter The delimiter for key/values instead of a colon.
     * @param locale The localized version of the property if one is specified.
     * @return The map of string values, or <code>null<code> if the key can't be found
     */
    Map<String, String> getMap(String key, String delimiter, String keyValueDelimiter, Locale locale);
    
    /**
     * Gets a map from a property where the value is configured as a delimiter separated list of
     * delimiter separated pairs. key=key1:value1,key2:value2:key3:value3.
     * Will ignore leading spaces, trailing spaces for key names. Empty spaces will
     * result in a null value for a key. Spring.split() is used therefore the delimiter is used as
     * a regular expression. Therefore, choose your delimiter carefully (don't use on that has
     * special meaning in a regular expression). colon(:), pound(#), comma(,), tilde(~) are good
     * ones to choose from.
     * @param key The key to be retrieved.
     * @param delimiter The delimiter instead of a comma.
     * @param keyValueDelimeter The delimiter for key/values instead of a colon.
     * @return The map of string values, or <code>null<code> if the key can't be found
     */
    Map<String, String> getMap(String key, String delimiter, String keyValueDelimiter);

    /**
     * Gets a boolean property that uses the Boolean.parseBoolean to interpret the value.
     * @param key The key to be retrieved.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     */
    Boolean getBoolean(String key, Locale locale);

    /**
     * @param key The key to be retrieved.
     * @return The found value or <code>null</code> if not found
     */
    Boolean getBoolean(String key);

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @param locale The localized version of the property if one is specified.
     * @return The found value or <code>null</code> if not found
     */
    Boolean getBoolean(String key, Boolean defaultValue, Locale locale);

    /**
     * @param key The key to be retrieved.
     * @param defaultValue A default value if the key is not found.
     * @return The found value or <code>null</code> if not found
     */
    Boolean getBoolean(String key, Boolean defaultValue);

    /**
     * @param locale The locale to return.
     * @return A set of all keys configured for that locale (including non-locale keys)
     */
    Set<String> getKeys(Locale locale);
    
    /**
     * @return A set of all keys not associated with a specific locale
     */
    Set<String> getKeys();
}