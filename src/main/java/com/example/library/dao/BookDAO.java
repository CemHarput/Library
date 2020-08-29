package com.example.library.dao;

import com.example.library.model.Book;

import java.util.List;
import java.util.UUID;

public interface BookDAO {
    int insertBook(UUID id, Book book);

    default int insertBook(Book book){
        UUID id=UUID.randomUUID();
        return insertBook(id,book);


    }
    List<Book> selectAllBook(); // to review the all book
}
