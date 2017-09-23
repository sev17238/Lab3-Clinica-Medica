/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
*/
public class Guardia{
	private String nombre;
	private String nit;
	private int dpi;
        private double salario;

	public void setGuardia(String nombre,String nit, int dpi, double salario){
		this.nombre = nombre;
		this.nit = nit;
		this.dpi = dpi;
                this.salario = salario;
	}

	public String getNombre(){
		return nombre;
	}
	public String getNit(){
		return nit;
	}
	public int getDpi(){
		return dpi;
	}
        public double getSalario(){
		return salario;
	}

}
