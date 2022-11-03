/*
 * Eva Kinnel
 * Library class
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 */
import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;
  // put(), remove(), replace()

  /* constructor for Library class
   * 
   * @param String name - building name, String address - building address, int nFloors - number of floors
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    // HashTable<String, boolean> collection = new HashTable<>(); 

  }


  /* adds a new book to the collection
   * 
   * @param String title - the title of the book
   */
  // public void addTitle(String title){
  //   collection.put(title, false);
  // }

  /* removes a book from the collection
   * 
   * @param String title - the title of the book
   * @return String - the title of the book
   */
  // public String removeTitle(String title){ // return the title that we removed
  //   collection.remove(title);
  //   return title;
  // }

  /* changes a books checkout status from false --> true 
   * 
   * @param String title - the title of the book
   */
  // public void checkOut(String title){
  //   collection.replace(title, false, true);
  // }
  // public void returnBook(String title){
  //   collection.replace(title, true, false);
  // }

  /* changes a books checkout status from true --> false 
   * 
   * @param String title - the title of the book
   */
  // public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
  //   if (collection.contains(title)){
  //     return true;
  //   } else{
  //     return false;
  //   }
  // }

  /* returns true if the title is currently available, false otherwise
   * 
   * @param String title - the title of the book
   * @return boolean - whether the value (checkout status) is true or false
   */
  // // public boolean isAvailable(String title);{ 
  //   // if (value == true){  //need to figure out a way to do this
  //   //   return true;
  //   // } else{
  //   //   return false;
  //   // }
  // }

  /* 
   * prints out the entire collection in an easy-to-read way (including checkout status)
   */
  // public void printCollection(){ 
  //   System.out.print(collection); // this probably will not be pretty
  // }

  public static void main(String[] args) {
    Library lib1 = new Library("Eva", "12 Eva Street", 5);
    // lib1.addTitle("The Magic Horse", false);
    // lib1.printCollection();
    System.out.println(lib1);
  }
  
}

