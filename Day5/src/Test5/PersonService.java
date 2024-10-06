package Test5;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonService {
         static Student[] sarr;
         static int cnt;
         static {
        	sarr = new Student[10];
        	 
        	sarr[0]=new MasterStudent(14, "Vaish", "Pune", LocalDate.of(2002, 07, 10), new int[] {88,87},100, "Math","EE",90);
        	sarr[1]=new GraduateStudent(15, "Vikram", "Pune", LocalDate.of(2002, 11,10 ), new int[] {58,24},70);
             cnt=2;
         }
         //Add new data
         public static void addNewData(int  ch) {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter ID:");
        	 int id=sc.nextInt();
        	 System.out.println("Enter Name:");
        	 String nm=sc.next();
        	 System.out.println("Enter Address:");
        	 String addr=sc.next();
        	 System.out.println("Enter Birthdate (dd/MM/yyy)");
        	 String dt=sc.next();
        	 LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyy"));
        	 //Enter marks 
        	 int[] marks=new int[2];
        	 if(ch==1 || ch==2) {
        		 System.out.println("Enter marks1");
        		 marks[0]=sc.nextInt();
        	     System.out.println("Enter marks2");
        	     marks[1]=sc.nextInt();
        	 }if(ch==1) {
        		 System.out.println("Enter Special marks");
        		 int spmarks=sc.nextInt();
        		//Enter Graduate student data 
				sarr[cnt]=new GraduateStudent(id,nm,addr,ldt,marks,spmarks);
        	 }else {
        		 System.out.println("Enter Thessis subject");
        		 String tsub=sc.next();
        		 System.out.println("Enter Degree");
        		 String dg=sc.next();
        		 System.out.println("Enter Thessis marks");
        		 int tmarks=sc.nextInt();
        	 }	 
        	 }
        //Display All
		public static Student[] displayAll() {
			return sarr;
		}
        //Delete the data	 
       public static boolean DeleteAll(int id) {
        for(int i=0; i<cnt;i++) {
        	if(sarr[i]!=null && sarr[i].getPid()==id) {
        		sarr[i]=null;
        	}
        	for(int j=0;j<cnt-1;j++) {
        		sarr[j]=sarr[j+1];
        	}
        	sarr[cnt-1]=null;
        	cnt--;
        	return true;
        }
       
         return false;
}
}










