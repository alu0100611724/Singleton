package es.ull.etsii.singleton;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import es.ull.etsii.contexto.Robot;
import es.ull.etsii.estrategias.AgressiveBehaviour;
import es.ull.etsii.estrategias.DefensiveBehaviour;
import es.ull.etsii.estrategias.NormalBehaviour;

/**
 * Clase que utiliza el patrón singleton para controlar un enjambre de robots desde diferentes planetas.
 * @author Mauri
 *
 */
public class World {
	
	private static World instance = new World();  //Con esta sentencia evitamos que se creen mas de un objeto World
	protected ArrayList<Robot> enjambre;
	protected String robotReina;  //robot que controla el enjambre
	
	private World() {
		enjambre = new ArrayList<Robot>();
		robotReina = "Megatron";
	}
	
	/**
	 * Metodo de creacion de instancia unica
	 * @return la instancia del metodo singleton
	 */
	public static World getWorld() {
		return instance;
	}

	/**
	 * Cambia el estado de los robot que forman el enjambre
	 */
	public void play () {
		
		for (int i=0; i<10; i++) {
		      
			switch(numAleatorio()) {
		      	case 0: Robot a = new Robot(new AgressiveBehaviour());
		      			enjambre.add(i, a);;
		      			break;
		      	case 1: Robot b = new Robot(new DefensiveBehaviour());
	 			 		enjambre.add(i, b);
	 			 		break;
		      	case 2: Robot c = new Robot(new NormalBehaviour());
	 			 		enjambre.add(i, c);
	 			 		break;
		      }  
			  ++i;
		      System.out.print("Robot "+ i + ": ");
		      --i;
		      enjambre.get(i).move();
		}
	}
	
	/**
	 * Acceso al enjambre de robots
	 * @return devuelve un array de robots
	 */
	public ArrayList<Robot> getEnjambre() {
		return enjambre;
	}

	public String getRobotReina() {
		return robotReina;
	}

	public void setRobotReina(String robotReina) {
		this.robotReina = robotReina;
	}
	
	/**
	 *  Calcula un numero aleatorio
	 * @return nuemro entre 0 y 2
	 */
	private int numAleatorio () {
		Calendar calendario = Calendar.getInstance();
		int semilla = calendario.hashCode();
		Random r = new Random();
	    r.setSeed(semilla);
		return (r.nextInt(3));
	}

}
