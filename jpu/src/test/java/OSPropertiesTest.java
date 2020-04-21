import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertTrue(OSProperties.NAME.getValue().length() > 0);
    }

    @Test
    public void testPropertyVersion() {
        assertTrue(OSProperties.VERSION.getValue().length() > 0);
    }

    @Test
    public void testPropertyCountry() {
        assertTrue(OSProperties.COUNTRY.getValue().length() > 0);
    }

    @Test
    public void testPropertyLanguage() {
        assertTrue(OSProperties.LANGUAGE.getValue().length() > 0);
    }

    @Test
    public void testPropertyJavaVersion() {
        assertTrue(OSProperties.JAVA_VERSION.getValue().length() > 0);
    }

    @Test
    public void testPropertyFileSeparator() {
        assertTrue(OSProperties.FILE_SEPARATOR.getValue().length() > 0);
    }
}