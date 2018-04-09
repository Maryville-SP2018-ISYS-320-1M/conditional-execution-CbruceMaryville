/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

/*
 Your expected results after the input is provided:
 
 1. Should print out empty or a " "
 2.  Should also print out empty or a " "
 3.  Should print out a 3 then a 4 on the same line
 4. Should print out a 29 then a 30 on the same line
  
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		//ifElseMystery(10, 2);
		//ifElseMystery(3, 8);
		//ifElseMystery(4, 4);
		//ifElseMystery(10, 30);


	}
	
    public static void ifElseMystery(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            System.out.println(a + " " + b);
        }
    }

}
