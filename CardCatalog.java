
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

public class CardCatalog {
  Scanner input =  new Scanner(System.in);
  String[] orderByTitle = new String[10];
  List<Card> cards  = new ArrayList<Card>();
  String[] orderByAuthor = new String[10];
  String[] orderBySubject = new String[10];
    
    
  /** 
   *Library Card Catalog code
   *wrapped normally......
   */
  
  @SuppressWarnings("resource")
  public static void doubleCapacity(String[] array){
    int wordCount = 0;
    int arrayGrowth = 500;
    array = new String[10];
    String strLine = null;
    while (strLine  != null)   {
      // Store the content into an array
      Scanner s = new Scanner(strLine);
      while (s.hasNext()) {
        if (array.length == wordCount) {
          // expand list
          array = Arrays.copyOf(array, array.length + arrayGrowth);
        }
        array[wordCount] = s.next();
        wordCount++;
      } 
    }
  }
  

  /** 
   *Library Card Catalog code
   *wrapped normally......
   */
  public void addACard() {
    Card card = new Card();
    int index = 0;
    doubleCapacity(orderByTitle);
    doubleCapacity(orderByAuthor);
    doubleCapacity(orderBySubject);
    
    
    System.out.println("Title of book is : ");
    card.titleOfBook = input.next();
    orderByTitle[index] = card.titleOfBook;
    System.out.println("Author of book is : ");
    card.autherOfBook = input.next();
    orderByAuthor[index] = card.autherOfBook;
    System.out.println("Subject Of Book is : ");
    card.subjectOfBook = input.next();
    orderBySubject[index] = card.subjectOfBook;
    cards.add(card) ; 
    System.out.println(card);
    System.out.println();
  }
   
  /** 
   *Library Card Catalog code
   *wrapped normally......
   */
  public void printTheCatalog() {
    System.out.println("choose an option:\n1)print all sorting by title");
    System.out.println("2)print all sorting by author\n3)print all sorting by Subject");
    int option1 = input.nextInt();
    if (option1 == 1) {
      Collections.sort(cards, Card.OrderByTitle);
      System.out.println("books ordered by title: " + cards);
    } else if (option1  == 2) {
      Collections.sort(cards, Card.OrderByAuthor);
      System.out.println("books ordered by Author: " + cards);
    } else if (option1 == 3) {
      Collections.sort(cards, Card.OrderBySubject);
      System.out.println("books ordered by Subject: " + cards);
    }
  }
  
  /** 
   *Library Card Catalog code
   *wrapped normally......
   */   
  public void getATitle() {
    System.out.println("Give any title: ");
    String key = input.next();
    for (Card s: cards) {
      if (s.titleOfBook.equals(key)) {
        System.out.println(s.titleOfBook + " " + s.autherOfBook + " " + s.subjectOfBook);
      } 
    }
    System.out.println("not Found");
  }
  
  /** 
   *Library Card Catalog code
   *wrapped normally......
   */
  public void getAnAuthor() {
    System.out.println("Give author name: ");
    String key = input.next();
    for (Card s: cards) {
      if (s.autherOfBook.equals(key)) {
        System.out.println(s.titleOfBook + " " + s.autherOfBook + " " + s.subjectOfBook);
      } 
    }
  }

  /** 
   *Library Card Catalog code
   *wrapped normally......
   */
  public void getSubject() {
    System.out.println("give any Subject: ");
    String subject = input.next();
    for (Card s: cards) {
      if (s.subjectOfBook.equals(subject)) {
        System.out.println(s.titleOfBook + " " + s.autherOfBook + " " + s.subjectOfBook);
      } 
    }
    System.out.println("not Found");
  }

  /** 
   *Library Card Catalog code
   *wrapped normally......
   */
  public void removeATitle() {
    System.out.println("Enter title which need to remove: ");
    String title = input.next();
    for (Card s: cards) {
      if (s.titleOfBook.equals(title)) {
        cards.remove(s);
        System.out.println(cards);
        break;
      }
    }
    
  }
}
