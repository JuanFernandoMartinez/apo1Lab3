package model;
import java.util.ArrayList;
public class ElectricCar extends Car implements BatteryConsum{
	private final static int FASTCHARGE = 0;
	private final static int NORMAL = 1;
	
	
	private int  typeCharge;
	private int batteryCapacity;
	
	public ElectricCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType,int typeCharge,int batteryCapacity){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate,type,doors,windowsType);
		this.typeCharge = typeCharge;
		this.batteryCapacity = batteryCapacity;
	}
	
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
}