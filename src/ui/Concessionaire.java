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
		
		public void menu(){
			int choice;
			System.out.println("       Bienvenido al menu principal          ");
			System.out.println("1. Agregar un nuevo vehiculo");
			System.out.println("2. Guardar informacion de clientes");
			System.out.println("3. Guardar información de Empleados");
			System.out.println("4. Recomendar vehiculos");
			System.out.println("5. Salir");
			System.out.println("digite el numero de la opcion que desea elegir");
		}
				
		public void addVehicle(Scanner sc){
			System.out.println("hello world");
		}
	}