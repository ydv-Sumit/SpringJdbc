package spring_jdbc_dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Spring_entities.Student;
 //Yeh code Spring JDBC mein RowMapper ka use karke database ki table se data lekar Student object mein store karta hai.
public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Student student = new Student();
		student.setId(rs.getInt(1));
	 //or	//student.setId(rs.getInt("id"));
		
		student.setName(rs.getString(2));
	//	or//student.setName(rs.getString("name"));
		
		student.setCity(rs.getString(3));
	// or // student.setCity(rs.getString("city"));	
		
		return student;
	}

}
