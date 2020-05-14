package model;
	public class Soat extends Document{
		private double coverValue;
		
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
		*@param coverValue the cover value
		*/
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