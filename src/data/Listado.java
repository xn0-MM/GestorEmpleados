package data;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import model.Empleado;
import model.Gerente;
import utils.LeerTeclado;
import model.Director;

public @Data class Listado implements IListado{

	private List<Empleado> listado = new ArrayList<>();

    public void showEmpleados() {
    	for (Empleado empleado : listado)
    		System.out.println(empleado);
    		System.out.println("      ");
    }
    
    public void addEmpleado() {
        Empleado empleado = new Empleado();
        empleado.buildEmpleado();
        listado.add(empleado);
    }
    
    public void addDirector() {
        Director director = new Director();
        director.buildEmpleado();
        listado.add(director);
    }
    public void addGerente() {
        Gerente gerente = new Gerente();
        gerente.buildEmpleado();
        listado.add(gerente);
    }
    
    public int findEmpleado() {
        String nombreEmp = LeerTeclado.leerLinea("Introduce nombre empleado: ");

        for (Empleado x : listado) {
            if (x.getNombre().equalsIgnoreCase(nombreEmp)) {
                return 1;
            }
            break;
        }
        return 0;
    }
    
    public void deleteEmpleado() {
        String nombreEmp = LeerTeclado.leerLinea("Introduce nombre del empleado que quieres borrar de la base de datos: ");

        for (Empleado y : listado) {
            if (y.getNombre().equalsIgnoreCase(nombreEmp)) {
                listado.remove(y);
                System.out.println("El empleado ha sido borrado de la base de datos");
            } else {
                System.out.println("No se encuentra el empleado en la base de datos");
            }
        }
    }
    
    public void modEmpleado() {
        String nombreEmp = LeerTeclado.leerLinea("Introduce nombre del empleado que quieres modificar: ");

        for (Empleado z : listado) {
            if (z.getNombre().equalsIgnoreCase(nombreEmp)) {
                z.setNombre(LeerTeclado.leerLinea("Introduce un nombre nuevo"));
                z.setSalario(LeerTeclado.leerDouble("Introduce un salario nuevo"));
                System.out.println("Empleado modificado");
            } else {
                System.out.println("El empleado no existe");
            }
        }
    }
    
    public void incentivarResponsable() {
        for (Empleado empleado : listado) {
            if (empleado instanceof Director) {
                ((Director) empleado).incentivarDirector();
                System.out.println("Se ha incentivado al director");
            } else if (empleado instanceof Gerente) {
                ((Gerente) empleado).incentivarGerente();
                System.out.println("Se ha incentivado al gerente");
            } else {
                System.out.println("El empleado no tiene ningún puesto de responsabilidad");
            }
        }
    }    
    
    
    
}
