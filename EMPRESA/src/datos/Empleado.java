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

	// M�todos para dar valores a los atributos
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

	// M�todo para obtener una cadena de caracteres con los valores de los
	// atributos
	public String toString() {
		return nombre + "  " + apellidos + "  " + numeroSS;
	}

	public boolean equals(Object emple) {
		boolean devolver = false;
		Empleado alu;
		// Nos aseguramos que lo que llega es un empleado
		if (emple instanceof Empleado) {
			emple = (Empleado) emple;
			if (numeroSS.equals(((Empleado) emple).getNumeroSS())) {
				devolver = true;
			}
		}
		return devolver;
	}
}
