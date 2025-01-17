package Test;

public class Student {
	private int sid;
	private String sname;
	private float mark1;
	private float mark2;
	private float mark3;
	private float Average;
	
	public Student(){
		sid=0;
		sname=null;
		mark1=0;
		mark2=0;
		mark3=0;
		Average=0;
	}
	public Student (int id,String nm, float m1,float m2,float m3) {
		this.sid=id;
		this.sname=nm;
		this.mark1=m1;
		this.mark2=m2;
		this.mark3=m3;
		this.Average=avgMarks(m1,m2,m3);
	}
	
	//Setter method
	 public void setsid(int id) {
		 this.sid=id;
	 }
	 public void setsname(String nm) {
		 this.sname=nm;
	 }
	 public  void setmark1(float m1) {
		 this.mark1=m1;
	 }
	 public void setmark2(float m2) {
		 this.mark2=m2;
	 }
	 public void setmark3(float m3) {
		 this.mark3=m3;
	 }
	 public void setAverage(float avg) {
		 this.Average=avg;
	 }


//Getter method
 public int getsid() {
	 return sid;
 }
 public String getsname() {
	  return sname;
 }
 public  float getmark1() {
	  return mark1;
 }
 public float getmark2() {
	return mark2;
 }
 public float getmark3() {
	 return mark3;
 }
 public float getAverage() {
	 return Average;
 }
 //Average of marks
 public float avgMarks(float m1,float m2,float m3) {
	 return (m1+m2+m3)/3; 
 }
 public String toString() {
     return "Student:"+sid+"\nName: "+sname+"\nMarks1: "+mark1+"\nMark2: "+mark2+"\nMark3: "+mark3+"Average: "+Average;
 }
}


