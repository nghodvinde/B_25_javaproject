package com.tns.abstraction;

public class MyClass {

public static void main(String[] args) {
	Subtract s=new Subtract();
	Multiple m=new Multiple();
	s.calculate(10,5);
	m.calculate(10,20);
}
}