
/**
 * Clase que crea objetos con atributos especiales de medico.
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
* @since 24/09/17
*/
public class Medico extends Guardia{
	private int colegiado;
	private boolean especialista;
        /**
         * Metodo que crea un nuevo objeto de tipo medico.
         * @param nombre del medico
         * @param nit del medico
         * @param dpi del medico
         * @param salario del medico 
         * @param colegiado del medico
         * @param especialista true o false si el medico es especialista o no.
         */
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