package model;
	public class Revision extends Document{
		private double gasLevel;
		
		
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
		*@param level of gas 
		*/
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