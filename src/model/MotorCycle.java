package model;
import java.util.ArrayList;
public class MotorCycle extends Vehicle implements Consum{
	private final static int STANDAR = 0;
	private final static int SPORT = 1;
	private final static int SCOOTER = 2;
	private final static int CROSS = 3;
	
	
	private int type;
	private double capacity;
	
	public MotorCycle( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, double capacity){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate);
		this.type = type;
		this.capacity = capacity;
		
	}
	
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