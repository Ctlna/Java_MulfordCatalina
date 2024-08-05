/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Multiplicidad;

/**
 *
 * @author camper
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Author author = new Author ("J.K. Rowling");
        Book book1 = new Book ("Harry Potter and the Sorcerer's Store");
        Book book2 = new Book ("Harry Potter and the Chamber of secrests");
        
        author.addBook(book1);
        author.addBook(book2);
        
        System.out.println(author.getBooks().get(0));
    
        for (int i=0; i<author.getBooks().size();i++){
            System.out.println("Book #"+(i+1)+":"+author.getBooks().get(i).getTitle());
        
        }
    }
    
}
