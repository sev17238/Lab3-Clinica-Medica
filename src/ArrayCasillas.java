
/**
 * Clase que crea objetos que tienen como atributo una lista con dos posiciones.
* @autor Alejandro Tejada 17584
* @autor Diego Sevilla 17238
* @since 24/09/17
*/
public class ArrayCasillas {
    private Guardia[] array;    
    public ArrayCasillas(){
        array = new Guardia[2];
    }      
     /**
     * Metodo que busca un medico en la lista de cada casilla de la matriz, para retornar el objeto si se
     * encuentra en la lista, de lo contraria se retorna null.
     * @param dpi el dpi del medico que se quiere buscar
     * @return objeto de tipo Guardia con instanciado Medico
     */
    public Guardia EnfermeraCasilla(int dpi){
            Guardia enf = new Guardia();
	for (int i = 0;i<array.length;i++) {
            enf = array[i];
            if(enf instanceof Enfermera){
        	return enf; 
            }
	}
        return enf;                
    }
    /**
     * Retorna la lista de 2 posiciones del objeto arrayCasillas
     * @return array de 2 posiciones
     */
    public Guardia[] getArrayCasilla(){
        return array;
    }
}
