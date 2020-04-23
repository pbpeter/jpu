package org.utilities.jpu;

import org.junit.Test;
import org.utilities.jpu.OSProperties;

import static org.junit.Assert.*;

public class OSPropertiesTest {

    @Test
    public void operatingSystemsValueTest() {
        assertEquals("NAME", OSProperties.NAME.name());
        assertEquals("VERSION", OSProperties.VERSION.name());
        assertEquals("COUNTRY", OSProperties.COUNTRY.name());
        assertEquals("LANGUAGE", OSProperties.LANGUAGE.name());
        assertEquals("JAVA_VERSION", OSProperties.JAVA_VERSION.name());
        assertEquals("FILE_SEPARATOR", OSProperties.FILE_SEPARATOR.name());
    }

    @Test
    public void testPropertyName() {
        assertFalse(OSProperties.NAME.getValue().isEmpty());
    }

    @Test
    public void testPropertyVersion() {
        assertFalse(OSProperties.VERSION.getValue().isEmpty());
    }

    @Test
    public void testPropertyCountry() {
        assertFalse(OSProperties.COUNTRY.getValue().isEmpty());
    }

    @Test
    public void testPropertyLanguage() {
        assertFalse(OSProperties.LANGUAGE.getValue().isEmpty());
    }

    @Test
    public void testPropertyJavaVersion() {
        assertFalse(OSProperties.JAVA_VERSION.getValue().isEmpty());
    }

    @Test
    public void testPropertyFileSeparator() {
        assertFalse(OSProperties.FILE_SEPARATOR.getValue().isEmpty());
    }
}