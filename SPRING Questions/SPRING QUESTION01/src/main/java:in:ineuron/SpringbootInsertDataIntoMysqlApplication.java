package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.bo.Student;
import in.ineuron.service.StudentService;

@SpringBootApplication
public class SpringbootInsertDataIntoMysqlApplication {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(SpringbootInsertDataIntoMysqlApplication.class, args);
	    StudentService service = factory.getBean(StudentService.class);
		
		Student student = new Student(2,"Mohit","Delhi",23);
	    System.out.println(service.insertStudent(student));
	}

}
