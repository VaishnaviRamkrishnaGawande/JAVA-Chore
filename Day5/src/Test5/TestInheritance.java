package Test5;
import java.util.Scanner;
public class TestInheritance {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=0;
	
	do {
		System.out.println("1.Accept new Data\n 2.Delete Data\n 3.Update Marks\n 4.Display All Graduate Student\n 5.Display All Master Student\n 6.Display All\n 7.Exit\n");
		System.out.println("Enter Choice :\n");
		choice = sc.nextInt();
		switch (choice) {
	case 1:
		System.out.println("1.Graduate Student\n 2.Master Student\n 3.Choice:\n");
		int ch=sc.nextInt();
		PersonService.addNewData(ch);
		break;
	case 2:
		for (Student student : PersonService.sarr) {
	        int id = 14;
			if (student != null && student.getPid() == id) {
	            Object deleted = PersonService.DeleteAll(id);
	            System.out.println("Successfully Deleted");
			}else {
			 System.out.println("Not Found id in delete");
	        }
	    }
		break; 
	case 3:
		break;
	case 4:
		Student[] arr=PersonService.displayAll();
		for(Student s1:arr) {
			if(s1 instanceof GraduateStudent){
				System.out.println(s1);
			}
		}
		break;
	case 5:
		arr=PersonService.displayAll();
		for(Student s1: arr) {
			if(s1 instanceof MasterStudent)
			System.out.println(s1);
		}
		break;
	case 6:
		Student[] sarr = PersonService.displayAll();
		for(Student s:sarr) {
			if(s!=null) {
				System.out.println(s);
			}else {
				break;
			}
		}
		break;
	case 7:
		System.out.println("Thank you");
		//System.exit(7);
		sc.close();
		break;
		default:
			System.out.println("Wrong Entry");
			break;
	}
	}while(choice != 7);
	
	}

}

	

	


