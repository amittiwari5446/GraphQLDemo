package com.example.graphqldemo.services;

import com.example.graphqldemo.entities.Book;
import com.example.graphqldemo.repositories.BookRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    BookRep bookRep;

    public BookServiceImpl(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    @Override
    public Book create(Book book) {
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRep.findAll();
    }

    @Override
    public Book getBook(int bookId) {
        return this.bookRep.findById(bookId)
                .orElseThrow(()->new RuntimeException("Book you are looking for not found"));
    }
}
