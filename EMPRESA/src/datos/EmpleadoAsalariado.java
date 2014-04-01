package datos;

public class EmpleadoAsalariado extends Empleado{
	// Atributos
	private float salarioSemanal;

	// Constructor
	public EmpleadoAsalariado(String nombre, String apellidos, String numSS,
			float salarioSemanal) {
		super(nombre, apellidos, numSS);
		this.salarioSemanal = salarioSemanal;
	}

}
