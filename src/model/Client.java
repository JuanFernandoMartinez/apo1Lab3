package model;

public class Client{

  private String firstName;
  private String lastName;
  private String identificationCard;
  private String phoneNumber;
  private String email;


  /**
  *creates a Client object <br>
  *
  *<b>pre:</b> <br>
  *
  *<b>post:</b> creates a new Client object <br>
  *
  *@param firstName String with the first name of the client !null !empty
  *@param lastName String with the last name of the client !null !empty
  *@param identificationCard String with the identification Card of the client !null !empty 
  *@param phoneNumber String with the phone number of the client !null !empty
  *@param email String with the e-mail of the client !null !empty
  */
  public Client(String firstName, String lastName, String identificationCard, String phoneNumber, String email){
    this.firstName = firstName;
    this.lastName = lastName;
    this.identificationCard = identificationCard;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

// getters and setters

  public String getFirstName(){
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
