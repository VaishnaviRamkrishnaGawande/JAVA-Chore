package Test;

import java.util.Scanner;

public class Ex4Service {
	//Accept array
		public static void acceptNo(int[][]matrix ) {
			Scanner sc=new Scanner(System.in);
		 for(int i=0;i<matrix.length;i++) {
			 for (int j=0;j<matrix.length;j++) {
				 matrix[i][j]=sc.nextInt();
			 }
			 }
		 }
		//Display array
		 public static void displayNo(int[][]matrix ) {
			Scanner sc=new Scanner(System.in);
			 for(int i=0;i<matrix.length;i++) {
				 for (int j=0;j<matrix.length;j++) {
					 System.out.println(matrix[i][j]);
				 }
				 System.out.println();
			 }
			 
		 }
//Display function of Addition array
public static void Addition(int[][]a,int[][]b,int[][]c) {
for(int i=0; i<2;i++) {
	for( int j=0;j<2;j++) {
		c[i][j]=a[i][j]+b[i][j];
	}
  }
}

//Display function of Multiplied array
public static void Multiply(int[][]a,int[][]b,int[][]c) {
for(int i=0; i<2;i++) {
	for( int j=0;j<2;j++) {
		c[i][j]=a[i][j]*b[i][j];
	
  }
}
}
public static boolean isSymmetricMatrix(int[][] matrix,int n) {
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			if(matrix[i][j]!=matrix[j][i]) {
				return false;
			}
		}
	}
	return true;
}
}

