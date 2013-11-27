package es.ull.etsii.contexto;

import es.ull.etsii.estrategias.AgressiveBehaviour;
import es.ull.etsii.estrategias.IBehaviour;

/**
 * Clase que cambia su comportamiento.
 * @author Mauri
 *
 */
public class Robot {

	private IBehaviour strategy;
	
	public Robot() {
		strategy = new AgressiveBehaviour();
	}
	
	public Robot(IBehaviour b) {
		strategy = b;
	}
	
	public void move() {
		strategy.moveCommand();
	}

}
