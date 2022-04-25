package com;

public class Classobj {
	int yearofpurchase;
	String model;
	double cost;
	public void disp1()
	{
		System.out.println("year of purchase"+2001);
	}
	public void disp2()
	{
		System.out.println("Model"+1999);
		System.out.println("Cost Rs"+19999);
		
	}
	
	public static void main(String[]args)
	{
		Classobj obj1=new Classobj();
		Classobj obj2=new Classobj();
		
		obj1.disp1();
		obj1.disp2();
		
		obj2.disp1();
		obj2.disp2();
	}

}
