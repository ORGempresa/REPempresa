package datos;

public class EmpleadoPorHoras extends Empleado {
	
	//Atributos
	private double precioHora;
	private int numHoras;	
	
	//Constructores
	public EmpleadoPorHoras(String nombre, String apellidos, String numeroSS, double precioHora, int numHoras){
		super(nombre, apellidos, numeroSS);
		this.precioHora = precioHora;
		this.numHoras = numHoras;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

}
