package Day1;
import java.util.*;
public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Reverse Number is:"+revno(n));		
	}
	public static int revno(int n) {
		int rev=0,rem=0;	
		while(n!=0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		
		}
		return rev;
	}

}
