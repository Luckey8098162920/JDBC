package Controller;

import Studentmodel.Student;
import b745.Studentdao;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Student s=new Student();
s.setId(6);
s.setName("mannii");
s.setMarks(122);
Studentdao st=new Studentdao();
st.insertstudentss(s);
st.getstudents();
}
	}

