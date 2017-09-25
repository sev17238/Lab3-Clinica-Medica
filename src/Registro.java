/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;

public class Registro{	
	private ArrayList<Guardia> medicosenfermeras;

	public Registro(){
		medicosenfermeras = new ArrayList<Guardia>();
	}

	public ArrayList<Guardia> getMedicoEnfermera(){
		return medicosenfermeras;
	}
        /**
         * Metodo que agrega un nuevo medico a la lista de guardias que contiene tanto medicos como enfermeras
         * de la clinica.
         * @param nombre del medico
         * @param nit del medico
         * @param dpi del medico
         * @param salario del medico
         * @param colegiado del medico
         * @param especialista true o false si lo es o no.
         */
        public void agregarMedico(String nombre, String nit, int dpi,double salario, int colegiado, boolean especialista){
            Medico med = new Medico();
            med.setMedico(nombre, nit, dpi, salario,colegiado, especialista);
            medicosenfermeras.add(med);
        }
        /**
         * Metodo que agrega una nuevo enfermera a la lista de guardias que contiene tanto medicos como enfermeras
         * de la clinica.
         * @param nombre de la enfermera
         * @param nit de la enfermera
         * @param dpi de la enfermera
         * @param salario de la enfermera
         * @param anos de experiencia de la enfermera
         * @param intensivista true o false si lo es o no.
         */
        public void agregarEnfermera(String nombre, String nit, int dpi,double salario, int anos, boolean intensivista){
            Enfermera enf = new Enfermera();
            enf.setEnfermera(nombre, nit, dpi,salario, anos, intensivista);
            medicosenfermeras.add(enf);
        }
        /**
         * Metodo que busca un medico en la lista de enfermeras y medicos, para retornar el objeto si se
         * encuentra en la lista, de lo contraria se retorna null.
         * @param dpi el dpi del medico que se quiere buscar
         * @return objeto de tipo Guardia con instanciado Medico
         */
	public Guardia buscarMedico(int dpi){
                Guardia med = new Guardia();
		for (int i = 0;i<medicosenfermeras.size();i++) {
                    med = medicosenfermeras.get(i);
                    if((dpi == med.getDpi())&&(med instanceof Medico)){
			return med; 
                    }
		}
            return med;                
	}
        /**
         * Metodo que busca un medico en la lista de enfermeras y medicos, para retornar un boolean si el objeto
         * buscado esta o no en la lista.
         * @param dpi el dpi del medico que se quiere buscar
         * @return 
         */
        public boolean buscarMedico2(int dpi){
                Guardia med = new Guardia();
                boolean esta = false;
		for (int i = 0;i<medicosenfermeras.size();i++) {
                    med = medicosenfermeras.get(i);
                    if((dpi == med.getDpi())&&(med instanceof Medico)){
			esta = true;
                        return esta;
        	    }
		}
                return esta;
	}
        /**
         * Metodo que crea una lista temporal solo con los medicos de la lista de guardias para luego
         * retornar aleatoriamente uno de esos medicos en dicha lista temporal.
         * @return un medico
         */
	public Guardia buscarMedicoR(){
            ArrayList<Guardia> temp = new ArrayList<Guardia>();
            Guardia med = new Guardia();		
            for (int i=0;i<medicosenfermeras.size();i++) {                    
                med = medicosenfermeras.get(i);                    
                if(med instanceof Medico){			
                    temp.add(med);
                }		
            }
            Random ran = new Random();
            int aleatorio = (int)(ran.nextInt(temp.size())); //sera un numero aleatorio de una unidad menor al largo de la lista.
            med = temp.get(aleatorio);  
            return med;                
	}
        /**
         * Metodo que busca una enfermera en la lista de enfermeras y medicos, para retornar el objeto si se
         * encuentra en la lista, de lo contraria se retorna null.
         * @param dpi el dpi de la enfermera
         * @return objeto de tipo Guardia con instanciado Enfermera
         */
	public Guardia buscarEnfermera(int dpi){
                Guardia enf = new Guardia();
		for (int i = 0;i<medicosenfermeras.size();i++) {
                    enf = medicosenfermeras.get(i);
                    if((dpi == enf.getDpi())&&(enf instanceof Enfermera)){
			return enf; 
                    }
		}
            return enf;                
	}
        /**
         * ESte metodo retorna una enfermera por nit
         * @param nit este parametro es el nit String
         * @return objeto tipo enfermera
         */
        public Guardia buscarEnfermeraNIT(String nit){
                Guardia enf = new Guardia();
		for (int i = 0;i<medicosenfermeras.size();i++) {
                    enf = medicosenfermeras.get(i);
                    if((nit == enf.getNit())&&(enf instanceof Enfermera)){
			return enf; 
                    }
		}
            return enf;                
	}
        /**
         * ESte metodo retorna un medico por nit
         * @param nit este parametro es el nit String
         * @return objeto tipo Medico o tipo Guardia
         */
        public Guardia buscarMedicoNIT(String nit){
                Guardia enf = new Guardia();
		for (int i = 0;i<medicosenfermeras.size();i++) {
                    enf = medicosenfermeras.get(i);
                    if((nit == enf.getNit())&&(enf instanceof Medico)){
			return enf; 
                    }
		}
            return enf;                
	}
        /**
         * Metodo que busca una enfermera en la lista de enfermeras y medicos, para retornar un boolean si el objeto
         * buscado esta o no en la lista.
         * @param dpi el dpi del medico que se quiere buscar
         * @return 
         */
        public boolean buscarEnfermera2(int dpi){
                Guardia enf = new Guardia();
                boolean esta = false;
		for (int i = 0;i<medicosenfermeras.size();i++) {
                    enf = medicosenfermeras.get(i);
                    if((dpi == enf.getDpi())&&(enf instanceof Enfermera)){
			esta = true;
                        return esta;
        	    }
		}
                return esta;
	}
        /**
         * Metodo que crea una lista temporal solo con las enfermeras de la lista de guardias para luego
         * retornar aleatoriamente una de esas enfermeras en dicha lista temporal.
         * @return una enfermera
         */
	public Guardia buscarEnfermeraR(){
            ArrayList<Guardia> temp = new ArrayList<Guardia>();
            Guardia enf = new Guardia();		
            for (int i=0;i<medicosenfermeras.size();i++) {                    
                enf = medicosenfermeras.get(i);                    
                if(enf instanceof Enfermera){			
                    temp.add(enf);
                }		
            }
            Random ran = new Random();
            int aleatorio = (int)(ran.nextInt(temp.size()));
            enf = temp.get(aleatorio);  
            return enf;                
	}
        /**
         * ESte metodo crea una lista de DPI de enfemeras intensivistas
         * @return DPIEnfemeras es un vector de String que tiene los DPI de las enfemeras
         */
        public String[] ListarDPIEnfermeras(){
            int cantidad=0;
            Guardia s;
            for (int i = 0; i < medicosenfermeras.size(); i++) {
                s= medicosenfermeras.get(i);
                if ((s instanceof Enfermera)&&((Enfermera)s).getIntensivista()==true) {
                    cantidad++;
                }
            }
            String[] DPIEnfermeras= new String[cantidad];
            Guardia t;
            int m=0;
            for (int i = 0; i < medicosenfermeras.size(); i++) {
                t=medicosenfermeras.get(i);
                if ((t instanceof Enfermera)&&((Enfermera)t).getIntensivista()==true) {
                    DPIEnfermeras[m]=t.getNit();
                    m++;
                }
            }
            
            return DPIEnfermeras;
        }
        /**
         * ESte metodo crea una lista des los DPI de todas las enfermeras de la clinica, sean intensivistas
         * o no.
         * @return DPIEnfemeras es un vector de String que tiene los DPI de las enfemeras
         */
        public String[] ListarDPIEnfermerasTodas(){
            int cantidad=0;
            Guardia enf;
            for (int i = 0; i < medicosenfermeras.size(); i++) {
                enf= medicosenfermeras.get(i);
                if (enf instanceof Enfermera) {
                    cantidad++;
                }
            }
            String[] DPIEnfermeras= new String[cantidad];
            Guardia enfmed;
            int m=0;
            for (int i = 0; i < medicosenfermeras.size(); i++) {
                enfmed=medicosenfermeras.get(i);
                if ((enfmed instanceof Enfermera)) {
                    DPIEnfermeras[m]=enfmed.getNit();
                    m++;
                }
            }            
            return DPIEnfermeras;
        }
        
        /**
         * ESte metodo crea una lista de DPI de medicos especialistas
         * @return DPIEnfemeras es un vector de String que tiene los DPI de los medicos
         */
        public String[] ListarDPIMedicos(){
            int cantidad=0;
            Guardia s;
            for (int i = 0; i < medicosenfermeras.size(); i++) {
                s= medicosenfermeras.get(i);
                if ((s instanceof Medico)&&((Medico)s).getEspecialista()==true) {
                    cantidad++;
                }
            }
            
            String[] DPIMedicos= new String[cantidad];
            Guardia t;
            int m=0;
            for (int i = 0; i < medicosenfermeras.size(); i++) {
                t=medicosenfermeras.get(i);
                if ((t instanceof Medico)&&((Medico)t).getEspecialista()==true) {
                    DPIMedicos[m]=t.getNit();
                    m++;
                }
            }
            
            return DPIMedicos;
        }
        /**
         * Metodo que verifica si la enfermera con nit n es intensivista o no.
         * @param nit
         * @return 
         */
        public boolean VerificarIntensivista(String nit){
            Guardia enf = new Guardia();
		for (int i = 0;i<medicosenfermeras.size();i++) {
                    enf = medicosenfermeras.get(i);
                    if((nit.equals(enf.getNit()))&&(enf instanceof Enfermera)&&((Enfermera)enf).getIntensivista()==true){
			return true; 
                    }
		}
            return false;
        }
  
    

}