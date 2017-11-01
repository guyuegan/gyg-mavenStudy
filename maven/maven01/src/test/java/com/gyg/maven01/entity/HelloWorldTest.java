package com.gyg.maven01.entity;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest
{
	@Test
	public void sayHello(){
		Assert.assertEquals("hello maven", new HelloWorld().sayHello());
	}
}
