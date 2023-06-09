package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.Student;
import in.ineuron.dao.StudentRepo;

@Service("service")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
//	@Override
//	public String registerVacine(CoronaVaccine vaccine) {
//        System.out.println("In memory proxy class is :: " +repo.getClass().getName());
//        
//        CoronaVaccine saveVaccine = null;
//        if(vaccine!=null)
//        {
//        	saveVaccine = repo.save(vaccine);
//        	System.out.println(saveVaccine);
//        }
//		return saveVaccine!=null?"Vaccine registered succesfully with " +saveVaccine.getRegNo():"vaccine registration failed";
//	}
		@Override
	public String insertStudent(Student student) {
	        System.out.println("In memory proxy class is :: " +repo.getClass().getName());
		
	        Student saveStudent=null;
	        if(student!=null)
	        {
	        	saveStudent=repo.save(student);
	        	System.out.println(saveStudent);
	        }
	        return null;
	}
	

}
