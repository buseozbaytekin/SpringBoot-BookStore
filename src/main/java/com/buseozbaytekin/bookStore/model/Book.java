package com.buseozbaytekin.bookStore.model;

import lombok.*;

import javax.persistence.*;

@Table
@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//her ürün eklendiğinde id bir artarak set edilecek
    private Integer id;

    private String name;
    private String author;
    private Double price;
    private Integer stock;
}
