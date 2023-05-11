package com.ldzy.service.impl;

import com.ldzy.mapper.BookMapper;
import com.ldzy.pojo.Book;
import com.ldzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public Book getBookById(long id) {
        return bookMapper.getBookById(id);
    }
}
