package com.ldzy.service;

import com.ldzy.pojo.Book;
import com.ldzy.pojo.SiteData;

import java.util.List;

public interface BookService {
    public Book getBookById(long id);
    public List<Book> getHotBooks();
    public SiteData getSiteData();
}
