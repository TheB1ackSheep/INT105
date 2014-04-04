/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tut_1;

import helper.DerbyHelper;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author INT105
 */
public class TestBookDB {
    public static void main(String[] args)throws Exception  {
        DerbyHelper db = new DerbyHelper("Library", 1527,"app","app");
//        List<String> cmd = Files.readAllLines(Paths.get("DataBook.txt"), StandardCharsets.UTF_8);
//        for(String s : cmd){
//            List<String> params = Arrays.asList(s.split(","));
//            db.executeUpdate("INSERT INTO Book (isbn,bookname,author) VALUES(?,?,?)", params);            
//        }
//        ResultSet res = db.query("SELECT * FROM book");
//        System.out.printf("%10s %-30S %-30S\n","ISBN","BOOKNAME","AUTHOR");
//        System.out.println("=================================================");
//        while(res.next()){
//            System.out.printf("%10s %-30s %-30s\n",res.getString("isbn"),
//                    res.getString("bookname"),res.getString("author"));
//        }
//        db.close(); 
//        Scanner sc = new Scanner(System.in);        
//        String sql = "SELECT * FROM BOOK";
//        ResultSet res = db.query(sql);
//        int col = res.getMetaData().getColumnCount();
//        String ans = "";
//        List<String> params = new ArrayList<>();
//        List<String> colName = new ArrayList<>();
//        do{           
//            for(int i=1;i<=col;i++){            
//                String cName = res.getMetaData().getColumnName(i);
//                System.out.print("Enter book's "+cName+" : ");
//                colName.add(cName);
//                params.add(sc.nextLine());
//            }
//            System.out.println("===============================");
//            System.out.println("Are you sure to add this book ?");
//            System.out.println("===============================");        
//            for(int i=0;i<colName.size();i++){
//                System.out.println(colName.get(i)+" : "+params.get(i));
//            }
//            System.out.print("\nAnswer (Y/N) :");
//            ans = sc.next();
//        }while(ans.toLowerCase().equals("n"));
//        
//        sql = "INSERT INTO book VALUES(?,?,?)";
//        db.executeUpdate(sql, params);
//        System.out.println("Insert complete !!!");
        
        Scanner sc = new Scanner(System.in);
        String input=null;
        do{
            System.out.println("-----------------Library System-----------------");
            System.out.println("1. Find book by ISBN");
            System.out.println("2. Find book by name");
            System.out.println("------------------------------------------------");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.print("Select : ");
            input = sc.next();
            if(input.equals("1")){
                System.out.print("Enter book's ISBN : ");
                input = sc.next();
                List<Book> books = Book.findByIsbn(input);
                System.out.printf("%10s %-30S %-30S\n","ISBN","BOOKNAME","AUTHOR");
                System.out.println("=================================================");
                if(books.size()>0)
                    for(Book b : books){
                        System.out.printf("%10s %-30S %-30S\n",b.getIsbn(),b.getBookName(),b.getAuthor());
                    }
                else
                    System.out.println("NOT FOUND!!!");
            }else if(input.equals("2")){
                System.out.print("Enter book's name : ");
                input = sc.next();
                List<Book> books = Book.findByName(input);
                System.out.printf("%10s %-30S %-30S\n","ISBN","BOOKNAME","AUTHOR");
                System.out.println("=================================================");
                 if(books.size()>0)
                    for(Book b : books){
                        System.out.printf("%10s %-30S %-30S\n",b.getIsbn(),b.getBookName(),b.getAuthor());
                    }
                else
                    System.out.println("NOT FOUND!!!");
            }               
            System.out.println("");
        }while(!input.equals("0"));
    }
   
}
