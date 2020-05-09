package model;
	public class Soat extends Document{
		private double coverValue;
		public Soat(double price, int year, int[][] img,double coverValue){
			super(price,year,img);
			this.coverValue = coverValue;
		}
		public double getCoverValue(){
			return coverValue;
		}
		public void setCoverValue(double value){
			coverValue = value;
		}
	}