package sushant;

import java.util.ArrayList;

class Book{
    public String name, author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    ArrayList<Book> books;
    MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added ");
        this.books.add(book);
    }
    public void issueBook(Book book, String name){
        System.out.println("The has been issued by " + name);
        this.books.remove(book);
    }
    public void Return(Book book, String date){
        System.out.println("The has been returned on " + date);
        this.books.add(book);
    }
}
public class Exercise_7 {
    public static void main(String[] args) {
        ArrayList<Book> b = new ArrayList<>();
        Book b1 = new Book("C Programming", "Ruturaj");
        b.add(b1);

        Book b2 = new Book("Java", "Ashutosh");
        b.add(b2);

//        System.out.println(b);

        MyLibrary l  = new MyLibrary(b);
        l.addBook(new Book("Pyhton", "Sumita Aurora"));

//        System.out.println(l.books.get(1));

        l.issueBook(b2, "Sushant");

//        System.out.println(b);

        l.Return(b2, "25/01/23");

        System.out.println(b);

    }
}
