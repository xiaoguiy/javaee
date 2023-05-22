package com.ldzy.service.impl;

import com.ldzy.mapper.BookMapper;
import com.ldzy.pojo.Book;
import com.ldzy.pojo.SiteData;
import com.ldzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public Book getBookById(long id) {
        return bookMapper.getBookById(id);
    }

    public List<Book> getHotBooks(){
        return this.bookMapper.getHotBooks();
    }

    @Override
    public SiteData getSiteData() {
        //分别调用dao中不同的方法，来获取各种数据
        SiteData siteData=new SiteData();
        
        return siteData;
    }
}
