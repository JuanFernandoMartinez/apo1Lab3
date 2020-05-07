public class MotorCycle extends Vehicle{
	private final static int STANDAR = 0;
	private final static int SPORT = 1;
	private final static int SCOOTER = 2;
	private final static int CROSS = 3;
	
	
	private int type;
	private double capacity;
	private double consumption;
	public MotorCycle(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,int type, double capacity, double consumption){
		super();
		this.type = type;
		this.capacity = capacity;
		this.consumption = consumption;
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