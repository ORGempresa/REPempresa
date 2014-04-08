package aplicacion;

import java.util.Iterator;

import javax.swing.JOptionPane;

import crearmenu.CrearMenu;
import datos.Empleado;
import datos.EmpleadoAsalariado;
import datos.EmpleadoBaseMasComision;
import datos.EmpleadoPorComision;
import datos.EmpleadoPorHoras;
import datos.Empresa;
import menus.CrearMenus;

public class Aplicacion {

	// Atributos
	private Empresa empresa;

	// Constructor
	public Aplicacion() {
		// Pedir nombre de la empresa
		String nombre = JOptionPane.showInputDialog(null,
				"Nombre de la empresa");
		String idenFiscal = JOptionPane.showInputDialog("Num. id. fiscal");
		empresa = new Empresa(nombre, idenFiscal);

		// Menu
		int opcion=0;
		String mensaje = "1.- Añadir empleado\n2.- Borrar empleado.\n3.- Modificar precio hora\n"
				+ "4.- Modificar tasa comisiones\5.- Modificar salario semanal\n6.- Listar";

		do {
			opcion =CrearMenu.crearMenu("Gestionar empresa", mensaje, 6, 1);

			switch (opcion) {

			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				
				menuListar();
				break;
			
		

			}// Fin del switch

		} while (opcion != 6);

	}

	private void menuListar() {
		String mensaje = "1.Listar empleados por categorías"
				+ "\n2.Listar empleados asalariados"
				+ "\n3.Listar empleados por comisión"
				+ "\n4.Listar empleados por horas"
				+ "\n5.Listar empleados de tipo base más comisión."
				+ "\n6.Salir";
		int opcion = 0;
		do {
			opcion = CrearMenu.crearMenu("Listados de la empresa  : "+ empresa.getNombre(), mensaje, 6, 1);
			switch (opcion) {
			
			// Listado por categorias
			case 1:
				listarEmpleados();
				break;
				
			// listado asalariados
			case 2:
				listarEmpleadosAsalariados();
				break;
				
			// listado por comision
			case 3:
				listarEmpleadosPorComision();
				break;
				
			// listado por horas
			case 4:
				listarEmpleadosPorHoras();
				break;
				
			// lista base mas comison
			case 5:
				listarEmpleadosBaseMasComision();
				
				//Salir del submenú
			case 6:
				break;
				
				
			}// Fin del switch
		} while (opcion != 6);
	}// Fin del método listar

	// Listar por categorías
	private void listarEmpleados() {

		Iterator<Empleado> apuntador = empresa.getEmpleados().iterator();// Devuelve
																			// una
																			// referencia
		String cadena = "Categorías:";
		String cadenaAsalariados = "\nEmpleados asalariados:";
		String cadenaComision = "\nEmpleados por comisión:";
		String cadenaHoras = "\nEmpleados por horas:";
		String cadenaBaseMasComision = "\nEmpleados de tipo base más comisión:";

		// Bucle para recorrer la lista
		while (apuntador.hasNext()) {// Si hay elemento en la lista

			Empleado miEmpleado = apuntador.next();// Guarda el elemento de la
													// estructura para
													// utilizarlo

			// Listado por categorias

			if (miEmpleado instanceof EmpleadoAsalariado) {

				cadenaAsalariados += miEmpleado.toString() + "\n";

			} else if (miEmpleado instanceof EmpleadoPorComision) {

				cadenaComision += miEmpleado.toString() + "\n";

			} else if (miEmpleado instanceof EmpleadoBaseMasComision) {

				cadenaBaseMasComision += miEmpleado.toString() + "\n";

			} else if (miEmpleado instanceof EmpleadoPorHoras) {

				cadenaHoras += miEmpleado.toString() + "\n";

			}// Fin del if-else

		}// fin del while
		JOptionPane.showMessageDialog(null, cadena + cadenaAsalariados
				+ cadenaHoras + cadenaComision + cadenaBaseMasComision);
	}

	// Listado por asalariados
	private void listarEmpleadosAsalariados() {
		Iterator<Empleado> apuntador = empresa.getEmpleados().iterator();// Devuelve
		// una
		// referencia

		String cadenaAsalariados = "\nEmpleados asalariados:";
		// Bucle para recorrer la lista
		while (apuntador.hasNext()) {// Si hay elemento en la lista

			Empleado miEmpleado = apuntador.next();// Guarda el elemento de la
													// estructura para
													// utilizarlo

			// Listado por categorias

			if (miEmpleado instanceof EmpleadoAsalariado) {

				cadenaAsalariados += miEmpleado.toString() + "\n";
			}

		}
		JOptionPane.showMessageDialog(null, cadenaAsalariados);
	}

	// Listado por comison
	private void listarEmpleadosPorComision() {
		Iterator<Empleado> apuntador = empresa.getEmpleados().iterator();// Devuelve
		// una
		// referencia

		String cadenaComision = "\nEmpleados por comisión:";
		// Bucle para recorrer la lista
		while (apuntador.hasNext()) {// Si hay elemento en la lista

			Empleado miEmpleado = apuntador.next();// Guarda el elemento de la
													// estructura para
													// utilizarlo

			// Listado por categorias

			if (miEmpleado instanceof EmpleadoPorComision) {

				cadenaComision += miEmpleado.toString() + "\n";
			}

		}
		JOptionPane.showMessageDialog(null, cadenaComision);
	}

	// Listado de empleados base mas comsion
	private void listarEmpleadosBaseMasComision() {
		Iterator<Empleado> apuntador = empresa.getEmpleados().iterator();// Devuelve
		// una
		// referencia

		String cadenaBaseMasComision = "\nEmpleados de tipo base más comisión:";
		// Bucle para recorrer la lista
		while (apuntador.hasNext()) {// Si hay elemento en la lista

			Empleado miEmpleado = apuntador.next();// Guarda el elemento de la
													// estructura para
													// utilizarlo

			// Listado por categorias

			if (miEmpleado instanceof EmpleadoBaseMasComision) {

				cadenaBaseMasComision += miEmpleado.toString() + "\n";
			}

		}
		JOptionPane.showMessageDialog(null, cadenaBaseMasComision);
	}

	// Listado po horas
	private void listarEmpleadosPorHoras() {
		Iterator<Empleado> apuntador = empresa.getEmpleados().iterator();// Devuelve
		// una
		// referencia

		String cadenaHoras = "\nEmpleados por horas:";
		// Bucle para recorrer la lista
		while (apuntador.hasNext()) {// Si hay elemento en la lista

			Empleado miEmpleado = apuntador.next();// Guarda el elemento de la
													// estructura para
													// utilizarlo

			// Listado por categorias

			if (miEmpleado instanceof EmpleadoPorHoras) {

				cadenaHoras += miEmpleado.toString() + "\n";
			}

		}
		JOptionPane.showMessageDialog(null, cadenaHoras);
	}

	public static void main(String[] args) {
		new Aplicacion();
	

	}

}
