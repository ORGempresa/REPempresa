package aplicacion;

import javax.swing.JOptionPane;

import datos.Empleado;
import datos.EmpleadoAsalariado;
import datos.EmpleadoBaseMasComision;
import datos.EmpleadoPorComision;
import datos.EmpleadoPorHoras;
import datos.Empresa;
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
		String mensaje="1.- Añadir empleado\n2.- Borrar empleado.\n3.- Modificar precio hora\n"
				+ "4.- Modificar tasa comisiones\n5.- Modificar salario semanal\n6.- Listar\n7.- Salir";
		
		do {
			opcion=CrearMenus.crearMenu(mensaje, "Gestionar Empresa",7 );
			switch (opcion) {
			case 1:
				añadirEmpleado();
				break;

			default:
				break;
			}
		} while (opcion!=7);
		
	}
	void añadirEmpleado(){
		int opcion;
		String mensaje="1.-Añadir empleado Asalariado\n2.-Añadir empleado Base mas Comisión\n3.-Añadir empleado"
				+ " por Comision\n4.-Añadir empleado por Horas\n5.-Volver al menu principal";
		do {
			opcion=CrearMenus.crearMenu(mensaje, "Selecciona Tipo Empleado",5 );
			switch (opcion) {
			case 1:
				EmpleadoAsalariado empleadoAsalariado = null;
				darAltas(empleadoAsalariado);
				break;
			case 2:
				EmpleadoBaseMasComision empleadoBaseMasComision = null;
				darAltas(empleadoBaseMasComision);
				break;
			case 3:
				EmpleadoPorComision empleadoPorComision = null;
				darAltas(empleadoPorComision);
				break;
			case 4:
				EmpleadoPorHoras empleadoPorHoras = null;
				darAltas(empleadoPorHoras);
				break;
			case 5:
				break;
			}
		} while (opcion!=5);
			
	}
	void darAltas(Empleado e){
		
	}

	public static void main(String[] args) {
		new Aplicacion();
		System.exit(0);

	}

}
