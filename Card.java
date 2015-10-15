import java.util.Comparator;

public class Card  {

  String titleOfBook;
  String autherOfBook;
  String subjectOfBook;

  public String toString() {
    return (this.titleOfBook + " , " + this.autherOfBook + " , " + this.subjectOfBook);
  }


  public static Comparator<Card> OrderByTitle = new Comparator<Card>() {
    public int compare(Card one, Card other) {
      return one.titleOfBook.compareTo(other.titleOfBook);
    }
  };

  public static Comparator<Card> OrderByAuthor = new Comparator<Card>() {
    public int compare(Card one, Card other) {
      return one.autherOfBook.compareTo(other.autherOfBook);
    }
  };

  public static Comparator<Card> OrderBySubject = new Comparator<Card>() {
    public int compare(Card one, Card other) {
      return one.subjectOfBook.compareTo(other.subjectOfBook);
    }
  };

}


