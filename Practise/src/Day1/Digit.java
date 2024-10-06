package Day1;
import java.util.*;
public class Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Digit count is:"+digitCount(n));
		
	}
	public static int digitCount(int n) {
		int sum=0,rem=0;
		
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n=n/10;
		
		}
		return sum;
	}
}

