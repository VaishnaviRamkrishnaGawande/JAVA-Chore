package Test5;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person{
         private int[] marks;

		public Student() {
			super();
			System.out.println("In Student Default Constructor");
		}
		public Student(int pid, String pname, String address, LocalDate bdate,int[] marks) {
			super(pid,pname,address,bdate);
			System.out.println("In Student Parameterized constructor");
			this.marks = marks;
		}


		public int[] getMarks() {
			return marks;
		}

		public void setMarks(int[] marks) {
			this.marks = marks;
		}
		
		@Override
		public String toString() {
			return super.toString()+"Student [marks=" + Arrays.toString(marks) + "]";
		}
         
}
