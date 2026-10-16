package spring_jdbc_dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Spring_entities.Student;

public class StudentDaoimpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// insert query
		String query="insert into student(id,name,city) value(?,?,?)";
	int r=	this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}

	@Override
	public int change(Student student) {
		// updating query
		
		String query = "update student set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(), student.getCity(),student.getId());
		return r;
	}
	
	@Override
	public int delete(int studentId) {
		// Delete query 
		
		String query ="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	
	@Override
	public Student getStudent(int studentId) {
		// selecting student data 
		String query ="select * from student where id=?";
		   RowMapper<Student> rowMapper = new RowMapperImpl();
		
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		
		return student;
	}
	
	@Override
	public List<Student> getAllStudents() {
		// selecting multiple student
		String query = "select * from Student";
	List<Student> student =	this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return student;
	}
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	





	
	

}
