package com.unit.testing.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServicesTest {

    int counter = 0;


    @BeforeClass
    public static void init() {
        System.out.println("From init");
        System.out.println("Started test :" + new Date());
    }

    @Before
    public void beforeEachMethod() {
        System.out.println("Before each test cases");
        counter = 0;
    }
//test methods of addTwoNumbers

    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
            counter += i;
        }
        Thread.sleep(3000);
        System.out.println("test for addTwoNumbersTest ");

        int result = CalculatorService.addTwoNumbers(12, 85);
        int expected = 97;
        System.out.println("Counter int first test case :" + counter);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumbersTest() {

        for (int i = 1; i <= 100; i++) {
            counter += i;
        }
        System.out.println("test for sumAnyNumbersTest ");

        int result = CalculatorService.sumAnyNumbers(2, 8, 6, 9);

        int expResult = 25;
        System.out.println("Counter int first test case :" + counter);
        Assert.assertEquals(expResult, result);
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After all test cases");
        System.out.println("End test cases:" + new Date());
    }
}
