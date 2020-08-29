package com.example.library.api;

import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.library.service.BookService;

import java.util.List;

@RequestMapping("api/Book")
@RestController
public class BookController {
           private BookService bookService;

           @Autowired
           public BookController(BookService bookService) {
           this.bookService = bookService;
           }

    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);

    }

    @GetMapping
    public List<Book> getAllBook(){

         return bookService.getAllBook();
    }

}
