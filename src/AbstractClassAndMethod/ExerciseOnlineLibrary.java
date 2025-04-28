package AbstractClassAndMethod;

class Library{
    String [] books;
    int no_of_Books;
    Library(){
        this.books=new String[100];
        this.no_of_Books=0;
    }
    void addBook(String book){
        this.books[no_of_Books] =book;
        no_of_Books++;
        System.out.println(book +"has been added successfully!!");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for(String books:this.books){
            if(books==null){
                continue;
            }
            System.out.println("*"+books);
        }
    }
    void issuedBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
            else {
                System.out.println("This Book Does Not Exit In Library");
            }
        }

    }
    void returnBook(String book){
        addBook(book);
    }
}
public class ExerciseOnlineLibrary {
    public static void main(String[] args) {
Library lab=new Library();
lab.addBook("C++");
        lab.addBook("JAVA");
        lab.addBook("Python");
        lab.addBook("Data Structure");
lab.showAvailableBooks();
lab.issuedBook("JAVA");
        lab.showAvailableBooks();
        lab.returnBook("Web Development");
        lab.issuedBook("JAVA");
        lab.showAvailableBooks();

    }
}
