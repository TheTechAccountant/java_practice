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

		        
			for(double t=0;t<n;t++) { 
				int addOnPatternOfSeries = (int) ((int) b * Math.pow(2, t));
				totalSum = totalSum + addOnPatternOfSeries;
				System.out.print(a + totalSum + " ");
			}
			System.out.println();
        }
    	in.close();
	}

}
