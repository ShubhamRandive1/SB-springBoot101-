package DAO;

import Student.student;
import exception.studentException;

public interface studentDao {
	
	public String insertStudentData(student stu);
	
	public student getStudentById(int id)throws studentException;
	
	public student getStudentbynameAndId (String name,int id)throws studentException;
	
	public student updatenameById (int id)throws studentException;
	
	public student deleteStudentbyId (int id)throws studentException;


}
