package model;
	public class Revision extends Document{
		private double gasLevel;
		
		public Revision(double price, int year, int[][] img,double gasLevel){
			super(price,year,img);
			this.gasLevel = gasLevel;
		}
		
		public double getGasLevel(){
			return gasLevel;
		}
		public void setGasLevel(double value){
			gasLevel = value;
		}
	}