package aventuraTexto;

public class OrdenesPalabras {
	//Ordenes validas
	private static final String ordenesValidas[] = {"ir", "salir", "ayuda"};

	/**
	 * Constructor por defecto
	 */
	public OrdenesPalabras(){

	}

	/**
	 * Retorna cierto si la orden es valida
	 * @param orden
	 * @return
	 */
	public boolean esOrden(String orden){
		for(int i = 0; i < ordenesValidas.length; i++){
			if(ordenesValidas[i].compareToIgnoreCase(orden) == 0){
				return true;
			}
		}
		return false;
	}

	/**
	 * Imprime todas las ordenes validas del juego
	 */
	public void getOrdenes(){
		for(int i = 0; i < ordenesValidas.length; i++){
			System.out.print(ordenesValidas[i] + "  ");
		}
		System.out.println();
	}
}
