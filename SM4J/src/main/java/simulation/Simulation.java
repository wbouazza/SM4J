package simulation;

import java.util.ArrayList;

public class Simulation {

	int id_simulation;
	ArrayList<Run> runs;
	public String scenarioPath;
	Experimentation experimentation;
	ArrayList<Integer> listSR;

	public Simulation(String _type, Experimentation _experimentation) {
		this.experimentation = _experimentation;
		runs = new ArrayList<Run>();
		switch (_type) {
		case "BRC":
			runs.add(new Run(_type, id_simulation, _type, this));
			break;
		case "Dataset":
			// Java codex
			;
		default:
			// Java code
			;
		}
	}

	// "Label_1M"
	/**
	 * @param _path
	 * @param _listSR
	 * @param _experimentation
	 */
	public Simulation(String _path, ArrayList<Integer> _listSR, Experimentation _experimentation) {
		listSR = new ArrayList<Integer>();
		runs = new ArrayList<Run>();
		listSR.addAll(_listSR);
//		System.out.println();
		for (int i = 0; i < listSR.size(); i++) {
			Run r = new Run("Label_1M", listSR.get(i), this.scenarioPath, this);
			r.id_run = (id_simulation + 1) * i;
			runs.add(r);
			// System.out.println(r.id_run +" added");
		}

	}

	public void Start() {
		// System.out.println("ici dans simu runs.size()="+ runs.size());
		for (int i = 0; i < runs.size(); i++) {
			runs.get(i).start();
			// runs.get(i).run();
		}
	}
}
