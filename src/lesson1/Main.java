package lesson1;

public class Main {
    public static void main(String[] args) {
        Author chuckPaulahniuk = new Author("Chuck Paulahniuk");
        Book haunted = new Book("Haunted", 2005, chuckPaulahniuk);
        Author georgeMartin = new Author("George Martin");
        Book gameOfThrones = new Book("A Game of Thrones",  1996, georgeMartin);
        System.out.println( " " + haunted);
        System.out.println( " " + gameOfThrones);
    }
}