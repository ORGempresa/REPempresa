package datos;


public abstract class Empleado {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private String numeroSS;
	
	//Constructores
	public Empleado(String nombre, String apellidos, String numeroSS){
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.numeroSS=numeroSS;
	}
	public Empleado(){}

	//Métodos para dar valores a los atributos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}
	
	//Método para obtener una cadena de caracteres con los valores de los atributos
	public  String  toString(){
		return nombre + "  "+ apellidos + "  " + numeroSS;
	}

}
