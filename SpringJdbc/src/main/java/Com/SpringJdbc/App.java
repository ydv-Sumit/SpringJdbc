package Com.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import Spring_entities.Student;
import spring_jdbc_dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "my progrm Started......" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Com/SpringJdbc/config.xml");
        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
        
        // for inserting
        
//       Student student = new Student();
//        student.setId(111);
//        student.setName("khushbu");
//      student.setCity("goregaon");        
//     int result =studentDao.insert(student);
//       
//       System.out.println("number of record inserted.."+result);
//      
        
        //  for updating  
        
//        Student student = new Student();
//        student.setId(777);
//        student.setName("raj");
//        student.setCity("kerakat");
//        
//        
//       int result= studentDao.change(student);
//       System.out.println("data change"+result);
        
        
        // delete query
        
//        int result = studentDao.delete(777);
//        System.out.println("Deleted"+result);
        
        // call single row
//      Student student =  studentDao.getStudent(222);
//      System.out.println(student);
      
      // call multiple row 
      
      List<Student> student=studentDao.getAllStudents();
      for (Student s : student) {
    	  System.out.println(s);
		
	}
        
        
    }
}