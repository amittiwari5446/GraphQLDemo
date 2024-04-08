package com.example.graphqldemo.controllers;

import com.example.graphqldemo.entities.Book;
import com.example.graphqldemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ControllerBook {

    @Autowired
    private BookService bookService;

    //create
     public Book create(@RequestBody Book book){
         return this.bookService.create(book);
     }

     @QueryMapping("allBooks")
     public List<Book> getAll(){
        return this.bookService.getAll();
     }

     @QueryMapping("getBook")
     public Book getBook(@Argument int bookId){
        return this.bookService.getBook(bookId);
     }
}
