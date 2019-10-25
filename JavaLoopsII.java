import java.util.*;
import java.io.*;

public class JavaLoopsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int z = a + 2^n * b; 
            System.out.print(z + " ");
 
        }
	}
}
