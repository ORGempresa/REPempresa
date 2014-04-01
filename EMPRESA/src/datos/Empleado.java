package datos;

public abstract class Empleado  implements Comparable<Empleado>{

	// Atributos
	private String nombre;
	private String apellidos;
	private int numeroSS;

	// Constructores
	public Empleado(String nombre, String apellidos, int numeroSS) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroSS = numeroSS;
	}

	public Empleado() {
	}

	// Métodos para dar valores a los atributos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNumeroSS(int numeroSS) {
		this.numeroSS = numeroSS;
	}

	// Metodo que nos devuelve el numero de la SS
	public int getNumeroSS() {
		return numeroSS;
	}

	// Método para obtener una cadena de caracteres con los valores de los
	// atributos
	public String toString() {
		return nombre + "  " + apellidos + "  " + numeroSS;
	}

	// Metodo que nos compara los empleados por el numero de la SS.
	public int compareTo(Empleado emple) {
		int valor = 0;
		if (numeroSS == emple.getNumeroSS()) {
			valor = 0;
		}
		if (numeroSS > emple.getNumeroSS()) {
			valor = 1;
		}
		if (numeroSS < emple.getNumeroSS()) {
			valor = -1;
		}
		return valor;
	}// Fin del metodo compareTo
}
