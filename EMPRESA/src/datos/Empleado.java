package datos;

public abstract class Empleado implements Comparable<Empleado> {

	// Atributos
	private String nombre;
	private String apellidos;
	private String numeroSS;

	// Constructores
	public Empleado(String nombre, String apellidos, String numeroSS) {

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

	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}

	// Metodo que nos devuelve el numero de la SS
	public String getNumeroSS() {
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
		// Si los numero de la seguridad social se repiten
		if (numeroSS.equals(emple.getNumeroSS())) {
			valor = 0;
			// Ordenados alfabeticamente
		} else if (numeroSS.compareTo(emple.getNumeroSS()) > 1) {
			valor = 1;
		} else if (numeroSS.compareTo(emple.getNumeroSS()) < 1) {
			valor = -1;
		}
		return valor;
	}// Fin del metodo compareTo


}
