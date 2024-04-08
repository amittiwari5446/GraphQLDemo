package com.example.graphqldemo.repositories;

import com.example.graphqldemo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book, Integer> {
}
