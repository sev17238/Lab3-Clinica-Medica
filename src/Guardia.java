
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
