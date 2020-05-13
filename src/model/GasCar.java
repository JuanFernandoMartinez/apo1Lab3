package model;
import model.*;
import java.util.ArrayList;
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