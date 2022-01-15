package com.IstProject.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IstProject.crud.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
