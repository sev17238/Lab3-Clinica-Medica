
/**
 * Clase padrde de las clases Enfermera y Medico que contiene atributos comunes de ambos como el nombre,
 * nit, dpi y salario.
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
* @since 24/09/17
*/
public class Guardia{
	private String nombre;
	private String nit;
	private int dpi;
        private double salario;
        /**
         * Metodo que crea un nuevo objeto de tipo Guardia
         * @param nombre de la guardia sea medico o enfermera
         * @param nit de la guardia sea medico o enfermera
         * @param dpi de la guardia sea medico o enfermera
         * @param salario de la guardia sea medico o enfermera
         */
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
