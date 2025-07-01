package com.qa.Testcases;

import org.testng.annotations.Test;

public class Test1 {
 
	@Test(threadPoolSize=4)
	public void RepeatableTest() throws InterruptedException{
		System.out.println("Running"+System.currentTimeMillis());
		
	}
	@Test(invocationCount=3)
	public void RepeatableTest2() throws InterruptedException{
		System.out.println("Running2a"+System.currentTimeMillis());
		
	}
}
