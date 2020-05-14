package model;
	public class Asessor{
		private String firstName;
		private String lastName;
		private String id;
		private int sells;
		Client[] clients;
		
		/**
		*creates an Asessor object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> creates a new Asessor object <br>
		*
		*@param firstName String with the fisrt name of the employee, !null, !empty
		*@param lastName String with the last name of the employee, !null, !empty
		*@param id identification card of the employee, double != 0
		*@param sells quantity of sold vehicles, Integer
		*@param clients Array with client objects 
		*/
		public Asessor(String firstName,String lastName, String id, int sells, Client[] clients){
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = id;
			this.sells = sells;
			this.clients = clients;
		}
		
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
			return id;
		}
		public void setId(String value){
			id = value;
		}
		public int getSells(){
			return sells;
		}
		public void setSells(int value){
			sells = value;
		}
		public Client[] getClients(){
			return clients;
		}
		public void setClients(Client[] value){
			clients = value;
		}
	}