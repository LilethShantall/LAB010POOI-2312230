package Pc2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Paciente Paciente1=new Paciente("44333422","Lula","SanLuis",67,36);
		Paciente Paciente2=new Paciente("23233435","Adrian","SanJuan",45,35);
		Paciente Paciente3=new Paciente("23206712","Dante","Molina",56,32);
		Paciente Paciente4=new Paciente("43452122","Valentina","Florida",57,31);
		
		
		
		// TODO Auto-generated method stub
	        Hospital sistema = new Hospital();
	        sistema.adicionar(Paciente1);
	        sistema.adicionar(Paciente2);
	        sistema.adicionar(Paciente3);
	        sistema.adicionar(Paciente4);
	        
	        Scanner scanner = new Scanner(System.in);

	        int opcion;
	        do {
	            System.out.println("1. Registrar paciente");
	            System.out.println("2. Eliminar paciente");
	            System.out.println("3. Modificar datos de paciente");
	            System.out.println("4. Mostrar peso más repetido");
	            System.out.println("5. Mostrar cantidad de pacientes con peso más repetido");
	            System.out.println("6. Mostrar peso mayor y menor");
	            System.out.println("7. Dividir rango de pesos y mostrar cantidad de pacientes en cada rango");
	            System.out.println("8. Mostrar lista de pacientes ordenados por nombre");
	            System.out.println("9. Mostrar médico que atendió a un paciente");
	            System.out.println("10. Buscar doctores");
	            System.out.println("0. Salir");
	            System.out.print("Ingrese opción: ");
	            opcion = scanner.nextInt();

	           if (opcion==1){
	        	   sistema.registrarPaciente();
	           }
	           if (opcion==2){
	        	   sistema.eliminarPaciente();
	           }
	           if (opcion==3){
	        	   sistema.modificarDatos();
	           }
	           if (opcion==4){
	        	   sistema.mostrarPeso();
	           }
	           if (opcion==5){
	        	   sistema.mostrarCantidadPesoRepetido();
	           }
	           if (opcion==6){
	        	   sistema.mostrarPesosMyM();
	           }
	           if (opcion==7){
	        	   sistema.mostrarRangoPesos();
	           }
	           if (opcion==8){
	        	   sistema.mostrarOrdenNombre();
	           }
	           if (opcion==9){
	        	   sistema.mostrarMedico();
	           }
	           if (opcion==10){
	        	   sistema.buscarDoctores();
	           }


	        } while (opcion != 0);
	    }
	}
	         