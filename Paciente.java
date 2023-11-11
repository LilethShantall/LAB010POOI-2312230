package Pc2;

import Pc2.Medico;

public class Paciente {
	private String DNI;
	private String nombre;
	private String dirección;
	private double peso;
	private double temperatura;
	Medico medico;

	
	public Paciente(String dni, String nombre,String dirección, double peso, double temperatura) {
		super();
		this.DNI = dni;
		this.nombre=nombre;
		this.dirección = dirección;
		this.peso = peso;
		this.temperatura = temperatura;
	}

	

		public String getNombre() {
	        return nombre;
	        
	    }
	    public double getPeso() {
	        return peso;
	    }
	   
	  
	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public double getTemperatura() {
	        return temperatura;
	    }

	    public void setTemperatura(double temperatura) {
	        this.temperatura = temperatura;
	    }

	    public Medico getMedico() {
	        return medico;
	    }

	    public void setMedico(Medico medico) {
	        this.medico = medico;
	    }

		@Override
		public String toString() {
			return "Paciente [DNI=" + DNI + ", nombre=" + nombre + ", dirección=" + dirección + ", peso=" + peso
					+ ", temperatura=" + temperatura + ", medico=" + medico + "]";
		}

		public void add(Paciente paciente) {
			// TODO Auto-generated method stub
			
		}

	}

