package org.utilities.jpu;

public class OSUtil {

    private static final String OS_NAME = OSProperties.NAME.getValue();

    public static boolean isWindows() {
        return OS_NAME.contains("win");
    }

    public static boolean isUnix() {
        return OS_NAME.contains("nix") || OS_NAME.contains("nux") || OS_NAME.contains("aix");
    }

    public static boolean isMac() {
        return (OS_NAME.contains("mac"));
    }

    public static boolean isSolaris() {
        return (OS_NAME.contains("sunos"));
    }

}
