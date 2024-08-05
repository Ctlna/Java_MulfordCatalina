/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiplicidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public class Author {
    private String name;
    private List<Book> books;

    public Author(){}
    
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        books.add(book);
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
}
