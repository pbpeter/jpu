package org.utilities.jpu;

import java.io.File;

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

    /**
     * On platforms could differ program location and program execution.
     *
     * @return path of program execution (String)
     */
    public static String getExecutionPath() {
        return new File(
                ClassLoader.getSystemClassLoader().getResource(".").getPath()).getAbsolutePath();
    }
}
