package lesson2;

public class Main {
    public static void main(String[] args) {
        Author chuckPalahniuk = new Author("Chuck Palahniuk");
        Book haunted = new Book("Haunted", 2005);
        Author georgeMartin = new Author("George Martin");
        Book gameOfThrones = new Book("A Game of Thrones", 1996);
        System.out.println(chuckPalahniuk + " " + haunted);
        System.out.println(georgeMartin + " " + gameOfThrones);
    }
}