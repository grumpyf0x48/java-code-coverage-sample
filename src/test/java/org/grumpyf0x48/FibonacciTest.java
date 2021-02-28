package org.grumpyf0x48;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class FibonacciTest
{
    private Fibonacci fibonacci = Fibonacci.getInstance();

    @Test
    public void test0()
    {
        Assert.assertEquals(1, fibonacci.fibonacci(0));
    }

    @Test
    public void test1()
    {
        Assert.assertEquals(1, fibonacci.fibonacci(1));
    }

    // Replace the following @Ignore annotations by @Test to improve the coverage
    @Ignore
    public void test2()
    {
        Assert.assertEquals(2, fibonacci.fibonacci(2));
    }

    @Ignore
    public void test3()
    {
        Assert.assertEquals(3, fibonacci.fibonacci(3));
    }

    @Ignore
    public void test4()
    {
        Assert.assertEquals(5, fibonacci.fibonacci(4));
    }
}
