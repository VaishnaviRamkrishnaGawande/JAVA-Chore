package Day1;
import java.util.Scanner;
//import java.util.*;
class Number {

	public static void main(String[] args) {
		System.out.println("Add Number:");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
	 for(int i=0;i<10;i++) {
		 int n=sc.nextInt();
		 sum=sum+n;
	 }
		 System.out.println(" Addition of Number :"+sum);
		 sc.close();
	 }
	}
