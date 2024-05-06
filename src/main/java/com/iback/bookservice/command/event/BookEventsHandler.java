package com.iback.bookservice.command.event;

import com.iback.bookservice.command.data.Book;
import com.iback.bookservice.command.data.BookResponsitory;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookEventsHandler {
    @Autowired
    private BookResponsitory bookResponsitory;
    @EventHandler
    public void on(BookCreatedEvent event){
        Book book=new Book();
        BeanUtils.copyProperties(event,book);
        bookResponsitory.save(book);
    }


}

