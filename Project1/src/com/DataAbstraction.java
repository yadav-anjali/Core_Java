package com;

abstract class Atm_Machine
{
	
	abstract void withDraw(); // abstract method
	
	
}



public class DataAbstraction extends Atm_Machine {
	
	void withDraw()
	{
		System.out.println("With Draw Successfully");
	}
	
	public static void main(String[] args)
	{
		DataAbstraction obj = new DataAbstraction();
		obj.withDraw();
	}
	

}