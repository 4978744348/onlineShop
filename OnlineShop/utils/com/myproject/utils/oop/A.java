package com.myproject.utils.oop;

public class A {
	
	static{
		System.out.println("static A");
	}
	
	{
		System.out.println("init A");
	}
	
	public A() {
		System.out.println("constructor A");
	}

}
