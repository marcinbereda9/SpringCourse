package com.mb.SpringCourse.Models.Repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mb.SpringCourse.Models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	public Optional<User> findById(Long id);
}
