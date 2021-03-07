package com.simhero.hello.springsecurity.repository;

import com.simhero.hello.springsecurity.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Posts, Long> {
}
