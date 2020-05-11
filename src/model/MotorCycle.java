package model;
import java.util.ArrayList;
public class MotorCycle extends Vehicle implements Consum{
	private final static int STANDAR = 0;
	private final static int SPORT = 1;
	private final static int SCOOTER = 2;
	private final static int CROSS = 3;
	
	
	private int type;
	private double capacity;
	
	public MotorCycle(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, double capacity){
		super(totalPrice,price,tradeMark,model,displacement,mileage,isNew,licensePlate);
		this.type = type;
		this.capacity = capacity;
		
	}
	
	public MotorCycle(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, ArrayList <Document> documents, int type, double capacity){
		super(totalPrice,price,tradeMark,model,displacement,mileage,isNew,licensePlate,documents);
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
}