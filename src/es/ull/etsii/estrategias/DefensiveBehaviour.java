package es.ull.etsii.estrategias;

/**
 * Comportamiento defensivo
 * @author Mauri
 *
 */
public class DefensiveBehaviour implements IBehaviour {

	public DefensiveBehaviour() {
		
	}

	/**
	 * Sobrecarga del comportamiento
	 */
	@Override
	public void moveCommand() {
		System.out.println("Defiende.");
	}

}
