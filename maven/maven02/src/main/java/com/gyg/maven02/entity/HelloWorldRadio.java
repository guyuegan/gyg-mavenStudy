package com.gyg.maven02.entity;

import com.gyg.maven01.entity.HelloWorld;

public class HelloWorldRadio
{
	public String broadcast(){
		//����maven01��HelloWorld�ķ���
		return new HelloWorld().sayHello();
	}
}
