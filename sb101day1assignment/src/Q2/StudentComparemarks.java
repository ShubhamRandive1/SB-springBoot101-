package Q2;

import java.util.Comparator;

import Q2.Student;

public class StudentComparemarks<Student>implements Comparator<Student>{
	

	@Override
	public int compare(Student o1, Student o2) {
		
		// TODO Auto-generated method stub
		
		if(((Q2.Student) o1).getMarks() > ((Q2.Student) o2).getMarks()) {
			return 1;
			
		}else if(((Q2.Student) o1).getMarks() < ((Q2.Student) o2).getMarks()) {
			
			return -1;
		}else {
			return 0;
		}
		
	}
	
}
