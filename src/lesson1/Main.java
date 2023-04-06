package lesson1;

public class Main {
    public static void main(String[] args) {
        Book haunted = new Book("Haunted", 2005, "Chuck Paulahniuk");
        Author chuckPaulahniuk = new Author("Chuck Paulahniuk");
        Book gameOfThrones = new Book("A Game of Thrones",  1996, "George Martin");
        Author georgeMartin = new Author("George Martin");
        System.out.println( " " + haunted);
        System.out.println( " " + gameOfThrones);
    }
}