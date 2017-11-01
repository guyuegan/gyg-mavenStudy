package com.gyg.maven02.entity;

import com.gyg.maven01.entity.HelloWorld;

public class HelloWorldRadio
{
	public String broadcast(){
		//调用maven01中HelloWorld的方法
		return new HelloWorld().sayHello();
	}
}
