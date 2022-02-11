package co.edu.unbosque.model;

public class Estudiante {


	private String nombre;
	private String carrera;
	private int edad;
	private String género;
	public Estudiante() {
		
		this.carrera = carrera;
		this.edad = edad;
		this.género = género;
		this.nombre = nombre;
		
		//System.out.println("los datos del estudiante son: "
		//	+ "\n carrera:"+carrera+" "
		//			+ "\n edad: "+edad+" "
		//					+ "\n género: "+género);
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGénero() {
		return género;
	}
	public void setGénero(String género) {
		this.género = género;
	}
}
