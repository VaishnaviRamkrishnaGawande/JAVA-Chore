package Day1;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		//System.out.print("Hello World!");
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<10;i++) {
			System.out.println("Enter name");
			String n=sc.next();
			System.out.println("Name:"+n);
		}
 sc.close();
	}
}