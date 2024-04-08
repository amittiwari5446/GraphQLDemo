package com.example.graphqldemo.services;

import com.example.graphqldemo.entities.Book;

import java.util.List;

public interface BookService {
    //create
    Book create(Book book);

    //get all
    List<Book> getAll();

    //get single
    Book getBook(int bookId);

}
