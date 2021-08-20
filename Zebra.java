package com.ibm.assignment.animal;

public class Zebra extends Animal
{
	protected boolean is_wild;
	
	Zebra (boolean is_wild, int Age, boolean Gender, boolean Mammal, boolean mate)
	  {
	     super(Age,Gender,Mammal, mate);
	     this.is_wild = is_wild;
	  }
	public boolean is_wild()
	{
		return(is_wild); 
		}
	public void run()
	{ 
		System.out.println("running");
		}
	@Override public String SerializeToCSV()
	{
	return(new String (age + "," + gender + "," + mammal + "," + mate + "," + is_wild));
	}


	}


