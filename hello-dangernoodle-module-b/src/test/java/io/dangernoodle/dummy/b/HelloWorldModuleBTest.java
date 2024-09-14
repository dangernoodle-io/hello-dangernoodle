package io.dangernoodle.dummy.b;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldModuleBTest
{
    private HelloWorldModuleB moduleB;
    @BeforeEach
    public void setup()
    {
        moduleB = new HelloWorldModuleB();
    }

    @Test
    public void testFoo()
    {
        assertTrue(moduleB.isBaz());
    }

}
