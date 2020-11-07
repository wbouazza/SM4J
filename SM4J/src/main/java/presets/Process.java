package presets;

import java.util.LinkedList;

public class Process {

	int nbFam;
	LinkedList<Integer> processings;
	LinkedList<Integer> setups;

	/** iniitiate homogenpous process
	 * @param _nbFam number of families
	 * @param _processing homgenous processing time 
	 * @param _setup  homgenous setup time
	 */
	Process(int _nbFam, int _processing, int _setup) {
		this.processings = new LinkedList<Integer>();
		this.setups= new LinkedList<Integer>();
		this.nbFam=_nbFam;
		for (int i = 0; i < _nbFam; i++) {
			this.processings.add(_processing);
			this.setups.add(_setup);
		}
	}
}
