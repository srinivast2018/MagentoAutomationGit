package com.ibm.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {
	
	@Test
	public void LoginTest()
	{
		System.out.println("chek");
		Assert.assertEquals("myaccount","myaccount");
		System.out.println("added the line in GIT");
	}

}
