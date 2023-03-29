package lesson1;

public class Main {
    public static void main(String[] args) {
        Author chuckPalahniuk = new Author("Chuck Palahniuk");
        Book haunted = new Book("Haunted", 2005);
        System.out.println("authorName = " + chuckPalahniuk.getAuthorName());
        System.out.println("nameOfTheBook = " + haunted.getNameOfTheBook());
        System.out.println("ageOfPublication = " + haunted.getAgeOfPublication());
        System.out.println();
        Author georgeMartin = new Author("George Martin");
        Book gameOfThrones = new Book("A Game of Thrones", 1996);
        System.out.println("authorName = " + georgeMartin.getAuthorName());
        System.out.println("nameOfTheBook = " + gameOfThrones.getNameOfTheBook());
        System.out.println("ageOfPublication = " + gameOfThrones.getAgeOfPublication());
        gameOfThrones.setAgeOfPublication(2010);
        System.out.println("ageOfPublication = " + gameOfThrones.getAgeOfPublication());
    }
}