import java.util.Scanner;

public class Menu{

  /** 
  *Library Card Catalog code
  *wrapped normally......
  */
 
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    CardCatalog cardCatalog = new CardCatalog();
    System.out.println("Choose an option \n1)Adding a book\n2)Getting card by given string");
    System.out.println("3)removing a book\n4)Print all books");
    int option = in.nextInt();
    while (option != 0) {
      if (option == 1) {
        cardCatalog.addACard();
      } else if (option == 2) {
        System.out.println("Choose an option \n1)Getting card by title\n2)Getting card by author");
        System.out.println("3)Getting card of given subject ");
        int option1 = in.nextInt();
        switch (option1) {
          case 1: cardCatalog.getATitle();
                  break;
          case 2: cardCatalog.getAnAuthor();
                  break;
          case 3: cardCatalog.getSubject();
                  break;
          default: System.out.println("nothing");
                   break;
        }
      } else if (option == 3) {
        cardCatalog.removeATitle();
      } else if (option == 4) {
        cardCatalog.printTheCatalog();
      }
      System.out.println("Choose an option \n1)Adding a book\n2)Getting card by given string");
      System.out.println("3)removing a book\n4)Print all books");
      option = in.nextInt();
    }
  }
}

