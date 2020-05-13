package ui;
import model.*;
import java.util.*;
	public class Concessionaire{
		private static  Scanner sc = new Scanner(System.in);
		private Company company;
		
		public Concessionaire(){
			
			this.company = new Company("","",0,0);
		}
		
		public Company getCompany(){
			return company;
		}
		
		
		/**
		* Prints options destinated to be choosen by the user <br>
		*
		* <b>pre:</b> the object company must have been initializated <br>
		*
		* <b>post:</b> show in the screen the options 
		*
		*/
		public void menu(){
			int choice  = 0;
			System.out.println("       Bienvenido al menu principal          ");
			System.out.println("1. Agregar un nuevo vehiculo");
			System.out.println("2. agregar clientes");
			System.out.println("3. Guardar información de Empleados");
			System.out.println("4. Recomendar vehiculos");
			System.out.println("5. Salir");
			System.out.println("digite el numero de la opcion que desea elegir");
			choice = sc.nextInt(); sc.nextLine();
			
			switch (choice){
				case 1: addVehicle(); break;
				case 2: addClient(); break;
				case 3: addEmployee(); break;
			}
		}
			

		/**
		* Creates a Vehicle Object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> creates a vehicle object with the user specifications <br>
		*
		*/
		public void addVehicle(){
			double price;
			
			System.out.println("Digite los datos requeridos a continuación");
			int choice;
			System.out.println("Escoja el tipo de vehiculo");
			System.out.println("1. Automovil");
			System.out.println("2. Motocicleta");
			choice = sc.nextInt(); sc.nextLine();
			Vehicle vehicle;
			if (choice == 1){
				vehicle = addCar();
			}else{
				vehicle = addMotorCycle();
			}
			
			company.getVehicles().add(vehicle);
		}	
		
		
		/**
		*creates a Car Object <br>
		*
		*<b>pre:</b>  <br>
		*
		*<b>post:</b> creates a Car object with the user specifications <br>
		*
		*@return object type car 
		*/
		public Car addCar(){
		    int choice = 0;
			System.out.println("Elija el tipo de carro que quiere agregar");
			System.out.println("1. Carro de gasolina");
			System.out.println("2. Carro Electrico");
			System.out.println("3. Carro Hibrido");
			
			choice = sc.nextInt(); sc.nextLine();
			Car car = null;
			switch(choice){
				case 1 : car = addGasCar(); break;
				case 2 : car = addElectricCar(); break;
				case 3 : car = addHybridCar(); break;
			}
			menu();
			return car;
			
		}
		
		/**
		*creates a GasCar object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> creates an GasCar object with the information typed by the user <br>
		*
		*@return  object type GasCar
		*/
		public GasCar addGasCar(){
			System.out.println("Digite los datos que se le piden a continuación");
			System.out.println("tipo de automovil; 0. sedan, 1. camioneta");
			int type = sc.nextInt(); sc.nextLine();
			System.out.println("Precio base");
			double price = sc.nextDouble(); sc.nextLine();
			System.out.println("Marca");
			String tradeMark = sc.nextLine();
			System.out.println("Modelo");
			int model = sc.nextInt(); sc.nextLine();
			System.out.println("Cilindraje");
			double displacement = sc.nextDouble();
			System.out.println("Kilometraje"); sc.nextLine();
			int mileage = sc.nextInt();
			System.out.println("¿Es nuevo? (1 = si; 2 = no)");
			int ch = sc.nextInt(); sc.nextLine();
			boolean isNew = false;
			if (ch == 1){
				isNew = true;
			}
			System.out.println("Placa");
			String licensePlate = sc.nextLine();
			System.out.println("Tipo de conbustible: 0. normal, 1. diesel, 2. extra");
			int gasType = sc.nextInt(); sc.nextLine();
			System.out.println("cantidad de puertas");
			int doors = sc.nextInt(); sc.nextLine();
			System.out.println("¿Tiene ventanas electricas?");
			String win = sc.nextLine();
			boolean windowType = false;
			if (win.equalsIgnoreCase("si")){windowType = true;}
			System.out.println("capacidad de tanque");
			double capacity = sc.nextDouble();
			
			
			GasCar car = new GasCar(price,tradeMark,model,displacement,mileage,isNew,licensePlate,type, doors,windowType,gasType,capacity);
			
			return car;
		}
		
		/**
		*creates a ElectricCar object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> creates an ElectricCar object with the information given by the user <br>
		*
		*@return  object type ElectricCar
		*/
		public ElectricCar addElectricCar(){
			System.out.println("Digite los datos que se le piden a continuación");
			System.out.println("tipo de automovil; 0. sedan, 1. camioneta");
			int type = sc.nextInt(); sc.nextLine();
			System.out.println("Precio base");
			double price = sc.nextDouble(); sc.nextLine();
			System.out.println("Marca");
			String tradeMark = sc.nextLine();
			System.out.println("Modelo");
			int model = sc.nextInt(); sc.nextLine();
			System.out.println("Cilindraje");
			double displacement = sc.nextDouble();
			System.out.println("Kilometraje"); sc.nextLine();
			int mileage = sc.nextInt();
			System.out.println("¿Es nuevo? (1 = si; 2 = no)");
			int ch = sc.nextInt(); sc.nextLine();
			boolean isNew = false;
			if (ch == 1){
				isNew = true;
			}
			System.out.println("Placa");
			String licensePlate = sc.nextLine();
			System.out.println("Tipo de carga; 0. carga rapida; 1 carga normal");
			int typeCharge = sc.nextInt(); sc.nextLine();
			System.out.println("cantidad de puertas");
			int doors = sc.nextInt(); sc.nextLine();
			System.out.println("¿Tiene ventanas electricas?");
			String win = sc.nextLine();
			boolean windowType = false;
			if (win.equalsIgnoreCase("si")){windowType = true;}
			System.out.println("duracion de bateria");
			int capacity = sc.nextInt();
			
			ElectricCar car = new ElectricCar(price,tradeMark,model,displacement,mileage,isNew,licensePlate,type,doors,windowType,typeCharge,capacity);
			
			return car;
		}
		
		/**
		*creates a HybridCar object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> creates an HybridCar object with the information customized by the user <br>
		*
		*@return  HybridCar object
		*/
		public HybridCar addHybridCar(){
			System.out.println("Digite los datos que se le piden a continuación");
			System.out.println("tipo de automovil; 0. sedan, 1. camioneta");
			int type = sc.nextInt(); sc.nextLine();
			System.out.println("Precio base");
			double price = sc.nextDouble(); sc.nextLine();
			System.out.println("Marca");
			String tradeMark = sc.nextLine();
			System.out.println("Modelo");
			int model = sc.nextInt(); sc.nextLine();
			System.out.println("Cilindraje");
			double displacement = sc.nextDouble();
			System.out.println("Kilometraje"); sc.nextLine();
			int mileage = sc.nextInt();
			System.out.println("¿Es nuevo? (1 = si; 2 = no)");
			int ch = sc.nextInt(); sc.nextLine();
			boolean isNew = false;
			if (ch == 1){
				isNew = true;
			}
			System.out.println("Placa");
			String licensePlate = sc.nextLine();
			System.out.println("Tipo de conbustible: 0. normal, 1. diesel, 2. extra");
			int gasType = sc.nextInt(); sc.nextLine();
			System.out.println("cantidad de puertas");
			int doors = sc.nextInt(); sc.nextLine();
			System.out.println("¿Tiene ventanas electricas?");
			String win = sc.nextLine();
			boolean windowType = false;
			if (win.equalsIgnoreCase("si")){windowType = true;}
			System.out.println("capacidad de tanque");
			double capacity = sc.nextDouble();
			System.out.println("duracion de bateria");
			int batteryCapacity = sc.nextInt();
			System.out.println("Tipo de carga; 0. carga rapida; 1 carga normal");
			int typeCharge = sc.nextInt(); sc.nextLine();
			
			HybridCar car = new HybridCar(price,tradeMark,model,displacement,mileage,isNew,licensePlate,type,doors,windowType,typeCharge,batteryCapacity,capacity,gasType);
			
			return car;
		}
		
		/**
		* Creates a MototrCycle object <br>
		*
		* <b>pre:</b> <br>
		*
		* <b>post:</b> created a MotorCycle object with the information give by the user <br>
		*
		* @return motorcycle object
		*/
		public MotorCycle addMotorCycle(){
			System.out.println("Digite los datos que se le piden a continuación");
			System.out.println("tipo de motocicleta: 0. standar; 1. sport; 2. scooter; 3. Cross");
			int type = sc.nextInt(); sc.nextLine();
			System.out.println("Precio base");
			double price = sc.nextDouble(); sc.nextLine();
			System.out.println("Marca");
			String tradeMark = sc.nextLine();
			System.out.println("Modelo");
			int model = sc.nextInt(); sc.nextLine();
			System.out.println("Cilindraje");
			double displacement = sc.nextDouble();
			System.out.println("Kilometraje"); sc.nextLine();
			int mileage = sc.nextInt();
			System.out.println("¿Es nuevo? (1 = si; 2 = no)");
			int ch = sc.nextInt(); sc.nextLine();
			boolean isNew = false;
			if (ch == 1){
				isNew = true;
			}
			System.out.println("Placa");
			String licensePlate = sc.nextLine();
			System.out.println("Capacidad del tanque");
			double capacity = sc.nextDouble();
			
			MotorCycle moto = new MotorCycle(price,tradeMark,model, displacement,mileage, isNew,licensePlate,type,capacity);
			
			return moto;
		}
	
		/**
		*Adds a Client object to company <br>
		*
		*<b>pre</b> the object company must be initializated <br>
		*
		*<b>post:</b> adds a Client object to the client ArrayList in the Company object <br>
		*/
		public void addClient(){
			
			this.company.getClients().add(createClient());
		}
		
		/**
		*Creates a Client Object <br>
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> returns a Client object created with custom information <br>
		*
		*@return Client object
		*/
		public Client createClient(){
			System.out.println("Por favor ingrese la siguiente informacion ");
			System.out.println("Nombres");
			String firstName = sc.nextLine();
			System.out.println("Apellidos");
			String lastName = sc.nextLine();
			System.out.println("identificacion");
			String id = sc.nextLine();
			System.out.println("Numero de telefono");
			String phoneNumber = sc.nextLine();
			System.out.println("Correo electronico");
			String email = sc.nextLine();
			
			Client cl = new Client(firstName,lastName,id,phoneNumber,email);
			
			return cl;
		}
	
	
		/**
		*Adds a new Assesor to company <br>
		*
		*<b>pre:</b> the object company must be innitializated <br>
		*
		*<b>post:</b> adds an object Asessor to the employees Arraylist in the company object <br> 
		*/
		public void addEmployee(){
			company.getEmployees().add(createEmployee());
		}
		
		
		/**
		*creates an Asessor object 
		*
		*<b>pre:</b> <br>
		*
		*<b>post:</b> returns an Employee (Asessor object)
		*
		*@return Asessor object with custom information
		*/
		public Asessor createEmployee(){
			System.out.println("Ingrese la información solicitada a continuacion");
			System.out.println("Nombres");
			String firstName = sc.nextLine();
			System.out.println("Apellidos");
			String lastName = sc.nextLine();
			System.out.println("Identificacion");
			String id = sc.nextLine();
			System.out.println("Numero de ventas");
			int sells = sc.nextInt(); sc.nextLine();
			System.out.println("asigna los clientes");
			Client[] cls = chooseClient();
			
			Asessor asessor = new Asessor(firstName,lastName,id,sells,cls);
			
			return asessor;
		}
		
		/**
		*creates an Array with 10 clients <br>
		*
		*<b>pre:</b> 
		*
		*<b>post:</b> returns an Client Array with 10 Client objects <br>
		*
		* @return Array -> Client[10] 
		*/
		public Client[] chooseClient(){
			Client[] clients = new Client[100];
			for (int i = 0; i < company.getClients().size(); i++){
				System.out.println(i+" "+company.getClients().get(i).getFirstName()+" "+ company.getClients().get(i).getFirstName());
			}
			System.out.println("digite los numeros correspondientes a los clientes que desea asignar al asesor");
			for (int i = 0; i < 10; i++){
				clients[i] = company.getClients().get(sc.nextInt());
			}
			return clients;
		}
		
		public void showCatalog(){
			System.out.println("1. filtrar por tipo");
			System.out.println("2. filtrar por precio");
			System.out.println("3. ver todos");
			System.out.println("ingrese el numero de la opcion deseada ");
		}
		
		public void showTypes(){
			System.out.println("1. carros Electricos");
			System.out.println("2. carros de gasolina");
			System.out.println("3. carros hibridos");
			System.out.println("4. motocicletas");
			
			int choice = sc.nextInt();
			 switch (choice){
				 case 1: for (int i = 0; i< company.getVehicles().size(); i++){if (company.getVehicles().get(i) instanceof ElectricCar){company.getVehicles().get(i).getInfo();}} break;
				 case 2: for (int i = 0; i< company.getVehicles().size(); i++){if (company.getVehicles().get(i) instanceof GasCar){company.getVehicles().get(i).getInfo();}} break;
				 case 3: for (int i = 0; i< company.getVehicles().size(); i++){if (company.getVehicles().get(i) instanceof HybridCar ){company.getVehicles().get(i).getInfo();}} break;
				 case 4: for (int i = 0; i< company.getVehicles().size(); i++){if (company.getVehicles().get(i) instanceof MotorCycle ){company.getVehicles().get(i).getInfo();}} break;
			 }
		}
	
		
	}