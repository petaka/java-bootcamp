package Hospital;

public class Hospital {

	private String nombre;
	private int cantidadHabitaciones;
	private int cantidadPisos;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}
	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}
	public int getCantidadPisos() {
		return cantidadPisos;
	}
	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}
	@Override
	public String toString() {
		return "Hospital [nombre=" + nombre + ", cantidad de habitaciones=" + cantidadHabitaciones + ", cantidad de pisos=" + cantidadPisos + "]";
	}
	
	
}
