package model;
public class HybridCar extends Car implements Consum,BatteryConsum{
	private final static int E_FASTCHARGE = 0;
	private final static int E_NORMAL = 1;
	private final static int G_NORMAL = 0;
	private final static int G_DIESEL = 1;
	private final static int G_EXTRA = 2;
	
	private int  typeCharge;
	private int batteryCapacity;
	private double capacity;
	
	private int typeGas;
	
	public HybridCar( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType,int typeCharge,int batteryCapacity,double capacity, int typeGas){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate,type,doors,windowsType);
		this.typeCharge = typeCharge;
		this.batteryCapacity = batteryCapacity;
		this.capacity = capacity;
		
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
	
	public double calculateConsum(){
		double consum = capacity*(super.getDisplacement()/110);
		return consum;
	}
	public double calculateBatteryConsum(){
		double consum;
		if (typeCharge == E_FASTCHARGE){
			consum = batteryCapacity*(super.getDisplacement()/100);
		} else{
			consum = (batteryCapacity+5)*(super.getDisplacement()/100);
		}
		return consum;
	}
	
	@Override
	public String getInfo(){
		String info = "****"+"\n"+"Carro Electrico"+"\n"+"precio: "+super.getPrice()+"\n"+"marca: "+super.getTradeMark()+"\n"+"modelo: "+super.getModel()+"\n"+"Cilindraje: "+super.getDisplacement()+"\n";
		info = info+ "kilometraje: "+super.getMileage()+"\n"+"placa: "+super.getLicensePlate()+"\n"+"typo de auto: "+super.getType()+"\n"+"Numero de puertas: "+super.getDoors()+"\n";
		if (super.getWindowsType()){info = info+"ventanas electricas"+"\n";}else{info = info + "ventanas normales"+"\n";}
		if (typeGas == 0){info += "tipo de combustible: Normal"+"\n";}else if (typeGas == 1) {info += "tipo de combustible: Diesel"+"\n";} else {info += "tipo de combustible: Extra"+"\n";}
		info = info + "capacidad de tanque: "+capacity+"\n";
		if (typeCharge == E_FASTCHARGE){info = info+"carga rapida"+"\n";}else {info = info+ "Carga normal"+"\n";}
		info = info + "tiempo de carga: "+batteryCapacity + "\n";
		return info;
	}
	
}