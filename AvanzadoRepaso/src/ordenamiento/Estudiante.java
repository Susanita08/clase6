package ordenamiento;

public class Estudiante {
	private String nombre;
	private Integer legajo;
	private Integer edad;
	
	
	public Estudiante(String nombre, Integer legajo, Integer edad) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.edad = edad;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", legajo=" + legajo + ", edad=" + edad + "]";
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
