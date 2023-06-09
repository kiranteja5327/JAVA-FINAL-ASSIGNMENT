package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}