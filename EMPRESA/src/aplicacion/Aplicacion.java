package aplicacion;

import java.util.Iterator;

import javax.swing.JOptionPane;

import datos.Empleado;
import datos.EmpleadoAsalariado;
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
	
	public void modificarSalario(){
		Iterator <Empleado> iterador = new Iterator();
		String numero = JOptionPane.showInputDialog("Introduce numero de la SS:");
		if(numero == Empleado.getNumeroSS()){
			if(Empleado instanceof EmpleadoAsalariado){
				EmpleadoAsalariado
			}
		}
		
	}//fin modificarSalario

	public static void main(String[] args) {
		new Aplicacion();
		System.exit(0);

	}

}
