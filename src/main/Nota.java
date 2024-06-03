package main;

public class Nota {
	
	private int id;
	private String nombre;
	private double NotaExamen;
	private double NotaTrabajo;
	private double NotaActitud;
	
	public Nota() {
		
	}
	
	
	public Nota(int id, String nombre, double notaExamen, double notaTrabajo, double notaActitud) {
		this.id = id;
		this.nombre = nombre;
		NotaExamen = notaExamen;
		NotaTrabajo = notaTrabajo;
		NotaActitud = notaActitud;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNotaExamen() {
		return NotaExamen;
	}
	public void setNotaExamen(double notaExamen) {
		NotaExamen = notaExamen;
	}
	public double getNotaTrabajo() {
		return NotaTrabajo;
	}
	public void setNotaTrabajo(double notaTrabajo) {
		NotaTrabajo = notaTrabajo;
	}
	public double getNotaActitud() {
		return NotaActitud;
	}
	public void setNotaActitud(double notaActitud) {
		NotaActitud = notaActitud;
	}
	
	@Override
	public String toString() {
		return "Nota [id=" + id + ", nombre=" + nombre + ", NotaExamen=" + NotaExamen + ", NotaTrabajo=" + NotaTrabajo
				+ ", NotaActitud=" + NotaActitud + "]";
	}
}
