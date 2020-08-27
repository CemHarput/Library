package com.example.library.dao;

import com.example.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeBookDAO implements BookDAO {

    private static List<Book> BookDB =new ArrayList<>();


    @Override
    public int insertBook(UUID id, Book book) {



        return 1;
    }
}
