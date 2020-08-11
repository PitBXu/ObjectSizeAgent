package com.corey.jvm.agent;

import java.lang.instrument.Instrumentation;

/**
 * @package: com.corey.jvm.agent
 * @date: 2020-08-11 17:09
 * @author: corey.yang
 */
public class ObjectSizeAgent {
    private static Instrumentation inst;

    public static void premain(String agentArgs, Instrumentation _inst) {
        inst = _inst;
    }

    public static long sizeOf(Object o) {
        return inst.getObjectSize(o);
    }
}
