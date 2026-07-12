public class Aggregation {

    public static void main(String[] args){

//        Aggregation : It is when on Java object have another object in it , but those objects exist independently
//        on each other unlike composition

        Book book1 = new Book("Harry Potter", 123);
        Book book2 = new Book("Long way to Death", 987);

        Book[] books = {book1, book2};
        book1.showInfo();

        Library library = new Library("RCA Lib", "Nyabihu", books);
        library.libraryInfo();

        for(Book book : library.books){
            System.out.println(book);
        }


    }


}

class Book{
    String title;
    int id;

    Book(String title, int id){
        this.title = title;
        this.id = id;
    }

    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
    }

}

class Library{

    String name;
    String address;
    Book[] books;

    Library(String name, String address, Book[] books){
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public void libraryInfo(){
        System.out.printf("This is %s located at %s\n", this.name, this.address);
    }
}
