package com.ibm.assignment.animal;

public class Animal

{

   protected int age;

   protected boolean gender;

   protected boolean mammal;
   
   protected boolean mate;



   public Animal( int Age, boolean Gender, boolean Mammal, boolean mate)

    {

       this.age = Age;

       this.gender = Gender;

       this.mammal = Mammal;
       
       this.mate=mate;

    }

  public void SetAge(int n) 
  { 
	  this.age = n; 
	  }

  public void SetGenderMale() 
  { 
	  this.gender=false;
	  }

  public void SetGenderFemale() 
  {
	  this.gender=true; 
	  }

  public void SetMammal(boolean Mammal)
  {
	  this.mammal = Mammal;
	  }  

  public int GetAge() 
  {
	  return(age); 
	  }

  public boolean IsMammal() 
  { 
	  return(mammal);
	  }

  public boolean GetGender() 
  {
	  return(gender); 
	  } 

  public boolean mate()
  {
	  return(mate);
  }



  public String SerializeToCSV()

  {

        return(new String (age + "," + gender + "," + mammal +","+ mate));

  }


}


