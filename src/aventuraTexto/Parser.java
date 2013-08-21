package aventuraTexto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * Clase que parsea las ordenes introducidas por el usuario
 * @author LordManHammer
 *
 */
public class Parser {
	private OrdenesPalabras ordenes;
	
	
	/**
	 * Constructor de la clase Parser
	 */
	public Parser(){
		ordenes = new OrdenesPalabras(); 
	}
	
    public Orden getCommand(){
    	String entrada = "";
        String palabra1 = "";
        String palabra2 = "";

        System.out.print("> "); //Imprime el prompt

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            entrada = reader.readLine();
        }
        catch(java.io.IOException exc) {
        	System.out.println ("There was an error during reading: " + exc.getMessage());
        }

        StringTokenizer tokenizer = new StringTokenizer(entrada);

        if(tokenizer.hasMoreTokens()){
        	palabra1 = tokenizer.nextToken(); //Primera palabra
        }
        else{
        	palabra2 = null;
        }
        if(tokenizer.hasMoreTokens()){
        	palabra2 = tokenizer.nextToken();//Segunda palabra
        }
        else{
        	palabra2 = null;
        }
        
        //Se ignora el resto de palabras introducidas

        if(ordenes.esOrden(palabra1))
            return new Orden(palabra1, palabra2);
        else
            return new Orden(null, palabra2);
    }
    
    /**
     * Imprime una lista de las ordenes validas
     */
    public void getTodasOrdenes(){
    	ordenes.getOrdenes();
    }
}
