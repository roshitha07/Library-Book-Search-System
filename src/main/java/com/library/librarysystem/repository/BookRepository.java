package com.library.librarysystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarysystem.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // for duplicate checking
    Optional<Book> findByTitleIgnoreCaseAndAuthorIgnoreCase(String title, String author);

    // for search
    List<Book> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author);

}