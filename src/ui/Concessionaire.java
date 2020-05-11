package ui;
import model.*;
import java.util.*;
	public class Concessionaire{
		private Scanner sc;;
		private Company company;
		
		public Concessionaire(){
			this.sc = new Scanner(System.in);
			this.company = new Company("","",0,0);
		}
		
		public Company getCompany(){
			return company;
		}
		
		public void menu(){
			int choice;
			System.out.println("       Bienvenido al menu principal          ");
			System.out.println("1. Agregar un nuevo vehiculo");
			System.out.println("2. Guardar informacion de clientes");
			System.out.println("3. Guardar información de Empleados");
			System.out.println("4. Recomendar vehiculos");
			System.out.println("5. Salir");
			System.out.println("digite el numero de la opcion que desea elegir");
			choice = sc.nextInt(); sc.nextLine();
			
			switch (choice){
				case 1: addVehicle(); break;
			}
		}
				
		public void addVehicle(Scanner sc){
			double price;
			
			System.out.println("Digite los datos requeridos a continuación");
			int choice;
			System.out.println("Escoja el tipo de vehiculo");
			System.out.println("1. Automovil");
			System.out.println("2. Motocicleta");
			choice = sc.nextInt(); sc.nextLine();
			if (choice == 1){
				
			}
			
		public void addCar(){
		    double choice;
			System.out.println("Elija el tipo de carro que quiere agregar");
			System.out.println("1. Carro de gasolina");
			System.out.println("2. Carro Electrico");
			System.out.println("3. Carro Hibrido");
			
			switch(choice){
				case 1 : break;
				case 2 : break;
				case 3 : break;
			}
		}
		
		public void addGasCar(){
			System.out.println("Digite los datos que se le piden a continuación");
			System.out.println("Precio base");
			double price = sc.nextDouble(); sc.nextLine();
			System.out.println("Marca");
			String tradeMark = sc.nextLine();
			System.out.println("");
		}
			
			
		}
	}