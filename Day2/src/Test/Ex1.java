package Test;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Enter element of A");
		int a[][] = new int[2][2];
		Ex3Service.acceptNo(a);
		System.out.println("Enter element of B");
		int b[][] = new int[2][2];
		Ex3Service.acceptNo(b);

		int c[][]=new int[2][2];
		Ex1Service.additionArray(a,b,c);
		System.out.println("Result");
		Ex1Service.displayArray(c);
	}}