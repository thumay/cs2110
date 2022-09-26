/**
 * 
 * @author thumay
 *
 *
 *UML Diagram
 *
 *Microwave
 *-----------
 * - brand : String
 * - serialNumber : int
 * - weight : int
 * - cookTimeInSeconds : int
 * - powerInWatts : int
 * - onOrOff : boolean
 * - doorShut : boolean
 * -----------
 * + popcorn()
 * + defrost()
 * + cook(cookTimeInSeconds : int)
 * + displayTime(cookTimeInSeconds)
 * + stop(isRunning : boolean)
 * 
 */
public class Microwave 
{
	//fields
	private String brand;
	private int serialNumber;
	private int weight;
	private int cookTimeInSeconds;
	private int powerInWatts;
	private boolean onOrOff;
	private boolean doorShut;
	
	public Microwave(String brand, int serialNumber, int weight)
	{		
	}
	
	//methods
	public void popcorn(){	
		/** STUB/TODO: if onOrOff and doorShut are true, then set cookingTimeInSeconds
		 * to 120 */
	}
	
	public void defrost(){	
		/** STUB/TODO: if onOrOff and doorShut are true, then set cookingTimeInSeconds
		 * to 420 */
	}
	
	public void cook(int cookTimeInSeconds){	
		/** STUB/TODO: if onOrOff and doorShut are true, then set cookingTimeInSeconds
		 * to user input time */
	}
	
	public void displayTime(int cookTimeInSeconds){	
		/** STUB/TODO: print the remaining time in seconds*/
	}
	
	public void stop(boolean isRunning){
		/** STUB/TODO: if isRunning is true, set this method to false ~ if isRunning is false, this method will be set to true*/
		
	}
	
	//getters & setters
	public String getBrand() {
		return brand; 
	}

	public void setBrand(String brand) {
		this.brand = brand; 
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCookTimeInSeconds() {
		return cookTimeInSeconds;
	}

	public void setCookTimeInSeconds(int cookTimeInSeconds) {
		this.cookTimeInSeconds = cookTimeInSeconds;
	}

	public int getPowerInWatts() {
		return powerInWatts;
	}

	public void setPowerInWatts(int powerInWatts) {
		this.powerInWatts = powerInWatts;
	}

	public boolean isOnOrOff() {
		return onOrOff;
	}

	public void setOnOrOff(boolean onOrOff) {
		this.onOrOff = onOrOff;
	}
	
	public boolean isDoorShut() {
		return doorShut;
	}

	public void setDoorShut(boolean doorShut) {
		this.doorShut = doorShut;
	}
}
