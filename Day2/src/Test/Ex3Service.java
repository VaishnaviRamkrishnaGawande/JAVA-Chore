package Test;

import java.util.Scanner;

public class Ex3Service {
	public static void acceptNo(int[][] matrix) {
		Scanner sc=new Scanner(System.in);
	 for(int i=0;i<matrix.length;i++) {
		 for (int j=0;j<matrix.length;j++) {
			 matrix[i][j]=sc.nextInt();
		 }
	 }
	
	}

	public static boolean isSymmetricMatrix(int[][] matrix,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]!=matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}
