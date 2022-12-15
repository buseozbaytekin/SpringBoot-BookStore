package com.buseozbaytekin.bookStore.service;

import com.buseozbaytekin.bookStore.model.Book;
import com.buseozbaytekin.bookStore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//Spring boot servisi olduğunu belirttim
//@Transaction bu keyword sync sağlıyor??
public class BookService {
    private final BookRepository bookRepository;

    //burada autowired yazmadık çünkü private final değişkenle birlikte constructorda parametresi geçiyor.
    //spring boot servisleri tarıyor contructor ı çalıştırıyor. içindeki bookRepository objesini oluşturup bookServise geçiyor.
    //singleton olarak bir nesne oluşturuyor burada.
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
