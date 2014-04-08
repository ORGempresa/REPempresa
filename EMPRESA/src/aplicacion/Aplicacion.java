package aplicacion;

import java.util.Iterator;

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
				+ "4.- Modificar tasa comisiones\5.- Modificar salario semanal\n6.- Listar";
		
		do {
			opcion=CrearMenus.crearMenu(mensaje, "Gestionar Empresa",6 );
		} while (opcion!=6);
		
	}
	
	//Metodo para modificar el slario semanal de los Empleados 
	public void modificarSalarios(){
		//Variables locales
		String numero;
		Empleado emple;
		float salarioSemanal;
		double salarioBase, tasaComisiones, precioHora;
		
		Iterator <Empleado> iterador = empresa.getEmpleados().iterator();
		emple = iterador.next();
		numero = JOptionPane.showInputDialog("Introduce numero de la SS:");
		if(numero.equals(emple.getNumeroSS())){
			if(emple instanceof EmpleadoAsalariado){
				salarioSemanal = Float.parseFloat(JOptionPane.showInputDialog("Introduce el salario semanal"));
				((EmpleadoAsalariado) emple).setSalarioSemanal(salarioSemanal);
			}else if(emple instanceof EmpleadoBaseMasComision){
				salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce el salario base"));
				((EmpleadoBaseMasComision) emple).setSalarioBase(salarioBase);
			}else if(emple instanceof EmpleadoPorComision){
				tasaComisiones = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tasa por comisiones"));
				((EmpleadoPorComision) emple).setTasaComisiones(tasaComisiones);
			}else if(emple instanceof EmpleadoPorHoras){
				precioHora = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio por hora"));
				((EmpleadoPorHoras) emple).setPrecioHora(precioHora);
			}
		}
	}//fin modificarSalarios

	public static void main(String[] args) {
		new Aplicacion();
		System.exit(0);

	}

}
