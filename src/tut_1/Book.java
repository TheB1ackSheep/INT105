/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tut_1;

import helper.DerbyHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author INT105
 */
public class Book {
    private String isbn;
    private String bookName;
    private String author;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + '}';
    }

    public static List<Book> findByIsbn(String isbn) throws Exception{
        List<Book> books = new ArrayList<>();
        DerbyHelper db = new DerbyHelper("Library", 1527, "app", "app");
        List<String> params = new ArrayList<>();
        params.add(isbn+"%");
        ResultSet res = db.query("SELECT * FROM book WHERE isbn LIKE ?",params);
        while(res.next()){
            Book book = new Book();
            book.setIsbn(res.getString("isbn"));
            book.setBookName(res.getString("bookname"));
            book.setAuthor(res.getString("author"));
            books.add(book);
        }
        db.close();
        return books;
    }
    
    public static List<Book> findByName(String name) throws Exception{
        List<Book> books = new ArrayList<>();
        DerbyHelper db = new DerbyHelper("Library", 1527, "app", "app");
        List<String> params = new ArrayList<>();
        params.add(name+"%");
        ResultSet res = db.query("SELECT * FROM book WHERE bookname LIKE ?",params);
        while(res.next()){
            Book book = new Book();
            book.setIsbn(res.getString("isbn"));
            book.setBookName(res.getString("bookname"));
            book.setAuthor(res.getString("author"));
            books.add(book);
        }
        db.close();
        return books;
    }



}
