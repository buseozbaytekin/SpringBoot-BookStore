package com.buseozbaytekin.bookStore;

import com.buseozbaytekin.bookStore.model.Book;
import com.buseozbaytekin.bookStore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class);
		//SpringApplication.run(BookStoreApplication.class, args);

	}


	@Override //burada commanLineRunner ın sağladığı run metodunu uygulama ayağa kalkarken çalıştırabiliyorum. aksi halde yalnızca main çalışıyor
	public void run(String... args) throws Exception {
		Book book1 = Book.builder().name("Head First Java").author("Kathy Sierra").price(10.0).stock(10).build();
		//bookta verdiğimiz builder annotation ı sağlıyor bu satırı. constructorın şartlarından bağımsız nesne oluşturduk
		Book book2 = Book.builder().name("Head First Design Patterns").author("Kathy Sierra").price(15.0).stock(3).build();
		Book book3 = Book.builder().name("Spring Boot in Action").author("Craig Walls").price(11.1).stock(12).build();
		bookRepository.saveAll(Arrays.asList(book1, book2, book3));

	}
}
