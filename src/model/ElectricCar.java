package model;
import java.util.ArrayList;
public class ElectricCar extends Car implements BatteryConsum{
	private final static int FASTCHARGE = 0;
	private final static int NORMAL = 1;
	
	
	private int  typeCharge;
	private int batteryCapacity;
	
	/**
	*Creates ElectricCar Object with an empty documents list <br>
	*
	* <b>pre:</b> <br>
	*
	* <b>post:</b> creates a ElectricCar Object with the custom information given by params; this constructor must be used to create a new Car <br>
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
	* @param typeCharge if the car have fast charge or normal charge
	* @param batteryCapacity the time to complete charge of the car
	*/
	public ElectricCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType,int typeCharge,int batteryCapacity){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate,type,doors,windowsType);
		this.typeCharge = typeCharge;
		this.batteryCapacity = batteryCapacity;
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
	*@param typeCharge if the car have fast charge or normal charge
	*@param batteryCapacity the time to complete charge of the car
	*/
	public ElectricCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,ArrayList <Document> documents, int type, int doors, boolean windowsType,int typeCharge,int batteryCapacity){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate,documents, type,doors,windowsType);
		this.typeCharge = typeCharge;
		this.batteryCapacity = batteryCapacity;
	}
	
	public int getTypeCharge(){
		return typeCharge;
	}
	public void setTypeCharge(int value){
		typeCharge = value;
	}	
	public int getBateryCapacity(){
		return batteryCapacity;
	}
	public void setBatteryCapacity(int value){
		batteryCapacity = value;
	}
	
	
	/**
	*calculate the value of the consume in the battery <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> returns the consume of the battery <br>
	*
	*@return the consume of the battery
	*/
	public double calculateBatteryConsum(){
		double consum;
		if (typeCharge == FASTCHARGE){
			consum = (batteryCapacity+10)*(super.getDisplacement()/100);
		}else{
			consum = (batteryCapacity+10)*(super.getDisplacement()/100);
		}
		return consum;
	}
	
	
	@Override
	public String getInfo(){
		String info = "****"+"\n"+"Carro Electrico"+"\n"+"precio: "+super.getPrice()+"\n"+"marca: "+super.getTradeMark()+"\n"+"modelo: "+super.getModel()+"\n"+"Cilindraje: "+super.getDisplacement()+"\n";
		info = info+ "kilometraje: "+super.getMileage()+"\n"+"placa: "+super.getLicensePlate()+"\n"+"typo de auto: "+super.getType()+"\n"+"Numero de puertas: "+super.getDoors()+"\n";
		if (super.getWindowsType()){info = info+"ventanas electricas"+"\n";}else{info = info + "ventanas normales"+"\n";}
		
		if (typeCharge == FASTCHARGE){info = info+"carga rapida"+"\n";}else {info = info+ "Carga normal"+"\n";}
		info = info + "tiempo de carga: "+batteryCapacity + "\n";
		
		return info;
	}
	
	@Override
	public double calculateTotalPrice(){
		boolean haveSoat = false;
		for (int i = 0; i<super.getDocuments().size();i++){
			if (super.getDocuments().get(i) instanceof Soat && super.getDocuments().get(i).getYear()== 2020){
				haveSoat = true;
			}
			
			if (!haveSoat){
				super.setTotalPrice(super.getPrice()+500000);
			
			}
			
			if (super.getIsNew()== false){
				super.setTotalPrice(super.getTotalPrice()+super.getPrice()*0.2);
			}
			
			
			
			
		}
		double finalPrice = super.getTotalPrice();
		return finalPrice;
	}
}