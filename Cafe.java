/*
 * Eva Kinnel
 * Cafe class
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 */public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /* constructor for Cafe class
     * 
     * @param String name - building name, String address - building address, int nFloors - number of floors, int nCoffeeOunces - oz of coffee in inventory, int nSugarPackets - number of sugar packets in inventory, int nCreams number of creams in inventory, int nCups - number of cups in inventory
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;

    }

    /* 
     * accessor for cafe inventory
     */
    public void getInventory(){
        System.out.println("Coffee (oz): " + nCoffeeOunces + "\nCups: " + nCups + "\nSugar Packets: " + nSugarPackets + "\nCreams: " + nCreams);
    }

    /* decreses the number for each value if it is "bought", and calls the restock method if the stock gets low
     * 
     * @param int size - oz of coffee bought, int packetsUsed - number of sugar packets used, int creamsUsed - the number of creams used
     */
    public void sellCoffee(int size, int packetsUsed, int creamsUsed){
        this.nCups = nCups - 1;
        this.nCoffeeOunces = nCoffeeOunces - size;
        this.nSugarPackets = nSugarPackets - packetsUsed;
        this.nCreams = nCreams - creamsUsed;

        if (nCoffeeOunces <= 30){
            System.out.println("Coffee Low");
            this.restock(0, 370, 0, 0);
            System.out.println("Coffee has been restocked");
        }
        if (nCups < 10){
            System.out.println("Cups Low");
            this.restock(550, 0, 0, 0);
            System.out.println("Cups have been restocked");
        }
        if (nSugarPackets < 10){
            System.out.println("Sugar Low");
            this.restock(0, 0, 90, 0);
            System.out.println("Sugar packets have been restocked");
        }
        if (nCreams < 6){
            System.out.println("Creams Low");
            this.restock(0, 0, 0, 194);
            System.out.println("Creams have been restocked");
        }
    }

    /* increases each value by a ceratain amount
     * 
     * @param int plusCups - number of cups to be added to inventory, int plusCoffee - oz of coffee to be added to inventory, int plusPackets - number of sugar packets to be added to inventory, int plusCreams - number of creams to be added to inventory
     */
    private void restock(int plusCups, int plusCoffee, int plusPackets, int plusCreams){
        this.nCups = nCups + plusCups;
        this.nCoffeeOunces = nCoffeeOunces + plusCoffee;
        this.nSugarPackets = nSugarPackets + plusPackets;
        this.nCreams = nCreams + plusCreams;
    }
    
    public static void main(String[] args) {
        Cafe coffEva = new Cafe("COFFEva HOUSEva", "648 Elephant Plush Way", 1, 400, 100, 200, 600);
        coffEva.getInventory();
        coffEva.sellCoffee(8, 0, 1);
        coffEva.getInventory();
        coffEva.sellCoffee(350, 8, 1);
        coffEva.getInventory();
        coffEva.sellCoffee(15, 0, 1);
        coffEva.getInventory();
        
    }
    
}
