package com.sharpmind.bookmyshow.repositories;

import com.sharpmind.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

//    Optional<User> findUserByIdAndEmail(int id,String email);
Optional<User> findUserById(int id);
    // find -> select
    // user -> table user
    // by id -> where id = {id}
}
