package model;

public class Client{

  private String firstName;
  private String lastName;
  private String identificationCard;
  private String phoneNumber;
  private String email;


// constructor
  public Client(String firstName, String lastName, String identificationCard, String phoneNumber, String email){
    this.firstName = firstName;
    this.lastName = lastName;
    this.identificationCard = identificationCard;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

// getters and setters

  public String getFristName(){
    return firstName;
  }
  public void setFirstName(String value){
    firstName = value;
  }
  public String getLastName(){
    return lastName;
  }
  public void setLastName(String value){
    lastName = value;
  }
  public String getId(){
    return identificationCard;
  }
  public void setId(String value){
    identificationCard = value;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }
  public void setPhoneNumber(String value){
    phoneNumber = value;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(String value){
    email = value;
  }

}
