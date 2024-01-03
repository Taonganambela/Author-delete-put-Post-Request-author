package com.zmltd.author.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmltd.author.entity.Author;

@Repository

public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
