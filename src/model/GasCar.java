package model;
public class GasCar extends Car implements GasConsumption{
	private final static int NORMAL = 0;
	private final static int DIESEL = 1;
	private final static int EXTRA = 2;
	
	private double capacity;
	
	private int typeGas;
	public GasCar(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType, int typeGas, double capacity){
		super(totalPrice,price,tradeMark,model,displacement,mileage,isNew, licensePlate,type,doors,windowsType);
		this.capacity = capacity;
		
		
	}
	
	
	public double getCapacity(){
		return capacity;	
	}
	public void setCapacity(double value){
		capacity = value;
	}
	
	public calculateConsumption(){
		
	}
	
	
	
}