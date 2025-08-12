package com.finalKeyword;

public class FinalVariable {
	public static void main(String[] args) {
		FinalVariable f= new FinalVariable();
		f.variableFinal();
	}
public void variableFinal() {
	System.out.println("This method is used to show a variable is Final.");

    final String name="Shruti";
    final int age= 20;
    
   System.out.println("Name of the student is "+name);
   System.out.println("Age of the student is "+age);

	System.out.println("replace the variable value of name with Meghna");
//	name="Meghna"; 
//	age= 24;
//	not possible the final variable can be initialized only once and is constant.		
	}
}
