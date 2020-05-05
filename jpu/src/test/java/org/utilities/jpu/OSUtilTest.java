package org.utilities.jpu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class OSUtilTest {

    @Test
    public void getExecutionPath() {
        assertFalse(OSUtil.getExecutionPath().isEmpty());
    }
}