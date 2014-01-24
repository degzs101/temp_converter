import java.util.Scanner; // import scanner 

public class temp_converter { // create a class
	  public static void main(String[] args){



	
	Scanner in = new Scanner(System.in); //Creates scanner object
	
	System.out.println("(1) Fahrenheit to Celcius"); // print statements
	System.out.println("(2) Celcius to Fahrenheit");
	System.out.println("(3) Exit");
	System.out.print("Choice");
	
	int choice = in.nextInt();{ //Get user input 
			while (choice != 1 && choice != 2 && choice !=3) // while loop
	{ 
			
	} 
		 
			if (choice == 1) // if choice one is inputed do calculations 
	{ 
			System.out.println("Please enter the temperature :"); // enter temp
			double toConvertFahrenheit = in.nextDouble(); //Get user input 
			toConvertFahrenheit = (((toConvertFahrenheit-32)*5)/9); //subtract 32, multiply by 5, then divide by 9 
			System.out.println(" Fahrenheit is: " + (int)toConvertFahrenheit + "  Celcius."); // print out ans
	} 
		 
			else if (choice == 2)  // if choice two is inputed do calculations 
	{ 
				System.out.println("Please enter the temperature:"); // enter temp
				double toConvertCelcius = in.nextDouble(); 
				toConvertCelcius = (((toConvertCelcius*9)/5)+32); //multiply by 9, divide by 5, add 32. 
				System.out.println("Celcius is "+ (int)toConvertCelcius + "Fahrenheit."); 
				 
	} 
		
			else if (choice==3) // if 3 is entered close program
				System.out.println("program Terminated");
				
	} 
}// end class
}// end method