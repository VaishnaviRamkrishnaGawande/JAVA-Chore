package Day1;
import java.util.*;
public class Prime {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter a number");
    	 for(int i=0; i<10;i++) {
    		 int n=sc.nextInt();
    		 System.out.println("Prime number is"+isPrime(n));
    		 }
    	 sc.close();
     }
		public static boolean isPrime(int n)
	    {
	        if (n <= 1)
	            return false;
	        
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
     
	}
