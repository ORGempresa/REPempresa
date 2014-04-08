package datos;

public class EmpleadoAsalariado extends Empleado{
	// Atributos
	private double salarioSemanal;

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	// Constructor
	public EmpleadoAsalariado(String nombre, String apellidos, String numSS,
			double salarioSemanal) {
		super(nombre, apellidos, numSS);
		this.salarioSemanal = salarioSemanal;
	}

}
