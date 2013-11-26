package es.ull.etsii.contexto;

import es.ull.etsii.estrategias.AgressiveBehaviour;
import es.ull.etsii.estrategias.IBehaviour;

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
