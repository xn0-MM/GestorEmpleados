package model;

import lombok.Data;


public @Data class Director extends Empleado{
	
	private double incentivo = 10.0d;
	private double incremento = 100.0d;
	private boolean coche = true;
	
    public Director() {
    }
	
    public void incentivarDirector() {
        double cant = getSalario() * (1 + incentivo / 100);
        this.setSalario(cant);
        System.out.println("El salario del director es de : " + getSalario() + " euros al mes");
    } 
    
    @Override
	public String toString() {
		return "Director " + super.toString() + "incentivo=" + incentivo + ", incremento=" + incremento + " ¿ Tiene coche de empresa ?" + this.isCoche();
	}

}
