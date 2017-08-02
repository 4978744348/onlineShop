package com.myproject.utils.oop;

public class B extends A {
	
	static{
		System.out.println("static B");
	}
	
	{
		System.out.println("init B");
	}
	
	public B() {
		System.out.println("constructor B");
	}

}
