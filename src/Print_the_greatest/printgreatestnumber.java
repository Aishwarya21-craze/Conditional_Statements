package Print_the_greatest;

public class printgreatestnumber {
	public static void main(String[] args) {
		/* Take three numbers from the user and print the greatest number. 

		Test Data
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87 
		*/
		
		int num1,num2,num3;
		num1=25;
		num2=78;
		num3=87;
		
		if(num1>num2) {
			System.out.println("The greatest of the three numbers is " + num1);
		}
		
		else if (num2>num3) {
			System.out.println("The greatest of the three numbers is " + num2);
		}
			
			else 
				System.out.println("The greatest of the three numbers is "+ num3);
		
	}

}
