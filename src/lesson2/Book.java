package lesson2;

public class Book {
     private String authorName;
     private int ageOfPublication;
     private String nameOfTheBook;

     public Book(String nameOfTheBook, int ageOfPublication, String authorName) {
          this.authorName = authorName;
          this.nameOfTheBook = nameOfTheBook;
          this.ageOfPublication = ageOfPublication;
     }

     public String getAuthorName() {
          return this.authorName;
     }

     public String getNameOfTheBook() {
          return this.nameOfTheBook;
     }

     public int getAgeOfPublication() {
          return this.ageOfPublication;
     }

     public void setAgeOfPublication(int ageOfPublication) {
          this.ageOfPublication = ageOfPublication;
     }

     @Override
     public String toString() {
          return authorName + ": " + nameOfTheBook + " (year of publication) " + ageOfPublication;
     }

     @Override
     public boolean equals(Object other) {
          if (this.getClass() != other.getClass()) {
               return false;
          }
          lesson1.Book c2 = (lesson1.Book) other;
          return nameOfTheBook.equals(c2.getNameOfTheBook());
     }

     @Override
     public int hashCode() {
          return java.util.Objects.hash(nameOfTheBook);
     }
}