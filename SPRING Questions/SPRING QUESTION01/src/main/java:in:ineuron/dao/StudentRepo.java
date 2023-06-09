package in.ineuron.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<in.ineuron.bo.Student, Integer> {

}
