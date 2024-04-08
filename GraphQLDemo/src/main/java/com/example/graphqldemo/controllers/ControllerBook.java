package com.example.graphqldemo.controllers;

import com.example.graphqldemo.entities.Book;
import com.example.graphqldemo.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ControllerBook {

    @Autowired
    private BookService bookService;

    //create
    @MutationMapping("createBook")
     public Book create(@Argument BookInput book){
        Book b=new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        b.setAuthor(book.getAuthor());
        return this.bookService.create(b);
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
@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private Double price;
    private int pages;
}
