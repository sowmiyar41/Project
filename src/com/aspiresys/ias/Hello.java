package com.aspiresys.ias;
//Comment line
public class Hello {
	
	private String name;
	
	public void setName(String n)
	{
	  name =n;
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public static void main (String args[])
	{
		Hello hello=new Hello();
		hello.setName("Sowmiya");
		
		System.out.println("Haiii"+ hello.getName());
	}
	

}
