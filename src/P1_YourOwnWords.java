import java.util.Scanner;

/*
	ISYS 320
	Name(s): Clayton Bruce
	Date: 4/8/2018
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
if y > 0
return true

-- Your test values for x, y, z and do you expect true or false?
 test to ouput true
*/

/* 2. 
-- Your conditional expression
 while(x != 0){
  output x is not zero
 }

-- Your test values for x, y, z and do you expect true or false?
true
*/

/* 3.  
-- Your conditional expression
if(y*z % 2 = true)
odd
else ( not odd)

-- Your test values for x, y, z and do you expect true or false?
true
*/

/* 4.  
-- Your conditional expression
if(y>= (z+x))
true
else 
false


-- Your test values for x, y, z and do you expect true or false?

*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if( x < y ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
