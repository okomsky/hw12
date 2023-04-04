package lesson2;

public class Author {
    private String authorName;
    lesson1.Author chuckPalahniuk = new lesson1.Author("Chuck Palahniuk");
    lesson1.Author georgeMartin = new lesson1.Author("George Martin");

    public Author(String authorName){

        this.authorName = authorName;
    }

    public String getAuthorName() {

        return this.authorName;
    }
    @Override
    public String toString() {
        return authorName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        lesson1.Author c2 = (lesson1.Author) other;
        return authorName.equals(c2.getAuthorName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }
}
