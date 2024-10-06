package Test;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size you want");
		int n=sc.nextInt();
		 int[][] matrix=new int[n][n];
		 System.out.println("Element are:");
		 Ex3Service.acceptNo(matrix);
  if(Ex3Service.isSymmetricMatrix(matrix, n)) {
	  System.out.println("Matrix is symmetric");
  }else {
	  System.out.println("Matrix is not symmetric");
  }
	}

}
