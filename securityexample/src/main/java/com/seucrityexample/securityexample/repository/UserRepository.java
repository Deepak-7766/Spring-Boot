package com.seucrityexample.securityexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seucrityexample.securityexample.entity.Users1;

@Repository
public interface UserRepository extends JpaRepository<Users1,Integer> {

   public Users1 findByUserName(String username);

}
