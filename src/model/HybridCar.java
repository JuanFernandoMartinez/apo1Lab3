package model;
public class HybridCar extends Car{
	private final static int E_FASTCHARGE = 0;
	private final static int E_NORMAL = 1;
	private final static int G_NORMAL = 0;
	private final static int G_DIESEL = 1;
	private final static int G_EXTRA = 2;
	
	private int  typeCharge;
	private int batteryCapacity;
	private double capacity;
	private double consumption;
	private int typeGas;
	
	public HybridCar(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType,int typeCharge,int batteryCapacity,double capacity,double consumption, int typeGas){
		super(totalPrice,price,tradeMark,model,displacement,mileage,isNew,licensePlate,type,doors,windowsType);
		this.typeCharge = typeCharge;
		this.batteryCapacity = batteryCapacity;
		this.capacity = capacity;
		this.consumption = consumption;
		this.typeGas = typeGas;
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
	
	public double getCapacity(){
		return capacity;	
	}
	public void setCapacity(double value){
		capacity = value;
	}
	public double getConsumption(){
		return consumption;
	}
	public void setConsumption(double value){
		consumption = value;
	}
}