package aplicacion;

import javax.swing.JOptionPane;

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
				+ "4.- Modificar tasa comisiones\5.- Modificar salario semanal\n6.- Listar";
		
		do {
			opcion=CrearMenus.crearMenu(mensaje, "Gestionar Empresa",6 );
		} while (opcion!=6);
		
	}
	
	

	public static void main(String[] args) {
		new Aplicacion();
		System.exit(0);

	}

}
