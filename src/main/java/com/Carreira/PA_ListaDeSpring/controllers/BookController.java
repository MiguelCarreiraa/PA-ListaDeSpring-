package com.Carreira.PA_ListaDeSpring.controllers;

import com.Carreira.PA_ListaDeSpring.models.BookModel;
import com.Carreira.PA_ListaDeSpring.repositories.BookRepository;
import com.Carreira.PA_ListaDeSpring.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookModel>> findAll(){
        List<BookModel> requeste = bookService.findAll();
        return  ResponseEntity.ok().body(requeste);
    }

    @PostMapping
    public ResponseEntity<BookModel> criarBook(@RequestBody BookModel bookModel){
        BookModel novo = bookService.criarBook(bookModel);
        return ResponseEntity.status(201).body(novo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarBook (@PathVariable Long id){
        bookService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookModel> buscarPorId(@PathVariable Long id){
        Optional<BookModel> book = bookService.buscarPorId(id);

        if(book.isPresent()){
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookModel> atualizar(
            @PathVariable Long id,
            @RequestBody BookModel bookModel){

        BookModel atualizado = bookService.atualizar(id, bookModel);

        if(atualizado == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(atualizado);
    }
}
