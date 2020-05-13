package model;
import java.util.ArrayList;
	public class Company{
		private String name;
		private String nit;
		private double totalRewards;
		private int sells;
		private ArrayList<Client> clients;
		private ArrayList<Vehicle> vehicles;
		private ArrayList<Asessor> employees;
		
		
		public Company(String name, String nit, double totalRewards, int sells){
			this.name = name;
			this.nit = nit;
			this.totalRewards = totalRewards;
			this.sells = sells;
			this.clients = new ArrayList <Client>();
			this.vehicles = new ArrayList <Vehicle>();
			this.employees = new ArrayList<Asessor>();
			
		}
		public Company(String name, String nit, double totalRewards, int sells,ArrayList<Client>clients, ArrayList<Vehicle> vehicles, ArrayList<Asessor> employees){
			this.name = name;
			this.nit = nit;
			this.totalRewards = totalRewards;
			this.sells = sells;
			this.clients = clients;
			this.vehicles = vehicles;
			this.employees = employees;
			
		}
		public String getName(){
			return name;
		}
		public void setName(String value){
			name = value;
		}
		public String getNit(){
			return nit;
		}
		public void setNit(String value){
			nit = value;
		}
		public double getRewards(){
			return totalRewards;
		}
		public void setRewards(double value){
			totalRewards = value;
		}
		public int getSells(){
			return sells;
		}
		public void setSells(int value){
			sells = value;
		}
		
		public ArrayList<Client> getClients(){
			return clients;
		}
		public void setClients(ArrayList<Client> value){
			clients = value;
		}
		public ArrayList<Vehicle> getVehicles(){
			return vehicles;
		}
		public void setVehicles(ArrayList<Vehicle> value){
			vehicles = value;
		}
		public ArrayList<Asessor> getEmployees(){
			return employees;
		}
		public void setEmployees(ArrayList<Asessor> value){
			employees = value;
		}
		
	}