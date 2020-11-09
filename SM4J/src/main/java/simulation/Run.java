package simulation;

/**
 * @author Simo
 *
 */
public class Run extends Thread {
	
	int id_run;
	Simulation simulation;
	/**
	 * @param _type
	 * @param _SR
	 * @param _path scenario
	 * @param _simulation
	 */
	public Run(String _type, Integer _SR,String _path, Simulation _simulation) {
		this.simulation= _simulation;
		System.out.println("run id#"+this.id_run);
		System.out.println("Evauating SR #"+_SR);
		System.out.println("On scenario #"+_path);
		// TODO Auto-generated constructor stub
	}

}
