package aventuraTexto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Habitacion {
	private String descripcion;
	private HashMap salidas;
	
	/**
	 * Construye una nueva habitaci�n con una descripcion, inicialmente no tiene salidas
	 * @param descripcion
	 */
	public Habitacion(String descripcion){
		this.descripcion = descripcion;
		salidas = new HashMap();
	}
	
	/**
	 * Define las salidas de la habitaci�n, si es null no hay salida
	 * Si no es null conduce a otra habitaci�n
	 * @param norte
	 * @param sur
	 * @param este
	 * @param oeste
	 */
	public void setSalidas(Habitacion norte, Habitacion sur, Habitacion este, Habitacion oeste){
		if(norte != null)
            salidas.put("norte",norte);
        if(sur != null)
            salidas.put("sur", sur);
        if(este != null)
            salidas.put("este", este);
        if(oeste != null)
            salidas.put("oeste", oeste);
	}
	
	/**
	 * Retorna la version corta de la descripci�n
	 * @return
	 */
	public String getDescripcionCorta(){
		return descripcion;
	}
	
	/**
	 * Retorna la descripci�n larga
	 * @return
	 */
	public String getDescripcionLarga(){
		return "Estas en " + descripcion + getSalidas();
	}

	/**
	 * Retorna una cadena con las salidas de la habitaci�n
	 * @return
	 */
	private String getSalidas() {
		String aux = "Salidas:";
		Set keys = salidas.keySet();
		for(Iterator iter = keys.iterator(); iter.hasNext(); )
			aux += " " + iter.next();
		return aux;
	}
	
	/**
	 * Retorna la habitaci�n que hay en esa direccion, si no la hay retorna null
	 * @param direccion
	 * @return
	 */
	public Habitacion getSiguienteHabitacion(String direccion){
		return (Habitacion)salidas.get(direccion);
	}
}
