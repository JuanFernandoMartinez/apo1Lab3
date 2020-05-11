package model;
import model.*;
public class GasCar extends Car implements Consum{
	private final static int NORMAL = 0;
	private final static int DIESEL = 1;
	private final static int EXTRA = 2;
	
	private double capacity;
	private int typeGas;
	
	
	public GasCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType, int typeGas, double capacity){
		super(price,tradeMark,model,displacement,mileage,isNew, licensePlate,type,doors,windowsType);
		this.capacity = capacity;
		this.typeGas = typeGas;
	}
	
	public GasCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,ArrayList <Document> documents, int type, int doors, boolean windowsType, int typeGas, double capacity){
		super(price,tradeMark,model,displacement,mileage,isNew, licensePlate,type,doors,windowsType, documents);
		this.capacity = capacity;
		this.typeGas = typeGas;
	}
	
	
	public double getCapacity(){
		return capacity;	
	}
	public void setCapacity(double value){
		capacity = value;
	}
	
	
	
	public double calculateConsum(){
		double consumption = capacity*(super.getDisplacement()/100);
		return consumption;
	}
}