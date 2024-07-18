package org.dexter.generic;

import org.dexter.generic.core.Book;
import org.dexter.generic.core.DVD;
import org.dexter.generic.core.Library;
import org.dexter.generic.core.Magazine;

public class Main {

    public static void main(String[] args) {

        // Create a library for books
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addMedia(new Book("Backend","Dexter"));
        bookLibrary.addMedia(new Book("Front-End","John"));

        // Create a library for magazines
        Library<Magazine> magazineLibrary = new Library<>();
        magazineLibrary.addMedia(new Magazine("National Geographic", "June 2024"));
        magazineLibrary.addMedia(new Magazine("Time", "July 2024"));

        // Create a library for DVDs
        Library<DVD> dvdLibrary = new Library<>();
        dvdLibrary.addMedia(new DVD("Inception", 148));
        dvdLibrary.addMedia(new DVD("The Matrix", 136));



        Book book = bookLibrary.findMediaByTitle("Backend");
        if(book != null){
            System.out.println("Found Book: "+ book.getTitle()+ " by"+ book.getAuthor() );
        }
    }
}
