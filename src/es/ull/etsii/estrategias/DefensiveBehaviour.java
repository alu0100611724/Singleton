package es.ull.etsii.estrategias;

public class DefensiveBehaviour implements IBehaviour {

	public DefensiveBehaviour() {
		
	}

	@Override
	public void moveCommand() {
		System.out.println("Defiende.");
	}

}
