package lesson2;

import lesson1.Book;

public class Main {
    public static void main(String[] args) {
        lesson1.Book haunted = new Book("Haunted", 2005, "Chuck Palahniuk");
        lesson1.Book gameOfThrones = new Book("A Game of Thrones",  1996, "George Martin");
        System.out.println( " " + haunted);
        System.out.println( " " + gameOfThrones);
    }
}