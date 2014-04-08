package aplicacion;

import java.util.Iterator;

import javax.swing.JOptionPane;

import datos.Empleado;
import datos.EmpleadoAsalariado;
import datos.EmpleadoPorComision;
import datos.EmpleadoPorHoras;
import datos.Empresa;
import entradadatos.EntradaGraficaDatos;
import menus.CrearMenus;

public class Aplicacion {
	
	//Atributos
	private Empresa empresa;
	
	//Constructor
	public Aplicacion(){
		//Pedir nombre de la empresa
		String nombre = JOptionPane.showInputDialog(null, "Nombre de la empresa");
		String idenFiscal = JOptionPane.showInputDialog("Num. id. fiscal");
		empresa = new Empresa(nombre, idenFiscal);
		
		//Menu
		int opcion;
		String mensaje="1.- Añadir empleado\n"
				+ "2.- Borrar empleado.\n"
				+ "3.- Modificar precio hora\n"
				+ "4.- Modificar tasa comisiones\n"
				+ "5.- Modificar salario semanal\n"
				+ "6.- Listar\n"
				+ "7.- Salir";
		
		do {
			opcion=CrearMenus.crearMenu(mensaje, "Gestionar Empresa",7 );
			switch(opcion){
			case 1:
				añadirEmpleado();
				break;
			case 2:
				borrarEmpleado();
				break;
			case 3:
				modificarSalarios();
				break;
			case 4:
				modificarSalarios();
				break;
			case 5:
				modificarSalarios();
				break;
			case 6:
				listarEmpleados();
				break;
			default:
					break;
			}
		} while (opcion!=7);
		
	}
	void añadirEmpleado(){
		
	}
	void borrarEmpleado(){
		String numero = JOptionPane.showInputDialog("Número de la SS del empleado a borrar");
		Empleado emple;
		Iterator <Empleado> apuntador = empresa.getEmpleados().iterator();
		while(apuntador.hasNext()) {
			emple=apuntador.next();
			if (numero == emple.getNumeroSS()){
				empresa.bajaEmpleado(emple);
			}
		}
		
	}
	void modificarSalarios(){
		
	}
	void listarEmpleados(){
		
	}

	public static void main(String[] args) {
		new Aplicacion();
		System.exit(0);

	}

}
