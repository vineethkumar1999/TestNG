package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass1 {
    @BeforeSuite
    public void BeforeSuiteInitialization(){
        System.out.println("Initialize");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }

    @Test(groups = "First", priority = 2, dependsOnMethods = "test2")
    public void test1()
    {
        System.out.println("Test1");
    }

    @Test(description = "Testing123", groups = "Second" , priority = 1)
    public void test2()
    {
        System.out.println("Test2");
        Assert.fail("Failing");
    }


    @Test(groups = "Second", priority = 3, invocationCount = 2)
    public void test3()
    {
        System.out.println("Test3");
    }

    @Test(groups = "Fourth", priority = 4, invocationTimeOut = 2)
    public void test4()
    {
        while(true)
            System.out.println("Hi");
    }

    @Test(groups = "Fifth", priority = 5, expectedExceptions = NumberFormatException.class)
    public void test5()
    {
        int A = Integer.parseInt( "23A");
        System.out.println();
    }

    @Test(groups = "Sixth", priority = 7)
    @Parameters({"emailid","password"})
    public void test6(String emailid, String password)
    {
        System.out.println(emailid + " " + password);
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }

    @AfterSuite
    public void AfterSuiteInitialization(){
        System.out.println("After Initialize");
    }

}
