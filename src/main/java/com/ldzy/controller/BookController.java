package com.ldzy.controller;

import com.ldzy.pojo.Book;
import com.ldzy.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping("/books")
@RestController
public class BookController {
    //自动注入属性的bean值:按名注入,按类型注入
    @Autowired
    private BookService bookService;

    //查询站内数据
    @GetMapping("/getSiteData")
    public MyResponse getSiteData(){
        return null;
    }

    //查询最热门下载的十本书
    @GetMapping("/getHot")
    public MyResponse getHotBooks(){
        List<Book> books=this.bookService.getHotBooks();
        log.info(books.size()+"");
        if (books!=null) return new MyResponse(ResultCode.SUCCESS_QUERY,books);
        return new MyResponse(ResultCode.ERROR_QUERY_GOODS);
    }

    //查一本书
    @GetMapping("{id}")
    public MyResponse getBookById(@PathVariable("id") long id){
        log.info("您输入的参数是:"+id);
        Book book=bookService.getBookById(id);
        return new MyResponse(ResultCode.SUCCESS_QUERY,book);
    }

    //查部分书:传book对象参数,页面使用json格式---->pojo对象,控制器方法参数要添加注解
    @PostMapping()
    public MyResponse getBooksByBook(@RequestBody Book book){
        log.info("getBooksByBook:"+book.getBook_title());
        List<Book> books=new ArrayList<Book>();
        Book book1 = new Book();
        book1.setId(1);
        Book book2 = new Book();
        book2.setId(2);
        books.add(book2);
        return new MyResponse(ResultCode.SUCCESS_QUERY,books);
    }

    //查所有书
    @GetMapping()
    public MyResponse getAllBook(){
        log.info("getAllBook:");
        List<Book> books=new ArrayList<Book>();
        Book book1 = new Book();
        book1.setId(1);
        books.add(book1);
        Book book2 = new Book();
        book2.setId(2);
        books.add(book2);
        return new MyResponse(ResultCode.SUCCESS_QUERY,books);
    }

    //修改书:传book对象参数,页面使用json格式
    @PutMapping()
    public MyResponse UpdateBook(@RequestBody @Validated Book book){
        log.info("UpdateBook:"+book.getBook_title());
        return new MyResponse(ResultCode.SUCCESS_UPDATE);
    }

    //删除一本
    @DeleteMapping("/{id}")
    public MyResponse DelBook(@PathVariable("id") int id){
        log.info("DelBook:"+id);
        return new MyResponse(ResultCode.SUCCESS_DELETE);
    }


}
