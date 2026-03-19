package com.library.librarysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.librarysystem.model.Book;
import com.library.librarysystem.repository.BookRepository;

@Service
public class LibraryService {

    @Autowired
    BookRepository repo;

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public String addBook(Book book) {

        var existing = repo.findByTitleIgnoreCaseAndAuthorIgnoreCase(
                book.getTitle(), book.getAuthor());

        if (existing.isPresent()) {
            return "Book Already Exists ⚠️";
        }

        repo.save(book);
        return "Book Added Successfully ✅";
    }

    public List<Book> search(String keyword) {
        return repo.findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(keyword, keyword);
    }

    public List<Book> sortBooks() {
        return repo.findAll()
                .stream()
                .sorted((a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()))
                .toList();
    }
}