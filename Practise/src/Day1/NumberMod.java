package Day1;
import java.util.*;
public class NumberMod {

	public static void main(String[] args) {
		int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	for(int i=0;i<10;i++) {
		int n= sc.nextInt();
		if(n==0) {
			System.out.println("number is zero and cannot be divided");
			//continue;
		}
		if(n%3==0 || n%5==0 || n%11==0) {
			sum=sum+n;
		}
	}
	System.out.println("The sum of number:"+sum);
sc.close();
	}

}
