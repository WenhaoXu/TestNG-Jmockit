package com.example.demo;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserControllorTest {
    @Test(priority = 1, invocationCount = 3)
    public void test1() {
        System.out.println("invoke test1");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :"+ i);
    }

    @DataProvider(name="testMethodDataProvider")
    public Object[][] testMethodDataProvider() {
        return new Object[][]{{"value1-1", "value2-1"}, {"value1-2", "value2-2"}, {"value1-3", "value2-3"}};
    }

    @Test(dataProvider="testMethodDataProvider")
    public void test(String arg1, String arg2) {
        System.out.println("use @DataProvider to fill method argument : arg1 = " + arg1 + " , arg2 = " + arg2);
    }

    @Test(groups = { "functest", "checkintest" })
    public void testMethod1() {
        System.err.println("groups = { functest， checkintest }");
    }
    @Test(groups = { "functest","checkintest" })
    public void testMethod2() {
        System.err.println("groups = { functest， checkintest }");
    }
    @Test(groups = { "functest" })
    public void testMethod3() {
        System.err.println("groups = { functest }");
    }
    @Test(groups = { "checkintest" })
    public void testMethod4() {
        System.err.println("groups = { checkintest }");
    }
}