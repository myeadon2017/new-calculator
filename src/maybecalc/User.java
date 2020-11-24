package maybecalc;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		float a, b;
		char choice;
		Scanner scan = new Scanner(System.in);
		
		do
	    {
	    	System.out.println("-----------------------------");
	        System.out.println("Enter (+) For Addition");
	        System.out.println("Enter (-) For Subtraction");
	        System.out.println("Enter (*) For Multiplication");
	        System.out.println("Enter (/) For Division");
	        System.out.println("Enter (E) To Exit");
	        System.out.println("-----------------------------");
	        
	        System.out.println("Enter Your Choice : ");
	        choice = scan.next().charAt(0);

	        switch(choice)
	        {
            case '+' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                Calculator calculator=new Calculator(new Addition());
        		System.out.println("The answer is: "+ calculator.Calculation(a,b));
                break;
            case '-' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                Calculator calculator2=new Calculator(new Subtraction());
        		System.out.println("The answer is: "+ calculator2.Calculation(a,b));
                break;
            case '*' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                Calculator calculator3=new Calculator(new Multiplication());
        		System.out.println("The answer is: "+ calculator3.Calculation(a,b));
                break;
            case '/' : System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                System.out.println("-----------------");
                Calculator calculator4=new Calculator(new Division());
        		System.out.println("The answer is: "+ calculator4.Calculation(a,b));
                break;
            case 'E' : System.exit(0);
                break;
            default : System.out.println("Invalid Choice");
        }
	    }while(choice != 'E');       
	}
	}
		
