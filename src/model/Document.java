package model;

public class Document{
  private double price;
  private int year;
  private int[][] img;

  // constructor
  /**
  *creates a Document object <br>
  *
  *<b>pre:</b> <br>
  *
  *<b>post:</b> creates a new Document object <br>
  *
  *@param price is the value of the document
  *@param year the date of creation 
  *@param img the code of the image 
  */
  public Document(double price, int year, int[][] img){
    this.price = price;
    this.year = year;
    this.img = img;
  }

  //getters and setters

  public double getPrice(){
    return price;
  }
  public void setPrice(double value){
    price = value;
  }
  public int getYear(){
    return year;
  }
  public void setYear(int value){
    year = value;
  }
  public int[][] getImg(){
    return img;
  }
  public void setImg(int[][] value){
    img = value;
  }
}
