package us.craigmiller160.github.actions.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void test_sayHello() {
        final var hello = new Hello();
        assertEquals("Hello World", hello.sayHello());
    }
}
