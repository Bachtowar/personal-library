package com.bakhti.PersonalLibraryDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.bakhti.PersonalLibraryDemo.entity.Book;

public interface BookRepository extends CrudRepository <Book, Long>{

}
