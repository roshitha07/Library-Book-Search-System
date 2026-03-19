
package com.library.librarysystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.librarysystem.model.Book;
import com.library.librarysystem.service.LibraryService;

@Controller
public class LibraryController {

    @Autowired
    LibraryService service;
@GetMapping("/")
public String home(Model model){
    model.addAttribute("books", service.getAllBooks());
    return "index";
}
   @PostMapping("/addBook")
public String addBook(@RequestParam int id,
                      @RequestParam String title,
                      @RequestParam String author,
                      Model model) {

    String msg = service.addBook(new Book(id, title, author));

    model.addAttribute("message", msg);
    model.addAttribute("books", service.getAllBooks());

    return "index";   // SAME PAGE
}

    @GetMapping("/searchBook")
    public String search(@RequestParam String keyword, Model model) {

        var list = service.search(keyword);

        if (list.isEmpty()) {
            model.addAttribute("message", "No Books Found");
        }

        model.addAttribute("books", list);
        return "result";
    }

    @GetMapping("/sortBooks")
    public String sort(Model model) {

        var list = service.sortBooks();

        if (list.isEmpty()) {
            model.addAttribute("message", "Library Empty");
        }

        model.addAttribute("books", list);
        return "result";
    }
}