package com.example.library.dao;

import com.example.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeBook")
public class FakeBookDAO implements BookDAO {

    private static List<Book> BookDB =new ArrayList<>();


    @Override
    public int insertBook(UUID id, Book book) {
        BookDB.add(new Book(id,"A Clash of Kings","test","Song of Ice and Fire","George Martin","Epsilon",2197,"This is a second book"));
        BookDB.add(new Book(id,"Game of Thrones","test1","Song of Ice and Fire","George Martin","Epsilon",2199,"This is a first book"));
        BookDB.add(new Book(id,book.getbName(),book.getbSubName(),book.getbSerialName(),book.getAuthor(),book.getPublishHouse(),book.getIsbn(),book.getDesc())); // if you want  to  add data manually
        return 1;
    }
}
