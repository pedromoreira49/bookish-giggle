package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

import com.example.demo.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("books")
@AllArgsConstructor
public class BookController {
    
    private BookService bookService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Book> books = bookService.findAll();
        return ResponseEntity.ok(books);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Book book){
        Book bookSaved = bookService.save(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookSaved);
    }
}
