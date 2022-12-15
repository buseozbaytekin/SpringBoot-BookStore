package com.buseozbaytekin.bookStore.controller;

import com.buseozbaytekin.bookStore.dto.BookOrderRequest;
import com.buseozbaytekin.bookStore.model.Book;
import com.buseozbaytekin.bookStore.model.Order;
import com.buseozbaytekin.bookStore.service.BookService;
import com.buseozbaytekin.bookStore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;
    private final BookService bookService;

    public BookStoreController(OrderService orderService, BookService bookService) {
        this.orderService = orderService;
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> bookList = bookService.getAllBooks();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orderList = orderService.getAllOrders();
        return ResponseEntity.ok(orderList);
    }

    @PostMapping
    public ResponseEntity<Order> putAndOrder(@RequestBody BookOrderRequest bookOrderRequest){
    Order order = orderService.putAndOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUserName());
    return ResponseEntity.ok(order);
    }
}
