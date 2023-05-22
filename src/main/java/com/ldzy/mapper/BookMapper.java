package com.ldzy.mapper;

import com.ldzy.pojo.Book;

import java.util.List;

public interface BookMapper {
    public Book getBookById(long id);

    public List<Book> getHotBooks();
}
