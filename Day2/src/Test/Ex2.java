package Test;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Enter element of A");
		int a[][] = new int[2][2];
		Ex3Service.acceptNo(a);
		System.out.println("Enter element of B");
		int b[][] = new int[2][2];
		Ex3Service.acceptNo(b);

		int c[][]=new int[2][2];
		Ex2Service.multiplyArray(a,b,c);
		System.out.println("Result");
		Ex2Service.displayArray(c);
	}
}