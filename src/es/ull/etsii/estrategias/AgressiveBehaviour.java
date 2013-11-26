package es.ull.etsii.estrategias;

public class AgressiveBehaviour implements IBehaviour {

	public AgressiveBehaviour() {
		
	}

	@Override
	public void moveCommand() {
		System.out.println("Ataca.");
	}

}
