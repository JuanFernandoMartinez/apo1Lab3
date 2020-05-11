package model;
	public class Asessor{
		private String firstName;
		private String lastName;
		private String id;
		private int sells;
		Client[] clients;
		
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