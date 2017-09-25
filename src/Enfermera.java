
/**
 * Clase que crea objetos con atributos especiales de Enfermera.
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
* @since 24/09/17
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
