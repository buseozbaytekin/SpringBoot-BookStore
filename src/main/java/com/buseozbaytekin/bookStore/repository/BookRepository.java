package com.buseozbaytekin.bookStore.repository;

import com.buseozbaytekin.bookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {//ugulama ile book veritabanı arasında köprü olacak

}
