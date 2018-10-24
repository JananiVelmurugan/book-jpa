package com.fujitsu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fujitsu.demo.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
