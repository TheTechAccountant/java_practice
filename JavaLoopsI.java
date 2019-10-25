import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class JavaLoopsI {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i<=10 ; i++) {
        	int z = i *N;
          	System.out.println(N + " x " + i + " = " + z);
        	
        }
        scanner.close();
    }
}

/* for (statement 1; statement 2; statement 3) {
 	*Block of code to be executed
 	* } 
 */ 