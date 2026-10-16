package spring_jdbc_dao;

import java.util.List;

import Spring_entities.Student;

public interface StudentDao {

public int insert(Student student) ;
public int change(Student student);
public int delete(int studentId);
public Student getStudent(int studentId);// for single object or row. agar hamne man lo StudentId=456 to  uska sara data object ke roop me return kar dega  
public List<Student>getAllStudents();  // multiple object or row.

}
