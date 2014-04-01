package datos;



public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	//Atributos
	private double salarioBase;
	
	//Constructor
	public EmpleadoBaseMasComision (String nombre, String apellidos, String numeroSS, double tasaComisiones, double ventasBrutas,double salarioBase){
		super (nombre, apellidos, numeroSS, tasaComisiones, ventasBrutas);
		this.salarioBase=salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String toString(){
		return super.toString() + "\nSalario Base: " + salarioBase;
	}
}
