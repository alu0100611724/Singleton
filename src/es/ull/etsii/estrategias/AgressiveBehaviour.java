package es.ull.etsii.estrategias;

/**
 * Comportamiento Agresivo.
 * @author Mauri
 *
 */
public class AgressiveBehaviour implements IBehaviour {

	public AgressiveBehaviour() {
		
	}

	/**
	 * Sobrecarga del comportamiento
	 */
	@Override
	public void moveCommand() {
		System.out.println("Ataca.");
	}

}
