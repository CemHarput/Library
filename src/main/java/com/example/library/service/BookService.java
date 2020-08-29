package com.example.library.service;

import com.example.library.dao.BookDAO;
import com.example.library.model.Book;
import com.example.library.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookDAO bookDAO;
    private BookRepo bookRepo;
    @Autowired
    public BookService(@Qualifier("fakeBook") BookDAO bookDAO, BookRepo bookRepo) {
        this.bookDAO = bookDAO;
        this.bookRepo = bookRepo;
    }

    public int addBook(Book book)
    {
        return  bookDAO.insertBook(book);
    }

    public List<Book> getAllBook(){
        return bookDAO.selectAllBook();
    }

}
