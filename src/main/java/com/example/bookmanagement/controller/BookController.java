package com.example.bookmanagement.controller;

import com.example.bookmanagement.adapter.BookAdapter;
import com.example.bookmanagement.dto.BookDto;
import com.example.bookmanagement.entity.BookEntity;
import com.example.bookmanagement.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Class level and method level comment
 */
@RequiredArgsConstructor(
        onConstructor = @__({ @Autowired, @Lazy }))
@RestController
@Slf4j
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    // very rare comment method only for variables
    private final BookAdapter bookAdapter;

    /* also define the exceptions for mapping */

    @PostMapping
    public ResponseEntity<BookDto> createBook(@Valid @RequestBody final BookEntity book) {
        log.info("Book having id {} is successfully created", book.getId());
        /* variable or method comment */
        return new ResponseEntity<>(bookAdapter.adapt(bookService.createBook(book)), OK);
    }

    // Get All Books
    @GetMapping(
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return new ResponseEntity<>(bookAdapter.adapt(bookService.getAllBooks()), OK);
    }

    // Get a Single Book
    @GetMapping(
            value = "/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable(
            value = "id") final Long bookId) {
        return new ResponseEntity<>(bookAdapter.adapt(bookService.findBookById(bookId)), OK);
    }

    @PutMapping(
            value = "/{id}")
    public ResponseEntity<String> updateBook(@PathVariable(
            value = "id") final Long bookId, @Valid @RequestBody final BookDto bookToBeUpdated) {
        // bookService.updateBook(bookId, bookAdapter.adapt(bookToBeUpdated))
        log.info("Book having id {} is successfully updated", bookId);
        return new ResponseEntity<>(bookService.updateBook(bookId, bookAdapter.adapt(bookToBeUpdated)), OK);
    }

    // Delete a Book
    @DeleteMapping(
            value = "/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable(
            value = "id") final Long bookId) {
        log.info("Book having id {} is successfully deleted", bookId);
        return new ResponseEntity<>(bookService.deleteBook(bookId), OK);
    }

}