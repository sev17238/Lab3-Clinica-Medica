
/**
 * Clase que crea objetos con atributos especiales de medico.
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
* @since 24/09/17
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