package com.example.library.repo;

import com.example.library.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepo extends CrudRepository<Book, UUID> {
       public Book findFirstByBName(String name);
}
