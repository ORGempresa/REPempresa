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
		int opcion;
		String mensaje = "1.- Añadir empleado\n2.- Borrar empleado.\n3.- Modificar precio hora\n"
				+ "4.- Modificar tasa comisiones\5.- Modificar salario semanal\n6.- Listar";

		do {
			opcion = CrearMenus.crearMenu(mensaje, "Gestionar Empresa", 6);
		} while (opcion != 6);

	}

	//Metodo para almacenar en Empresa cualquier tipo de Empleado
	public void darAltas(Empleado e) {

		String nombre = JOptionPane
				.showInputDialog("Escribe el nombre del empleado:");
		String apellidos = JOptionPane
				.showInputDialog("Escribe los apellidos del empleado:");
		String numeroSS = JOptionPane
				.showInputDialog("Escribe el número de la Seguridad Social");

		if (e instanceof EmpleadoAsalariado) {
			float salarioSemanal = Float.parseFloat(JOptionPane
					.showInputDialog("Introduce el salario semanal:"));
			EmpleadoAsalariado emple = new EmpleadoAsalariado(nombre,
					apellidos, numeroSS, salarioSemanal);
			empresa.altaEmpleado(emple);
		}
		if (e instanceof EmpleadoPorComision) {
			double tasaComisiones = Double.parseDouble(JOptionPane
					.showInputDialog("Introduce la comisión:"));
			double ventasBrutas = Double.parseDouble(JOptionPane
					.showInputDialog("Introduce las ventas brutas:"));
			EmpleadoPorComision emple = new EmpleadoPorComision(nombre,
					apellidos, numeroSS, tasaComisiones, ventasBrutas);
			empresa.altaEmpleado(emple);
		}
		if (e instanceof EmpleadoBaseMasComision) {
			double tasaComisiones = Double.parseDouble(JOptionPane
					.showInputDialog("Introduce la comisión:"));
			double ventasBrutas = Double.parseDouble(JOptionPane
					.showInputDialog("Introduce las ventas brutas:"));
			double salarioBase = Double.parseDouble(JOptionPane
					.showInputDialog("Introduce el salario base:"));
			EmpleadoBaseMasComision emple = new EmpleadoBaseMasComision(nombre,
					apellidos, numeroSS, tasaComisiones, ventasBrutas,
					salarioBase);
			empresa.altaEmpleado(emple);

		}
		if (e instanceof EmpleadoPorHoras) {
			double precioHora = Double
					.parseDouble(JOptionPane
							.showInputDialog("Introduce el precio que percibe el empleado por hora:"));
			int numHoras = Integer
					.parseInt(JOptionPane
							.showInputDialog("Introduce el número de horas trabajadas:"));
			EmpleadoPorHoras emple = new EmpleadoPorHoras(nombre, apellidos,
					numeroSS, precioHora, numHoras);
			empresa.altaEmpleado(emple);
		}
	}

	public static void main(String[] args) {
		new Aplicacion();
		System.exit(0);

	}

}
