package Test4;


public class Student1 {
	static int min_passing_marks;
	static String degree;
	private static int cnt=1;
	static {
		min_passing_marks=40;
		degree="DAC";
	}
	private String sid;
	private String sname;
	private String address;
	private int m1,m2,m3;
	private static String generateCode(String nm, String addr)
	{
		String code="";
		if(nm!=null && addr!=null)
			code=nm.substring(0,2)+addr.substring(0,2)+cnt;
		else
			code="24"+"99"+cnt;
		cnt++;
		return code;
	}
	public Student1() {
		sid=generateCode(null,null);
		sname=null;
		address=null;
		m1=0;
		m2=0;
		m3=0;
	}
	public Student1(int i, String sname, String address, int m1, int m2, int m3) {
		//this.sid =i;
		this.sname = sname;
		this.address = address;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public static int getMin_passing_marks() {
		return min_passing_marks;
	}
	public static void setMin_passing_marks(int min_passing_marks) {
		Student1.min_passing_marks = min_passing_marks;
	}
	public static String getDegree() {
		return degree;
	}
	public static void setDegree(String degree) {
		Student1.degree = degree;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Student1.cnt = cnt;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + generateCode(sid, sname) + ", sname=" + sname + ", address=" + address + ", m1=" + m1 + ", m2=" + m2
				+ ", m3=" + m3 + "]";
	}
	
	
	
}


