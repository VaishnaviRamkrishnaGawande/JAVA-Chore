package Test;

public class Ex2Service {
	//Accept function for array
	public static void multiplyArray(int[][]a , int[][] b,int[][]c) {
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
		{
		 c[i][j]=a[i][j]*b[i][j];
		}
		}
	}
	//Display function of Multiplied array
		public static void displayArray(int[][]c) {
		for(int i=0; i<2;i++) {
			for( int j=0;j<2;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		  }
		}
}

