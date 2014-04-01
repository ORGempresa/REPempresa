package datos;



public class EmpleadoPorComision extends Empleado {
	//Atributos
	private double tasaComisiones;
	private double ventasBrutas;

	//Constructor
	public EmpleadoPorComision (String nombre, String apellidos, String numeroSS, double tasaComisiones, double ventasBrutas){
			super (nombre, apellidos, numeroSS);
			this.tasaComisiones=tasaComisiones;
			this.ventasBrutas=ventasBrutas;
		}
		
	public double getTasaComisiones() {
		return tasaComisiones;
	}

	public void setTasaComisiones(double tasaComisiones) {
		this.tasaComisiones = tasaComisiones;
	}

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public String toString(){
		return super.toString() + "\nTasa de comisiones: " + tasaComisiones + 
				"\nVentas brutas: " + ventasBrutas;
	}

}
