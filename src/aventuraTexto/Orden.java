package aventuraTexto;

public class Orden {
	private String orden;
    private String segundaPalabra;
    
    
    /**
     * Constructor de la clase Orden
     * @param orden
     * @param segundaPalabra
     */
    public Orden(String orden, String segundaPalabra){
    	this.orden = orden;
    	this.segundaPalabra = segundaPalabra;
    }
    
    /**
     * Retorna la Orden
     * @return
     */
    public String getOrden(){
    	return orden;
    }
    
    /**
     * Retorna la segunda palabra
     * @return
     */
    public String getSegundaPalabra(){
    	return segundaPalabra;
    }
    
    /**
     * Retorna cierto si la orden es desconocida
     * @return
     */
    public boolean esDesconocido(){
    	return (orden == null);
    }
    
    /**
     * Retorna cierto si hay una segunda palabra
     * @return
     */
    public boolean haySegundaPalabra(){
    	return (segundaPalabra != null);
    }
}
