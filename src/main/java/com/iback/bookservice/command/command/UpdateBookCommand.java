package com.iback.bookservice.command.command;

public class UpdateBookCommand {
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;

    public UpdateBookCommand(String bookId, String name, String author, Boolean isReady) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.isReady = isReady;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getReady() {
        return isReady;
    }

    public void setReady(Boolean ready) {
        isReady = ready;
    }
}
