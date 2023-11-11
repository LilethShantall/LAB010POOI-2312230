package Pc2;

public class Medico {
	private int numerodecolegiatura;
	private String nombre;
	private String especialidad;
	
	public Medico(int numerodecolegiatura, String nombre, String especialidad) {
		super();
		this.numerodecolegiatura = numerodecolegiatura;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public int getNumerodecolegiatura() {
		return numerodecolegiatura;
	}

	public void setNumerodecolegiatura(int numerodecolegiatura) {
		this.numerodecolegiatura = numerodecolegiatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Paciente [numerodecolegiatura=" + numerodecolegiatura + ", nombre=" + nombre + ", especialidad="
				+ especialidad + "]";
	}

}
