package sushant;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        no_of_books = 0;
    }
    void addBook(String Book){
        this.books[no_of_books] = Book;
        no_of_books++;
        System.out.println(Book + " has been added");
    }
    void issueBook(String Book){
        for (int i = 0; i < this.books.length; i++){
            if (this.books[i].equals(Book)) {
                System.out.println(Book + " The book has been issue");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Book is not found");
    }
    void returnBook(String Book){
        addBook(Book);
    }
    void showBook(){
        System.out.println("Available Books are: ");
        for (String Book: this.books) {
            if (Book == null){
                continue;
            }
            System.out.println("* " + Book);
        }
    }
}

public class Exercise_4 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Java");
        centralLibrary.addBook("C");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Web 2");
        centralLibrary.addBook("Web 3");

        System.out.println();

        centralLibrary.showBook();

        System.out.println();

        centralLibrary.issueBook("Web 3");

        System.out.println();

        centralLibrary.showBook();

        System.out.println();

        centralLibrary.returnBook("Web 3");

        System.out.println();

        centralLibrary.showBook();
    }
}
