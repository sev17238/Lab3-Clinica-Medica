/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SDiego
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
    public Guardia MedicoCasilla(int dpi){
            Guardia med = new Guardia();
	for (int i = 0;i<array.length;i++) {
            med = array[i];
            if(med instanceof Medico){
        	return med; 
            }
	}
        return med;                
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
        
    public Guardia[] getArrayCasilla(){
        return array;
    }
    
    
}
