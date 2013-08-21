package aventuraTexto;

/**
 * Clase Principal del Juego
 * @author LordManHammer
 *
 */
public class Juego {
	Parser parser;
	Habitacion habitacionActual;
	
	public Juego(){
		creaHabitaciones();
		parser = new Parser();
	}

	/**
	 * Crea e inicializa las habitaciones
	 */
	private void creaHabitaciones() {
		Habitacion norte, sur, este, oeste;
		norte = new Habitacion("Habitación del Norte");
		sur = new Habitacion("Habitación del Sur");
		este = new Habitacion("Habitacion del Este");
		oeste = new Habitacion("Habitación del Oeste");
		
		norte.setSalidas(null, sur, este, oeste);
		sur.setSalidas(norte, null, este, oeste);
		este.setSalidas(norte, sur,null, oeste);
		oeste.setSalidas(norte, sur, este, null);
		
		habitacionActual = norte;
	}
	
	
}
