package es.ull.etsii.estrategias;

/**
 * Comportamiento Normal
 * @author Mauri
 *
 */
public class NormalBehaviour implements IBehaviour {

	public NormalBehaviour() {
		
	}

	/**
	 * Sobrecarga del comportamiento
	 */
	@Override
	public void moveCommand() {
		System.out.println("Quieto.");
	}

}
