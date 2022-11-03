/*
 * Eva Kinnel
 * Building class
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 */
public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    /* constructor for Building class
     * 
     * @param String name - building name, String address - building address, int nFloors - number of floors
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /* accessor for building name
     * 
     * @return String - the name of the building
     */
    public String getName() {
        return this.name;
    }

    /* accessor for building address
     * 
     * @return String - the address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /* accessor for building number of floors
     * 
     * @return int - the number of floors a building has
     */
    public int getFloors() {
        return this.nFloors;
    }

    /* method to return a cocatonated string of the attributes
     * 
     * @return String - a statement describing a building
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}