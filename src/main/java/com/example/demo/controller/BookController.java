package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

import com.example.demo.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookController {
    
    private BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
