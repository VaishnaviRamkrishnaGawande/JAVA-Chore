package Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.*;

public class PersonService {
	private static Person[] parr;
	private static int cnt;
	static
	{
		parr= new Person[10];
		parr[0]=new Person (96,"Vaishnavi","674536458",new Date(2002,08,05));
		parr[1]=new Person (95,"Vaish","8454392",new Date(2002,07,10));	
	}
	public static void addNewPerson()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Id : ");
		int pid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name : ");
		String pnm=sc.nextLine();
		
		System.out.println("Enter Mobile num : ");
		String pmob=sc.next();
		
		System.out.println("Enter Date : ");
		String pdate=sc.next();
	}
	
	public static Person [] displayAll()
	{
		return parr;
	}
	
	public static Person getById(int id)
	{
		for(Person p: parr)
		{
			if(p!=null)
			{
				if(p.getById()==id)
				{
					return p;
				}
			}
			else
			{
				return null;
			}
			
		}
		return null;
	}
	
	public static Person[] getByName(String nm)
	{
		Person[] arr=new Person[parr.length];
		int count=0;
		for(Person p:parr)
		{
			if(p!=null)
			{
				if(p.getpname().equals(nm))
				{
					arr[count]=p;
					count++;
				}
			}
			else
			{
				break;
			}
			if(count>0)
			{
				return arr;
			}
			return null;
			
		}
	}
	
	public static boolean modifyMobile(int id, String mob)
	{
		Person p=getById(id);
		if(p!=null)
		{
			p.setmob(mob);
			return true;
		}
		return false;
	}
	
	public static boolean deleteById(int id)
	{
		for(int i=0;i<cnt;i++)
		{
			if(parr[i].getpid()==id)
			{
				for(int j=i;j<cnt;j++)
				{
					parr[j]=parr[j+1];
				}
				cnt--;
				return true;
			}
		}
		return false;
	}

}
