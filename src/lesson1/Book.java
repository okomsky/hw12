package lesson1;

public class Book {
     private String authorName;
     private int ageOfPublication;
     private String nameOfTheBook;

     public Book(String nameOfTheBook, int ageOfPublication) {
          this.authorName = authorName;
          this.nameOfTheBook = nameOfTheBook;
          this.ageOfPublication = ageOfPublication;

     }

     public String getAuthorName() { return this.authorName;}

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