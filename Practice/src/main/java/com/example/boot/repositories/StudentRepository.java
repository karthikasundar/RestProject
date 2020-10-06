package com.example.boot.repositories;
import com.example.boot.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}


//@Repository
//public interface StudentRepository extends CrudRepository<Student,Long>{
//
//}