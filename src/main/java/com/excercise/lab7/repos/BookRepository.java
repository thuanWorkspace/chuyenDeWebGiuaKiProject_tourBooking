package com.excercise.lab7.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.lab7.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long> {

}
