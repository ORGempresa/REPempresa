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

	public void setSalarioSemanal(float salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	//Metodos para cambiar datos
	
	
}
