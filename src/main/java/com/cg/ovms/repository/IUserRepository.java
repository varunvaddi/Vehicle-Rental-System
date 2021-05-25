package com.cg.ovms.repository;

import com.cg.ovms.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>{

	//public User validateUser(User user);
	//public User addUser(User user);
	//public User removeUser(User user);
	//public User signOut(User user);
}
