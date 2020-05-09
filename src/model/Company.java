package model;
	public class Company{
		private String name;
		private String nit;
		private double totalRewards;
		private int sells;
		
		
		public Company(String name, String nit, double totalRewards, int sells){
			this.name = name;
			this.nit = nit;
			this.totalRewards = totalRewards;
			this.sells = sells;
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
		
		
	}