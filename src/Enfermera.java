
/**
 * Clase que crea objetos con atributos especiales de Enfermera.
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
* @since 24/09/17
*/
public class Enfermera extends Guardia{
	private int anos;
	private boolean intensivista;
        /**
         * Crea un nuevo objeto de tipo Enfermera.
         * @param nombre de la enfermera
         * @param nit de la enfermera
         * @param dpi de la enfermera
         * @param salario de la enfermera
         * @param anos de experiencia de la enfermera
         * @param intensivista true o false si lo es o no.
         */
	public void setEnfermera(String nombre, String nit, int dpi,double salario, int anos, boolean intensivista){
		super.setGuardia(nombre,nit,dpi,salario);
		this.anos = anos;
		this.intensivista = intensivista;
	}
        /**
         * retorna los años de experiencia de una objeto tipo Enfermera
         * @return los años de esperiencia
         */
	public int getAnos(){
		return anos;
	}
        /**
         * retorna true o false si el objeto tipo Enfermera es intesivista o no
         * @return true o false si la enfermera es intensivista o no.
         */
	public boolean getIntensivista(){
		return intensivista;
	}


}
