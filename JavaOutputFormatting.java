import java.util.Scanner;
import java.util.*;


public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next(); 	// Next string variable for the scanner
            int x = sc.nextInt(); 	// Next int variable
            //Complete this line
            System.out.printf("%-15s", s1);
            System.out.printf("%d %n", x);
        }
        System.out.println("================================");
        	
        sc.close();

	}
}

// Reference Website https://www.baeldung.com/java-printstream-printf 
// %[flags][width][.precision]conversion-character  --> Formatting rules follows this sequence
/* 
 * 1. Flags define standard way to modify the output and are most common for formatting integers and floating point numbers.
 * 2. Width specifies the field width for outputting the argument. 
 * 		It represents the minimum number of characters to be written in the output.
 * 3. Specifies the number of digits of precision when outputting floating-point values. 
 * 		Additionally, we can use it to define the length of a substring to extract from a String.
 * 
 * Rules start with the ‘%' character.	
*/