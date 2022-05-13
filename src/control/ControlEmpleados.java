package control;

import gui.Menu;
import services.IServiciosGestorEmpleados;
import services.ServiciosGestorEmpleados;
import utils.LeerTeclado;

public class ControlEmpleados {
	
	IServiciosGestorEmpleados services = new ServiciosGestorEmpleados();
	
	public void displayMenu () {
		
		boolean cont = true;
		do {
			Menu.showMenu();
			cont = chooseOption();			
		} while(cont);
	}

	public boolean chooseOption() {
		
		boolean updateMenu = true;
		int choose = LeerTeclado.leerInt("Pulsa el número de la opción que quieras escoger");
		switch (choose) {
		
		case 1:
			services.showEmpleadosServices();
			break;
			
		case 2: 
			services.addEmpleadoServices();
			break;
			
		case 3: 
			services.addDirectorServices();
			break;
			
		case 4:
			services.addGerenteServices();
			break;
			
		case 5:
			services.deleteEmpleadoServices();
			break;
			
		case 6:
			services.modEmpleadoServices();
			break;
			
		case 7:
			services.incentivarResponsableServices();
			break;
		case 0:
			updateMenu = false;
			
		}
			return updateMenu;
	}
}

