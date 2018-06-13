
package com.potatosaucevfx.thymeleaf.models;

/**
 * @author Richard Nader <richard.nader@fynydd.com>
 */
public class Book {

    private long bookId;
    private String name;
    private String author;

    public Book(long bookId, String name, String author) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
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
}
