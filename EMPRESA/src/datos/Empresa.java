package datos;

import java.util.HashSet;
import java.util.TreeSet;

public class Empresa {
	//Atributos
	private String nombre;
	private String idenFiscal;
	private TreeSet<Empleado> empleados;
	
	//Constructor
	public Empresa (String nombre,String idenFiscal){
		this.nombre=nombre;
		this.idenFiscal=idenFiscal;
		empleados = new TreeSet<Empleado>();
	}
	
	public Empresa(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getIdenFiscal() {
		return idenFiscal;
	}

	public TreeSet<Empleado> getEmpleados() {
		return empleados;
	}
	
	//Método para añadir un empleado
	public void altaEmpleado(Empleado e){
		empleados.add(e);
	}
	
	//Método para borrar un empleado
	public void bajaEmpleado(Empleado e){
		empleados.remove(e);
	}

}
