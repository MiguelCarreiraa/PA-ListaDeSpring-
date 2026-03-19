package com.Carreira.PA_ListaDeSpring.repositories;


import com.Carreira.PA_ListaDeSpring.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<BookModel, Long> {
}
