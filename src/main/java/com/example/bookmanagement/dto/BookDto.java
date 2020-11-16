package com.example.bookmanagement.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ISBN;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BookDto {

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @NotEmpty(
            message = "book.title.null")
    private String title;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @NotEmpty(
            message = "book.author.null")
    private String author;

    @NotNull(
            message = "book.price.null")
    private Long price;

    @ISBN(
            message = "book.isbn.invalid")
    private String isbn;

}
