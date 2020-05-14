package model;
import java.util.ArrayList;
public class Car extends Vehicle{
	private final static int SEDAN = 0;
	private final static int VAN = 1;
	private final static boolean POLARIZED = true;
	private final static boolean NONPOLARIZED = false;
	
	private int type;
	private int doors;
	private boolean windowsType;
	
	/**
	*Creates Car Object with an empty documents list <br>
	*
	* <b>pre:</b> <br>
	*
	* <b>post:</b> creates a Car Car Object with the custom information given by params; this constructor must be used to create a new Car <br>
	*
	* @param price double x ; x¡null and x>0 
	* @param tradeMark String !null and !empty
	* @param model Integer != 0
	* @param displacement double != 0
	* @param mileage int x 0<= x
	* @param isNew boolean  refer to constants NEW = true and USED = false
	* @param licensePlate String !null and  !empty
	* @param type if the Car if sedan or van 
	* @param doors quantity of doors in the Car 
	* @param windowsType if the windows are electric or normal
	*/
	public Car( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate);
		this.type = type;
		this.doors = doors;
		this.windowsType = windowsType;
	}
	
	
	/**
	*creates a Car object with a custom documents list <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> creates an Car object with information given by parameters <br>
	*
	*@param price a double which represents the basic price of the Car; !0
	*@param tradeMark the mark of the Car; !null and !empty
	*@param model the creation year of the Car  Integer != 0
	*@param displacement the measurements of the Car; != 0
	*@param mileage miles of total travel; Integer non-Negative
	*@param isNew boolean which represent if the Car is new or old; NEW = true; USED = false
	*@param licensePlate it represents the unic code of the Car; !null and !empty
	*@param documents ArrayList with the documents of the Car; !null and !Empty
	*@param type if the Car if sedan or van 
	*@param doors quantity of doors in the Car 
	*@param windowsType if the windows are electric or normal
	*/
	public Car( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,ArrayList <Document> documents, int type, int doors, boolean windowsType){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate,documents);
		this.type = type;
		this.doors = doors;
		this.windowsType = windowsType;
	}
	
	public int getType(){
		return type;
	}
	public void setType(int value){
		type = value;
	}
	public int getDoors(){
		return doors;
	}
	public void setDoors(int value){
		doors = value;
	}
	public boolean getWindowsType(){
		return windowsType;
	}
	public void setWindowsType(boolean value){
		windowsType = value;
	}
	
}