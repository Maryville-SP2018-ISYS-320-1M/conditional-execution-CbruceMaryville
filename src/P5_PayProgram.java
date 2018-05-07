import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
	FIXED ON 5/6/2018
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();

		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();

		System.out.println("Now Computing Pay: ");

		System.out.println(ComputePay(hourlyRate, numOfHoursWorked));

	}

	public static double ComputePay(double rate, int hours) {

		// (5.50, 6) should return 33.0

		if (hours > 8) {
			double pay1;
			double payOver;

			int overtime = hours - 8;
			payOver = (rate * 1.5) * overtime;

			pay1 = rate * 8;

			double TotalPay = pay1 + payOver;
			return TotalPay;
		} else {
			double pay;
			pay = rate * hours;
			return pay;
		}

	}

}
