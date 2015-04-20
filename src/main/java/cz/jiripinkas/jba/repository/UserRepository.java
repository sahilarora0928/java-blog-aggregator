package cz.jiripinkas.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cz.jiripinkas.jba.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
