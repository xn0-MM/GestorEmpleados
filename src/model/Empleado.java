package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import utils.LeerTeclado;


public @Data @AllArgsConstructor class Empleado {
	private String nombre;
	private double salario;
	private String fechaNacimiento;
	private Departamento departamento;
	
	
	public Empleado() {
    }
	
    public void buildEmpleado() {
        this.nombre = LeerTeclado.leerLinea("Introduce el nombre: ");
        this.salario = LeerTeclado.leerDouble("Introduzca el salario:");
        this.fechaNacimiento = LeerTeclado.leerLinea("Introduce la fecha de nacimiento");
          
    }
	
	@Override
	public String toString() {
		return this.getNombre() + " | Salario: " + this.getSalario() + " | Fecha de nacimiento " + this.getFechaNacimiento();
	}

}
