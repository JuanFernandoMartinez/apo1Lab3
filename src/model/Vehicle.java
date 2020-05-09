 package model;
 import java.util.ArrayList;
 public class Vehicle {
	private final static boolean NEW = true;
	private final static boolean USED = false;
	
    private	double totalPrice;
    private	double price;
    private	String tradeMark;
    private	int model;
    private	double displacement;
    private	int mileage;
    private	boolean isNew;
    private	String licensePlate;
	private ArrayList <Document> documents;



    
	/**
	*Creates Vehicle Object <br>
	*
	* <b>pre:</b> <br>
	*
	* <b>post:</b> creates a Vehicle Object with the custom information given by params <br>
	*
	* @param totalPrice double x ; x!= null and x>0 
	* @param price double x ; x¡null and x>0 
	* @param tradeMark String !null and !empty
	* @param model Integer != 0
	* @param displacement double != 0
	* @param mileage int x 0<= x
	* @param isNew boolean  refer to constants NEW = true and USED = false
	* @param licensePlate String !null and  !empty
	*/
    public Vehicle(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate){
      this.totalPrice = totalPrice;
      this.price = price;
      this.tradeMark = tradeMark;
      this.model = model;
      this.displacement = displacement;
      this.mileage = mileage;
      this.isNew = isNew;
      this.licensePlate = licensePlate;
	  this.documents = new ArrayList<Document>();
    }
	
	
	public Vehicle(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,ArrayList <Document> documents){
      this.totalPrice = totalPrice;
      this.price = price;
      this.tradeMark = tradeMark;
      this.model = model;
      this.displacement = displacement;
      this.mileage = mileage;
      this.isNew = isNew;
      this.licensePlate = licensePlate;
	  this.documents = documents;
    }

    // getters and setters
	
	/**
		returns totalPrice value
		@return int totalPrice
	*/
    public double getTotalPrice(){
      return totalPrice;
    }
    public void  setTotalPrice(double value){
      totalPrice = value;
    }
    public double getPrice(){
      return price;
    }
    public void setPrice(double value){
      price = value;
    }
    public String  getTradeMark(){
      return tradeMark;
    }
    public void setTradeMark(String value){
      tradeMark = value;
    }
    public int getModel(){
      return model;
    }
    public void setModel(int value){
      model = value;
    }
    public double getDisplacement(){
      return displacement;
    }
    public void setDisplacement(double value){
      displacement = value;
    }
    public int getMileage(){
      return mileage;
    }
    public void setMileage(int value){
      mileage = value;
    }
    public boolean getIsNew(){
      return isNew;
    }
    public void setIsNew(boolean value){
      isNew = value;
    }
    public String getLicensePlate(){
      return licensePlate;
    }
    public void setLicensePlate(String value){
      licensePlate = value;
    }
	
	public ArrayList <Document> getDocuments(){
		return documents;
	}
	public void setDocuments (ArrayList <Document> value){
		documents = value;
	}

 }
