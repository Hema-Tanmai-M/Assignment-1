package com.ibm.assignment.animal;

public class Duck extends Animal

{

   protected String beakColor;

  public Duck( String beak_color,int Age, boolean Gender, boolean Mammal, boolean mate)

  {

      super(Age,Gender,Mammal,mate);
      this.beakColor = beak_color;

  }

 public String GetBeakColor()
 {
	 return(beakColor); 
	 }

 public void  swim() 
 {
	 System.out.println("swimming"); 
	 }

 public void quack() 
 {
	 System.out.println("quack"); 
	 }

 @Override 
 public boolean mate() {
	  return(mate);
 }

 @Override 
 public String SerializeToCSV() 
 {
       return(new String (age + "," + gender + "," + mammal + "," + beakColor+","+mate));

 }



}