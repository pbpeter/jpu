package org.utilities.jpu;

import static org.utilities.jpu.OSUtil.isUnix;

public class OSFormatter {

    private final static String LINE_BREAK_WIN = "\r\n";
    private final static String LINE_BREAK_UNIX = "\n";
    // TODO: Das muss überarbeitet werden, wenn so viele Systeme berücksichtigt werden können.
    public final static String LINE_BREAK = isUnix() ? LINE_BREAK_UNIX : LINE_BREAK_WIN;

}
