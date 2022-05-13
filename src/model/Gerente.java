package model;


import lombok.Data;

public @Data class Gerente extends Empleado{
	
	private double incentivo = 5.0d;
	
    public Gerente() {
    }

    public void incentivarGerente() {
        double cantidad = getSalario() * (1 + incentivo / 100);
        this.setSalario(cantidad);
        System.out.println("El salario del gerente es de : " + getSalario() + " al mes");
    }
}
