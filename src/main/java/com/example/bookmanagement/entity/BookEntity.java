package com.example.bookmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(
        name = "books_details")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class BookEntity {

    @Id
    @GeneratedValue(
            strategy = AUTO)
    private Long id;

    /* mostly validation is */
    @Column(
            name = "title")
    private String title;

    @Column(
            name = "author")
    private String author;

    @Column(
            name = "price")
    private Long price;

    @Column(
            name = "isbn")
    private String isbn;

}
