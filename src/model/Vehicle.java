 package model;
 
 public class Vehicle {
    private	double totalPrice;
    private	double price;
    private	String tradeMark;
    private	int model;
    private	double displacement;
    private	int mileage;
    private	boolean isNew;
    private	String licensePlate;



    //constructor

    public Vehicle(double totalPrice, double price, String tradeMark, int model, double displacement, int mileage,boolean isNew, String licensePlate){
      this.totalPrice = totalPrice;
      this.price = price;
      this.tradeMark = tradeMark;
      this.model = model;
      this.displacement = displacement;
      this.mileage = mileage;
      this.isNew = isNew;
      this.licensePlate = licensePlate;
    }

    // getters and setters

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

 }
