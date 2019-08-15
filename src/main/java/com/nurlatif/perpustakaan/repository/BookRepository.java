package com.nurlatif.perpustakaan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.nurlatif.perpustakaan.entity.Book;

/**
 * BookRepository
 */
@Component
@RepositoryRestResource(path = "books")
public interface BookRepository extends CrudRepository<Book, Integer> {
    
}