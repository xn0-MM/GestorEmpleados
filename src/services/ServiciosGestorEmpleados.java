package services;

import data.IListado;
import data.Listado;

public class ServiciosGestorEmpleados implements IServiciosGestorEmpleados{

	private IListado data = new Listado();
	
	public void addEmpleadoServices() {
		data.addEmpleado();
	}
	
	public void addDirectorServices() {
		data.addDirector();
	}
	
	public void addGerenteServices() {
		data.addGerente();
	}
	
	public void showEmpleadosServices() {
		data.showEmpleados();
	}
	
	public void  findEmpleadoServices() {
		data.findEmpleado();
	}
	
	public void modEmpleadoServices() {
		data.modEmpleado();
	}
	
	public void deleteEmpleadoServices() {
		data.deleteEmpleado();
	}
	
	public void incentivarResponsableServices() {
		data.incentivarResponsable();
	}
}
