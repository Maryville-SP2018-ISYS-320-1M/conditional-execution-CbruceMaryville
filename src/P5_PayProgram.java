import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		
		System.out.println("Now Computing Pay: ");
		
		ComputePay(hourlyRate, numOfHoursWorked);

	}

	
	
public static double ComputePay(double x, int y) {
		
	//(5.50, 6) should return 33.0	
	double pay;
	pay = x*y;
	
	System.out.println(pay);
	return pay;
	
	
	}
	
}
