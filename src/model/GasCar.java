package model;
import model.*;
import java.util.ArrayList;
public class GasCar extends Car implements Consum{
	private final static int NORMAL = 0;
	private final static int DIESEL = 1;
	private final static int EXTRA = 2;
	
	private double capacity;
	private int typeGas;
	
	
	/**
	*Creates GasCar Object with an empty documents list <br>
	*
	* <b>pre:</b> <br>
	*
	* <b>post:</b> creates a GasCar Object with the custom information given by params; this constructor must be used to create a new Car <br>
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
	* @param typeGas the type of gas (normal, diesel, extra)
	* @param capacity the total capacity of gas in the tank
	*/
	public GasCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType, int typeGas, double capacity){
		super(price,tradeMark,model,displacement,mileage,isNew, licensePlate,type,doors,windowsType);
		this.capacity = capacity;
		this.typeGas = typeGas;
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
	*@param typeGas the type of gas (normal, diesel, extra)
	*@param capacity the total capacity of gas in the tank
	*/
	public GasCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,ArrayList <Document> documents, int type, int doors, boolean windowsType, int typeGas, double capacity){
		super(price,tradeMark,model,displacement,mileage,isNew, licensePlate,documents, type,doors,windowsType);
		this.capacity = capacity;
		this.typeGas = typeGas;
	}
	
	
	public double getCapacity(){
		return capacity;	
	}
	public void setCapacity(double value){
		capacity = value;
	}
	
	
	/**
	*calculate the value of the consume <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> returns the consume of gas <br>
	*
	*@return the consume of gas
	*/
	public double calculateConsum(){
		double consumption = capacity*(super.getDisplacement()/100);
		return consumption;
	}
	
	@Override
	public String getInfo(){
		String info = "****"+"\n"+"Carro Electrico"+"\n"+"precio: "+super.getPrice()+"\n"+"marca: "+super.getTradeMark()+"\n"+"modelo: "+super.getModel()+"\n"+"Cilindraje: "+super.getDisplacement()+"\n";
		info = info+ "kilometraje: "+super.getMileage()+"\n"+"placa: "+super.getLicensePlate()+"\n"+"typo de auto: "+super.getType()+"\n"+"Numero de puertas: "+super.getDoors()+"\n";
		if (super.getWindowsType()){info = info+"ventanas electricas"+"\n";}else{info = info + "ventanas normales"+"\n";}
		if (typeGas == 0){info += "tipo de combustible: Normal"+"\n";}else if (typeGas == 1) {info += "tipo de combustible: Diesel"+"\n";} else {info += "tipo de combustible: Extra"+"\n";}
		info = info + "capacidad de tanque: "+capacity+"\n";
		return info;
	}
}