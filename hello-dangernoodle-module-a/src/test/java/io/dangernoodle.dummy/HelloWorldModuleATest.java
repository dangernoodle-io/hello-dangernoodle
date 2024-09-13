package io.dangernoodle.dummy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldModuleATest
{
    private HelloWorldModuleA moduleA;

    @BeforeEach
    public void setup()
    {
        moduleA = new HelloWorldModuleA();
    }

    @Test
    public void testFoo()
    {
        assertTrue(moduleA.foo());
    }
}
