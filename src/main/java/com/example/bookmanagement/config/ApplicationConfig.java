package com.example.bookmanagement.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class ApplicationConfig {

    @Value("book.update.success")
    private String bookUpdateSuccess;
    @Value("book.delete.success")
    private String bookDeleteSuccess;

}