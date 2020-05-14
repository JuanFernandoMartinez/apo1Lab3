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
	*Creates Vehicle Object with an empty documents list <br>
	*
	* <b>pre:</b> <br>
	*
	* <b>post:</b> creates a Vehicle Object with the custom information given by params; this constructor must be used to create a new vehicle <br>
	*
	* @param price double x ; x¡null and x>0 
	* @param tradeMark String !null and !empty
	* @param model Integer != 0
	* @param displacement double != 0
	* @param mileage int x 0<= x
	* @param isNew boolean  refer to constants NEW = true and USED = false
	* @param licensePlate String !null and  !empty
	*/
    public Vehicle( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate){
      this.totalPrice = 0;
      this.price = price;
      this.tradeMark = tradeMark;
      this.model = model;
      this.displacement = displacement;
      this.mileage = mileage;
      this.isNew = isNew;
      this.licensePlate = licensePlate;
	  this.documents = new ArrayList<Document>();
    }
	
	/**
	*creates a Vehicle object with a custom documents list <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> creates an Vehicle object with information given by parameters <br>
	*
	*@param price a double which represents the basic price of the Vehicle; !0
	*@param tradeMark the mark of the Vehicle; !null and !empty
	*@param model the creation year of the Vehicle  Integer != 0
	*@param displacement the measurements of the Vehicle; != 0
	*@param mileage miles of total travel; Integer non-Negative
	*@param isNew boolean which represent if the vehicle is new or old; NEW = true; USED = false
	*@param licensePlate it represents the unic code of the Vehicle; !null and !empty
	*@param documents ArrayList with the documents of the Vehicle; !null and !Empty
	*/
	public Vehicle( double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate,ArrayList <Document> documents){
      this.totalPrice = 0;
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
		returns totalPrice value <br>
		@return int totalPrice
	*/
    public double getPrice(){
      return price;
    }

	/**
	*change the value of the Vehicle's price <br>
	*
	*@param value double with the new price 
	*/
    public void setPrice(double value){
      price = value;
    }
	
	/**
	*returns the tradeMark value <br>
	*
	*@return String with the tradeMark
	*/
    public String  getTradeMark(){
      return tradeMark;
    }
	
	/**
	*change the value of the tradeMark <br>
	*
	*@param value String with the new tradeMark 
	*/
    public void setTradeMark(String value){
      tradeMark = value;
    }
	
	/**
	*returns the model of the vehicle <br>
	*
	*@return value of the model 
	*/
    public int getModel(){
      return model;
    }
	
	/**
	*change the value of the model <br>
	*
	*@param value Integer with the new value 
	*/
    public void setModel(int value){
      model = value;
    }
	
	/**
	*return the displacemet of the vehicle <br>
	*
	*@return displacement
	*/
    public double getDisplacement(){
      return displacement;
    }
	
	/**
	*change the value of the displavement <br>
	*
	*@param value double with the new displacement 
	*/
    public void setDisplacement(double value){
      displacement = value;
    }
	
	/**
	*returns the value of the mileage <br>
	*
	*@return mileage
	*/
    public int getMileage(){
      return mileage;
    }
	
	/**
	*change the value of the mileage <br>
	*
	*@param value Integer with the new mileage
	*/
    public void setMileage(int value){
      mileage = value;
    }
	
	/**
	*returns the value of isNew <br>
	*
	*@return isNew
	*/
    public boolean getIsNew(){
      return isNew;
    }
	
	
	/**
	*change the value of isNew <br>
	*
	*@param value boolean with the new value 
	*/
    public void setIsNew(boolean value){
      isNew = value;
    }

	/**
	* returns the licensePlate <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> returns the String licensePlate <br>
	*
	*@return String licensePlate
	*/
    public String getLicensePlate(){
      return licensePlate;
    }
	
	
	/**
	*change the value of the licensePlate <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> change the value of the String licensePlate <br>
	*
	*@param value  String with the new value of licensePlate
	*/
    public void setLicensePlate(String value){
      licensePlate = value;
    }
	
	/**
	*returns documents <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> returns the ArrayList documents <br>
	*
	*@return ArrayList<Document> documents
	*/
	public ArrayList <Document> getDocuments(){
		return documents;
	}
	
	/**
	*change the value of documents <br>
	*
	*<b>pre:</b> <br>
	*
	*<b>post:</b> change the value of the ArrayList<Document> documents <br>
	*
	*@param value ArrayList<Document> with the new value of documents 
	*/
	public void setDocuments (ArrayList <Document> value){
		documents = value;
	}
	
	/**
	*
	*/
	public double getTotalPrice(){
		return totalPrice;
	}
	
	public void setTotalPrice(double value){
		totalPrice = value;
	}
	
	public double calculateTotalPrice(){
		boolean haveSoat = false;
		for (int i = 0; i<documents.size();i++){
			if (documents.get(i) instanceof Soat && documents.get(i).getYear()== 2020){
				haveSoat = true;
			}
			
			if (haveSoat){
				totalPrice = price+500000;
			}
			
			
		}
		return totalPrice;
	}
	
	public String getInfo(){
		String info = " ";
		return info;
	}

 }
