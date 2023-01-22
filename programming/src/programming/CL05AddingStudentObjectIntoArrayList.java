//5.	WAJP TO ADD STUDENT OBJECT INTO ARRAYLIST.
package programming;

import java.util.ArrayList;

public class CL05AddingStudentObjectIntoArrayList {
	String sname;
	int rollno;
	public CL05AddingStudentObjectIntoArrayList(String sname, int rollno)
	{
		this.sname=sname;
		this.rollno=rollno;
	}
	@Override	// use alt+shift then 's' 2 times for overriding toString method in shortcut.
	public String toString() {
		return "[sname=" + sname + ", rollno=" + rollno + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		a.add(new CL05AddingStudentObjectIntoArrayList("Arun", 101));
		a.add(new CL05AddingStudentObjectIntoArrayList("Varun", 102));
		a.add(new CL05AddingStudentObjectIntoArrayList("Ram", 104));
		a.add(new CL05AddingStudentObjectIntoArrayList("Shyam", 103));
		for(Object i:a) {
			System.out.println(i);
		}
	}
}
