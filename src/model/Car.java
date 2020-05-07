public class Car extends Vehicle{
	private final static int SEDAN = 0;
	private final static int HUMMER = 1;
	private final static boolean POLARIZED = true;
	private final static boolean NONPOLARIZED = false;
	
	private int type;
	private int doors;
	private boolean windowsType;
	
	
	public Car(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType){
		super();
		this.type = type;
		this.doors = doors;
		this.windowsType = windowsType;
	}
	
	public int getType(){
		return type;
	}
	public void setType(int value){
		type = value;
	}
	public int getDoors(){
		return doors;
	}
	public void setDoors(int value){}{
		doors = value;
	}
	public boolean getWindowsType(){
		return windowsType;
	}
	public void setWindowsType(boolean value){
		windowsType = value;
	}
	
}