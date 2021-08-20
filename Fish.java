package com.ibm.assignment.animal;

public class Fish extends Animal

{
  protected int size;
  protected boolean canEat;

  Fish (int n, boolean canEat, int Age, boolean Gender, boolean Mammal, boolean mate)
  {
     super(Age,Gender,Mammal, mate);
     size = n;
     this.canEat = canEat;
  }

  public int GetSize()
  {
	  return(size);
	  }

  public boolean canEat() 
  {
	  return(canEat); 
	  }

  public void swim() 
  {
	  System.out.println("swimming");
	  }

 @Override 
 public boolean mate()
 {
	  return(mate);
 }

@Override 
public String SerializeToCSV()
{
	return(new String (age + "," + gender + "," + mammal + "," + size + "," + canEat));

}



}

