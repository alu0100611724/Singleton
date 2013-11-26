package es.ull.etsii.main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nRobot Battle Tournament\n\nLets the battle begin:");
		World cybertron = new World();
		
		for (int i=0; i<3; i++) {
			System.out.println("\nSiguiente turno:");
			cybertron.play();
		}
	}

}
