/*
 * Eva Kinnel
 * House class
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 */
import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

   /* constructor for House class
    * 
    * @param String name - building name, String address - building address, int nFloors - number of floors, boolean hasDiningRoom - whether the house has a dining room
    */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
  }

   /* accessor for dining room status (true or false)
    * 
    * @return boolean - whether or not the House has a dining room
    */
  public boolean hasDiningRoom(){
    if (hasDiningRoom == true){
      return true;
    } else{
      return false;
    }
  }

   /* accessor for number of House residents
    * 
    * @return int size - the number of residents currently in the House
    */
  public int nResidents(){
    return this.residents.size();
  }

  /* adds a resident to the residents arrayList by name
   * 
   * @param String name - the name of a resident to be added to the house arrayList
   */
  public void moveIn(String name){
    residents.add(name);
  }

  /* removes a resident from the residents arrayList by name
   * 
   * @param String name - the name of a resident to be removed from the house arrayList
   * @return String - the name of the resident that was removed
   */
  public String moveOut(String name){ // return the name of the person who moved out
    residents.remove(name);
    return name;
  } 

  /* checks if a specific name is in list residents
   * 
   * @param String person - the name of a person whose residency is being questioned
   * @return boolean - whether or not that person is in the house
   */
  public boolean isResident(String person){
    if (residents.contains(person)){
      System.out.println("Yes, " + person + " is a resident");
      return true;
    } else{
      System.out.println("No, " + person + " is not a resident");
      return false;
    }

  }

  public static void main(String[] args) {
    House wilder = new House("Wilder House", "1 Mandelle Road", 4, true);
    wilder.moveIn("Eva");
    // wilder.moveOut("Eva");
    wilder.isResident("Eva");
    System.out.println(wilder.residents);
  }

}

