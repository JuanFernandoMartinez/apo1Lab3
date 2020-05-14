package model;
import java.util.ArrayList;


	public class Company{
		
		private String name;
		private String nit;
		private double totalRewards;
		private int sells;
		private ArrayList<Client> clients;
		private ArrayList<Vehicle> vehicles;
		private ArrayList<Vehicle> oldCars;
		private ArrayList<Asessor> employees;
		
		
		/**
		*creates a company object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> creates a new object Company with empty clients, empty employees, empty vehicles <br>
		*
		*@param name String with the name of the company; !null !empty 
		*@param nit code of the company; !null !empty
		*@param totalRewards all money collected by the company; double != 0
		*@param sells quantity of sold vehicles 
		*/
		public Company(String name, String nit, double totalRewards, int sells){
			this.name = name;
			this.nit = nit;
			this.totalRewards = totalRewards;
			this.sells = sells;
			this.clients = new ArrayList <Client>();
			this.vehicles = new ArrayList <Vehicle>();
			this.employees = new ArrayList<Asessor>();
			this.oldCars = new ArrayList<Vehicle>();
			
		}
		
		/**
		*creates a company object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> creates a new object Company  <br>
		*
		*@param name String with the name of the company; !null !empty 
		*@param nit code of the company; !null !empty
		*@param totalRewards all money collected by the company; double != 0
		*@param sells quantity of sold vehicles 
		*@param vehicles ArrayList type Vehicle with the vehicles of the company  
		*@param clients ArrayList type Client with the information of the clients
		*@param employees ArrayList type Asessor with the information of the employees 
		*/
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
		
		/**
		*returs information about all Vehicles of the company <br>
		*
		*<b> pre: </b> the vehicles ArrayList must be initializated <br>
		*
		*<b> post:</b> returns information of all vehicles in the ArrayList vehicles <br>
		*
		*@return String with the info about all vehicles 
		*/
		public String getCatalog(){
			String catalog = "";
			for (int i = 0; i < vehicles.size();i++){
				catalog += vehicles.get(i).getInfo()+"\n";
			}
			return catalog;
		}
		
		
		/**
		*save the old cars in the oldCars ArrayList <br>
		*
		*<b>pre:</b> the oldCars ArrayList Must be initializated <br>
		*
		*<b>post:</b> move the oldCars for vehicles ArrayList to oldCars ArrayList <br>
		*/
		public void registerOldCars(){
			for (int i = 0; i<vehicles.size(); i++){
				if (vehicles.get(i) instanceof Car){
					if (vehicles.get(i).getIsNew() == true){
						oldCars.add(vehicles.get(i));
						
					}
				}
			}
		}
		
	}