package lesson1;

public class Book {
     private Author authorName;
     private int ageOfPublication;
     private String nameOfTheBook;

     public Book(String nameOfTheBook, int ageOfPublication, Author authorName) {
          this.authorName = authorName;
          this.nameOfTheBook = nameOfTheBook;
          this.ageOfPublication = ageOfPublication;
     }

     public Author getAuthorName() {
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
          Book c2 = (Book) other;
          return nameOfTheBook.equals(c2.nameOfTheBook);
     }

     @Override
     public int hashCode() {
          return java.util.Objects.hash(nameOfTheBook);
     }
}