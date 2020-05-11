package model;
import java.util.ArrayList;
public class Car extends Vehicle{
	private final static int SEDAN = 0;
	private final static int HUMMER = 1;
	private final static boolean POLARIZED = true;
	private final static boolean NONPOLARIZED = false;
	
	private int type;
	private int doors;
	private boolean windowsType;
	
	
	public Car( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate, int type, int doors, boolean windowsType){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate);
		this.type = type;
		this.doors = doors;
		this.windowsType = windowsType;
	}
	
	public Car( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,ArrayList <Document> documents, int type, int doors, boolean windowsType){
		super(price,tradeMark,model,displacement,mileage,isNew,licensePlate,documents);
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
	public void setDoors(int value){
		doors = value;
	}
	public boolean getWindowsType(){
		return windowsType;
	}
	public void setWindowsType(boolean value){
		windowsType = value;
	}
	
}