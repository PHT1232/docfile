package DAO;

import Model.student;
import java.util.List;

public interface StudentDAO {
	public List<student> getStudent();
	public void insertStudent(student st);
	public void deleteStudent(String id);
	public void updateStudent(String id, student st);
	public student selectStudent(String id);
}
