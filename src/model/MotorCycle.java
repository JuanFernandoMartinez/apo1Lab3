package model;
import java.util.ArrayList;
public class MotorCycle extends Vehicle implements Consum{
	private final static int STANDAR = 0;
	private final static int SPORT = 1;
	private final static int SCOOTER = 2;
	private final static int CROSS = 3;
	
	
	private int type;
	private double capacity;
	
	/**
	*Creates Vehicle Object with an empty documents list <br>
	*
	* <b>pre:</b> <br>
	*
	* <b>post:</b> creates a Vehicle Object with the custom information given by params; this constructor must be used to create a new vehicle <br>
	*
	* @param price double x ; x¡null and x>0 
	* @param tradeMark String !null and !empty
	* @param model Integer != 0
	* @param displacement double != 0
	* @param mileage int x 0<= x
	* @param isNew boolean  refer to constants NEW = true and USED = false
	* @param licensePlate String !null and  !empty
	* @param type if the motorcycle is normal, sport, scooter or cross
	* @param capacity is the capacity of tank 
	*/
	public MotorCycle( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, double capacity){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate);
		this.type = type;
		this.capacity = capacity;
		
	}
	
	/**
	*creates a Vehicle object with a custom documents list <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> creates an Vehicle object with information given by parameters <br>
	*
	*@param price a double which represents the basic price of the Vehicle; !0
	*@param tradeMark the mark of the Vehicle; !null and !empty
	*@param model the creation year of the Vehicle  Integer != 0
	*@param displacement the measurements of the Vehicle; != 0
	*@param mileage miles of total travel; Integer non-Negative
	*@param isNew boolean which represent if the vehicle is new or old; NEW = true; USED = false
	*@param licensePlate it represents the unic code of the Vehicle; !null and !empty
	*@param documents ArrayList with the documents of the Vehicle; !null and !Empty
	*/
	public MotorCycle( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, ArrayList <Document> documents, int type, double capacity){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate,documents);
		this.type = type;
		this.capacity = capacity;
		
	}
	
	public int getType(){
		return type;
	}
	public void setType(int value){
		type = value;
	}
	public double getCapacity(){
		return capacity;
	}
	public void setCapacity(double value){
		capacity = value;
	}
	public double calculateConsum(){
		double consum = capacity*(super.getDisplacement()/90);
		return consum;
	}
	
	
	@Override
	public String getInfo(){
		String info = "****"+"\n"+"Carro Electrico"+"\n"+"precio: "+super.getPrice()+"\n"+"marca: "+super.getTradeMark()+"\n"+"modelo: "+super.getModel()+"\n"+"Cilindraje: "+super.getDisplacement()+"\n";
		info = info+ "kilometraje: "+super.getMileage()+"\n"+"placa: "+super.getLicensePlate()+"\n"+"Capacidad de taque: "+capacity+"\n";
		return info;
	}
	
	@Override
	public double calculateTotalPrice(){
		super.setTotalPrice(super.getPrice()+super.getPrice()*0.04);
		
		if (super.getIsNew() != true){
			super.setTotalPrice(super.getTotalPrice()-super.getTotalPrice()*0.02);
		}
		double finalPrice = super.getTotalPrice();
		
		return finalPrice;
	}
}