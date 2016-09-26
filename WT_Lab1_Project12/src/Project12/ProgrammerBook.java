package Project12;


public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition) {
        super(title, author, price, edition);
    }

    @Override
    public String toString() {
        return "ProgrammerBook " + title + " " + author + " " + price + " " + edition;
    }

    @Override
    public int hashCode() {
        return (price + edition) % 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.title == ((Book)obj).title) {
            return true;
        }
        return false;
    }
}
