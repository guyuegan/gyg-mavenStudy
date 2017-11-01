package com.gyg.maven02.entity;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldRadioTest
{
	@Test
	public void broadcast(){
		Assert.assertEquals("hello maven", new HelloWorldRadio().broadcast());
	}
}
