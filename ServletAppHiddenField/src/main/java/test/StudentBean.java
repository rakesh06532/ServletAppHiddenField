package test;
import java.io.*;

@SuppressWarnings("serial")
public class StudentBean implements Serializable {
	private int sid,math,hindi,science,socscience,english,sanskrit;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocscience() {
		return socscience;
	}
	public void setSocscience(int socscience) {
		this.socscience = socscience;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getSanskrit() {
		return sanskrit;
	}
	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public StudentBean() {}

}
