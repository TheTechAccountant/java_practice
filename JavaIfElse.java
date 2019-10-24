import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N%2 !=0 // If N is odd print Weird
        		|| (N%2 == 0 && (6<= N && N<=20))) { //If N is even and in the inclusive range of 6 to 20 print Weird
        	System.out.print("Weird");
        } else if (N%2 == 0 && (2<=N &&  N<=5) //If N is even and in the inclusive range of 2 to 5 print Not Weird
        		|| (N%2 == 0 && N>20)) {  // If N is even and greater than 20, print Not Weird
        	System.out.print("Not Weird");
        } 
        scanner.close();
    }
} 