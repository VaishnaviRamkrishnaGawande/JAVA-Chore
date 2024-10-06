package Test;
import java.util.*;
public class Ex4 {

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
			  int choice =0;
	  do {
		  System.out.println("1.Accept 2 Array\n 2.Display 2 array\n 3.Add two array\n 4.Multiply 2 array\n 5.Check Symmetric Matrix\n 6.Exit\n");
		  choice=sc.nextInt();
		  switch(choice) {
		   case 1:
			 System.out.println("Enter array element");
			  break;
		   case 2:
				 System.out.println("Display array element");
				  break;
		   case 3:
			  int sum= Ex1Service.additionArray(c);
				 System.out.println("Addition of Two Array");
				  break;
		   case 4:
			  int multiply= Ex2Service2.multiplyArray(c);
				 System.out.println("Multiplication of Two Array");
				  break;
		   case 5:
				 System.out.println("");
				  break;
		   case 6:
				 System.out.println("Thanks for visiting!!!");
				  break;
				  default:
					  System.out.println("Wrong entry...");
		 	  
		  }
		  }while(choice!=7);
		  }
	}