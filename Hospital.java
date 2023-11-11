package Pc2;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.*;
import Pc2.Medico;
import Pc2.Paciente;
import java.io.*;

	public class Hospital {
	    private static ArrayList<Paciente>pacientes;
	    private static ArrayList<Medico>medicos;
		private Paciente paciente;
	    
	    public Hospital() {
	        pacientes = new ArrayList<>();
	  
	    }



		public void adicionar(Paciente paciente) {
			// TODO Auto-generated method stub
	    	pacientes.add(paciente);
		}
		
		public void registrarPaciente( ) {
	        Scanner scanner = new Scanner(System.in);
	    	System.out.println("Ingrese DNI del paciente: ");
	    	String DNI = scanner.nextLine();
	    	
	    	System.out.println("Ingrese Nombre del paciente: ");
	    	String nombre = scanner.nextLine();

	    	System.out.println("Ingrese dirección del estudiante: ");
	    	String dirección = scanner.nextLine();

	    	System.out.println("Ingrese peso del estudiante: ");
	    	int peso = (int) scanner.nextDouble();

	    	System.out.println("Ingrese temperatura del estudiante: ");
	    	double temperatura = scanner.nextDouble();

	    	
	    	Paciente nuevoPaciente = new Paciente (DNI, nombre, dirección, peso, temperatura);
			ArrayList<Pc2.Paciente> pacientes = null;
			pacientes.add(nuevoPaciente);
	    
	    System.out.println("Se registro con éxito.");
	}
		public void eliminarPaciente() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Posición del paciente a eliminar:");
				int posicion = scanner.nextInt();

				if (posicion >= 0 && posicion < pacientes.size()) {
				    pacientes.remove(posicion);
				    System.out.println("Paciente eliminado correctamente.");
				} else {
				    System.out.println("ERROR. No se pudo eliminar el paciente.");
				}
			}
	    }

	    public void modificarDatos() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Posición del paciente a modificar:");
				int posicion = scanner.nextInt();

				if (posicion >= 0 && posicion < pacientes.size()) {
				    Paciente paciente = pacientes.get(posicion);

				    System.out.println("Nuevo peso del paciente:");
				    double nuevoPeso = scanner.nextDouble();
				    paciente.setPeso(nuevoPeso);

				    System.out.println("Nueva temperatura del paciente:");
				    double nuevaTemperatura = scanner.nextDouble();
				    paciente.setTemperatura(nuevaTemperatura);

				    System.out.println("Datos del paciente modificados correctamente.");
				} else {
				    System.out.println("ERROR. No se pudo modificar los datos del paciente.");
				}
			}
	    }

	    public void mostrarPeso() {
	        Map<Double, Integer> frecuenciaPesos = new HashMap<>();

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();
	            frecuenciaPesos.put(peso, frecuenciaPesos.getOrDefault(peso, 0) + 1);
	        }

	        double pesoMasRepetido = Collections.max(frecuenciaPesos.entrySet(), Map.Entry.comparingByValue()).getKey();

	        System.out.println("Peso más repetitivo: " + pesoMasRepetido);
	    }
	    public void mostrarCantidadPesoRepetido() {
	        Map<Double, Integer> frecuenciaPesos = new HashMap<>();

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();
	            frecuenciaPesos.put(peso, frecuenciaPesos.getOrDefault(peso, 0) + 1);
	        }

	        double pesoMasRepetido = Collections.max(frecuenciaPesos.entrySet(), Map.Entry.comparingByValue()).getKey();
	        int cantidadPacientes = frecuenciaPesos.get(pesoMasRepetido);

	        System.out.println("Peso más repetitivo: " + pesoMasRepetido);
	        System.out.println("Cantidad de pacientes con ese peso: " + cantidadPacientes);
	    }

	    public void mostrarPesosMyM() {
	        double pesoMayor = Double.MIN_VALUE;
	        double pesoMenor = Double.MAX_VALUE;

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();
	            pesoMayor = Math.max(pesoMayor, peso);
	            pesoMenor = Math.min(pesoMenor, peso);
	        }

	        System.out.println("Peso mayor en la lista: " + pesoMayor);
	        System.out.println("Peso menor en la lista: " + pesoMenor);
	    }

	    public void mostrarRangoPesos() {
	        int rango1 = 0, rango2 = 0, rango3 = 0, rango4 = 0;

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();

	            if (peso >= 40 && peso < 60) {
	                rango1++;
	            } else if (peso >= 60 && peso < 80) {
	                rango2++;
	            } else if (peso >= 80 && peso < 100) {
	                rango3++;
	            } else if (peso >= 100 && peso <= 120) {
	                rango4++;
	            }
	        }

	        System.out.println("Pacientes en rango 40-60: " + rango1);
	        System.out.println("Pacientes en rango 60-80: " + rango2);
	        System.out.println("Pacientes en rango 80-100: " + rango3);
	        System.out.println("Pacientes en rango 100-120: " + rango4);
	    }

	    public void mostrarOrdenNombre() {
	        Collections.sort(pacientes, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));

	        System.out.println("Lista de pacientes ordenados por nombres:");
	        for (Paciente paciente : pacientes) {
	            System.out.println("Nombre: " + paciente.getNombre());
	        }
	    }

	    public void mostrarMedico() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Posición del paciente:");
	        int posicion = scanner.nextInt();

	        if (posicion >= 0 && posicion < pacientes.size()) {
	            Paciente paciente = pacientes.get(posicion);
	            Medico medico = paciente.getMedico();

	            System.out.println("El medico que atendió al paciente fue:");
	            System.out.println("Nombre: " + medico.getNombre());
	            System.out.println("Especialidad: " + medico.getEspecialidad());
	        } else {
	            System.out.println("ERROR. No es posible obtener el médico que atendió al paciente.");
	        }
	    }

	    public void buscarDoctores() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Especialidad buscada:");
	        String especialidadBuscada = scanner.nextLine();

	        System.out.println("Doctores con la especialidad " + especialidadBuscada + ":");
	        for (Medico medico : medicos) {
	            if (medico.getEspecialidad().equalsIgnoreCase(especialidadBuscada)) {
	                System.out.println("Nombre: " + medico.getNombre());
	                System.out.println("Especialidad: " + medico.getEspecialidad());
	                System.out.println("");
	            }
	        }
	    }
}