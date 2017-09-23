/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
*/
public class Medico extends Guardia{
	private int colegiado;
	private boolean especialista;

	public void setMedico(String nombre, String nit, int dpi,double salario, int colegiado, boolean especialista){
		super.setGuardia(nombre,nit,dpi,salario);
		this.colegiado = colegiado;
		this.especialista = especialista;
	}

	public int getColegiado(){
		return colegiado;
	}
	public boolean getEspecialista(){
		return especialista;
	}
        
}