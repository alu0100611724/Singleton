package es.ull.etsii.main;

import es.ull.etsii.singleton.World;

/**
 * Clase principal
 * @author Mauri
 *
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nIntergalactic Robot Tournament\n\nLets the battle begin!\n");
		
		System.out.println("Planeta Cybertron");
		World cybertron = World.getWorld(); 
		System.out.println("Robot Lider: " + cybertron.getRobotReina());
		cybertron.setRobotReina("Optimus Prime");
		
		System.out.println("\nPlaneta Tierra:");
		World tierra = World.getWorld();
		System.out.println("Robot Lider: " + tierra.getRobotReina());
		
		System.out.println("\nTurno planeta Cybertron:");
		System.out.println("Robot Lider: " + cybertron.getRobotReina());
		cybertron.play();
		
		System.out.println("\nTurno planeta Tierra:");
		System.out.println("Robot Lider: " + tierra.getRobotReina());
		tierra.play();
		
		System.out.println("\nSiguiente turno planeta Cybertron:");
		cybertron.setRobotReina("Maximus");
		System.out.println("Robot Lider: " + cybertron.getRobotReina());
		cybertron.play();
	}

}
