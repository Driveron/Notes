/**
 * Write a Java class, Flower, that has three instance variables of type String, int,
 * and float, which respectively represent the name of the flower, its number of
 * petals, and price. Your class must include a constructor method that initializes
 * each variable to an appropriate value, and your class should include methods for
 * setting the value of each type, and getting the value of each type.
 * 
 * @author Driveron
 *
 */

public class Flower {

	// define fields (instance variables)
	private String sName;
	private int nPetals;
	private float fPrice;
	
	// define constructors
	Flower() {}   // the default constructor
	Flower(String sName, int nPetals, float fPrice) {
		this.sName = sName;
		this.nPetals = nPetals;
		this.fPrice = fPrice;
	}
	
	// define getters
	public String getName() { return sName; }
	public int getPedals() { return nPetals; }
	public float getPrice() {return fPrice; }
	
	// define setters
	public void setName(String sName) { this.sName = sName; }
	public void setPetals(int nPetals) { this.nPetals = nPetals; }
	public void setPrice(float fPrice) { this.fPrice = fPrice; }
	
	// define utilities
	public void printInfo() {    // print the information of the flower
		System.out.println("Flower info : ");
		System.out.println("Name: " + sName);
		System.out.println("Pedals: " + nPetals);
		System.out.println("Price: " + fPrice);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flower flo = new Flower("rose", 3, 14.4f);
		flo.printInfo();
		
		flo.setPetals(5);
		flo.printInfo();

	}

}
