package Test;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
	public class Person {
		private int pid;
		private String pname;
		private String pmob;
		private LocalDate pdate;
		
		public Person() {
			this(0,null,null,null);
		}
		public Person(int id,String nm,String mob,Date dt) {
			this.pid=id;
			this.pname=nm;
			this.pmob=mob;
			this.pdate=dt;
		}
		public Person (int pid) {
			this.pid=pid;
			this.pname=null;
			pmob=null;
			pdate=null;
			
		}
		//Setter method
		public void setpid(int id) {
			this.pid=id;
		}
		public void setpname(String nm) {
			this.pname=nm;
		}
		public void setpmob(String mob) {
			this.pmob=mob;
		}
		public void setpdate(Date dt) {
			this.pdate=dt;
		}
		
//getter method
		public int getpid() {
			return pid;
		}
		public String getpname() {
			return pname;
		}
		public String getpmob() {
			return pmob;
		}
		public Date getpdate() {
			return pdate;
		}
		public String toString() {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			String dt=sdf.format(pdate);
			return "Id:"+this.pid+"\nName:"+pname+"\nMobile:"+pmob+"\nDate"+pdate;
		}
	}



