package lesson1;

public class Book {
     private String nameOfTheBook;
     private int ageOfPublication;
     private class Author {}

     public Book(String nameOfTheBook, int ageOfPublication) {
          this.nameOfTheBook = nameOfTheBook;
          this.ageOfPublication = ageOfPublication;

     }

     public String getNameOfTheBook() {
          return this.nameOfTheBook;
     }

     public int getAgeOfPublication() {
          return this.ageOfPublication;
     }

     public void setAgeOfPublication(int ageOfPublication){
          this.ageOfPublication = ageOfPublication;
     }
}