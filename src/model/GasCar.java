public class GasCar extends Car{
	private final static int NORMAL = 0;
	private final static int DIESEL = 1;
	private final static int EXTRA = 2;
	
	private double capacity;
	private double consumption;
	private int typeGas;
	public GasCar(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType, int typeGas, double capacity, double consumption){
		super();
		this.capacity = capacity;
		this.consumption = consumption;
		this.type = type;
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
	public double getConsumption(){
		return consumption;
	}
	public void setConsumption(double value){
		consumption = value;
	}
	
}