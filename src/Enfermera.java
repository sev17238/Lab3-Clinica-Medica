/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
*/

public class Enfermera extends Guardia{
	private int anos;
	private boolean intensivista;

	public void setEnfermera(String nombre, String nit, int dpi,double salario, int anos, boolean intensivista){
		super.setGuardia(nombre,nit,dpi,salario);
		this.anos = anos;
		this.intensivista = intensivista;
	}

	public int getAnos(){
		return anos;
	}

	public boolean getIntensivista(){
		return intensivista;
	}


}
