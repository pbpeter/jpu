package org.utilities.jpu;

/**
 * Use the enum to get the system properties of your operating system.
 * Properties list is here: https://docs.oracle.com/javase/7/docs/api/java/lang/System.html#getProperties()
 */
public enum OSProperties {

    NAME("os.name"),
    VERSION("os.version"),
    COUNTRY("user.country"),
    LANGUAGE("user.language"),
    JAVA_VERSION("java.version"),
    FILE_SEPARATOR("file.separator");

    private String value;

    OSProperties(String key) {
        try {
            this.value = System.getProperty(key);
        } catch (SecurityException ex) {
            this.value = "n/a";
        }
    }

    /**
     * @return System property of the key
     */
    public String getValue() {
        return value;
    }
}
