package com.example.bookmanagement.adapter;

import com.example.bookmanagement.config.Constant;
import com.example.bookmanagement.dto.BookDto;
import com.example.bookmanagement.entity.BookEntity;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Component
@Lazy
public class BookAdapter {

    public BookEntity adapt(final BookDto bookDto) {
        Assert.notNull(bookDto, Constant.ADAPTER_INPUT_VALIDATION);
        /* use builders */
        final BookEntity bookEntity = new BookEntity();
        bookEntity.setId(bookDto.getId());
        bookEntity.setTitle(bookDto.getTitle());
        bookEntity.setAuthor(bookDto.getTitle());
        bookEntity.setPrice(bookDto.getPrice());
        bookEntity.setIsbn(bookDto.getIsbn());
        return bookEntity;
    }

    /*
     * public BookEntity adapt(final Long bookId, BookDto bookDto) { Assert.notNull(bookDto,
     * Constant.ADAPTER_INPUT_VALIDATION); // bookRepository.findBookById(bookId)
     * if(bookDto.getTitle().isEmpty()||bookDto.getAuthor().isEmpty()) return null; BookEntity bookEntity = new
     * BookEntity(); bookEntity.setId(bookId); bookEntity.setTitle(bookDto.getTitle());
     * bookEntity.setAuthor(bookDto.getAuthor()); bookEntity.setPrice(bookDto.getPrice());
     * bookEntity.setIsbn(bookDto.getIsbn()); return bookEntity; // normal creation and conversion of Dto to Entity
     * object }
     */

    public BookDto adapt(final BookEntity bookEntity) {
        Assert.notNull(bookEntity, Constant.ADAPTER_INPUT_VALIDATION);
        // similar to above
        final BookDto bookDto = new BookDto();
        bookDto.setId(bookEntity.getId());
        bookDto.setTitle(bookEntity.getTitle());
        bookDto.setAuthor(bookEntity.getAuthor());
        bookDto.setPrice(bookEntity.getPrice());
        bookDto.setIsbn(bookEntity.getIsbn());
        return bookDto;
    }

    public List<BookDto> adapt(final List<BookEntity> bookEntityList) {
        // return the List format as is
        final List<BookDto> bookDtoList = new ArrayList<>();
        /*
         * basic method: for(int i=0;i<bookEntityList.size();i++){ bookDtoList.add(adapt(bookEntityList.get(i))); }
         */
        for (final BookEntity bookEntity : bookEntityList) {
            bookDtoList.add(adapt(bookEntity));
        }
        return bookDtoList;
    }

}