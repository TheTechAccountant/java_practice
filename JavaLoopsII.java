import java.util.*;
import java.io.*;

public class JavaLoopsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int numberOfQueries=in.nextInt(); // t is used to denote the number of queries. i.e. t=2 will result in two queries
        
        
        
        for(int i=0;i<numberOfQueries;i++){ 
        	//Take inputs for each independent query
            int a = in.nextInt(); //let me 0 for test
            int b = in.nextInt(); // let be 2 for test
            int n = in.nextInt(); // let be 10 for test
            int totalSum = 0;  
           
            // System.out.println("The value of a is: " + a);
			// System.out.println("The value of b is: " + b);
			// System.out.println("The value of n is: " + n);
		        
			for(double t=0;t<n;t++) { 
		
			int addOnPatternOfSeries = (int) ((int) b * Math.pow(2, t));
			totalSum = totalSum + addOnPatternOfSeries;
			// int y =+ addOnPatternofSeries;
			System.out.print(a + totalSum + " ");
			// System.out.println(y);
			}
        }
    	in.close();
	}

}
