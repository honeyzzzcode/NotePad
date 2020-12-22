package com.ZLATA;

public class Book extends Record{
    private String title;
    private String author;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    @Override
    public String toString() {
        var str = super.toString();
        return String.format(" %s title %s ;  %s ; %s ", str,title,author,isbn);
    }

    @Override
    public void askData() {
        title = InputUtils.askString("title");
        author = InputUtils.askString("author");
        isbn = InputUtils.askString("isbn");
    }

}
