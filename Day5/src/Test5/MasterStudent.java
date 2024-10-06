package Test5;

import java.time.LocalDate;

public class MasterStudent extends Student {
      private String thessis;
      private String degree;
      private int thesismarks;
	public MasterStudent(int pid, String pname, String address, LocalDate bdate,int[] marks,int spsub,String thessis, String degree, int thesismarks) {
		super( pid,  pname, address,  bdate,  marks);
		this.thessis = thessis;
		this.degree = degree;
		this.thesismarks = thesismarks;
	}
	public String getThessis() {
		return thessis;
	}
	public void setThessis(String thessis) {
		this.thessis = thessis;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getThesismarks() {
		return thesismarks;
	}
	public void setThesismarks(int thesismarks) {
		this.thesismarks = thesismarks;
	}
	@Override
	public String toString() {
		return super.toString()+"MasterStudent [thessis=" + thessis + ", degree=" + degree + ", thesismarks=" + thesismarks + "]";
	}
}
