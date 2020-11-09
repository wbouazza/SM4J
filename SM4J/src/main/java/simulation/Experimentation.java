package simulation;

import java.util.ArrayList;
import Simo.various.*;

public class Experimentation {

	// parameeters
	String scenarPath;
	String resultPath;
	ArrayList<Simulation> simualitons;
	ArrayList<String> scenarios;
	ArrayList<Integer> listAR;
	ArrayList<Integer> listSR;

	/**
	 * @param _type
	 */
	/**
	 * @param _param
	 */
	public Experimentation(ExpParam _param) {

	}

	public void start(ExpParam _param) {
		System.out.println("Experimentation start: " + _param.typeEXP);
		System.out.println("Input:" + _param.rootScenarios);
		System.out.println("Output:" + _param.rootResults);
//		scenarios = new ArrayList<String>();
		// loading SR rules examples
		listSR=Util.Int2AL(2);
		// loading scenarios
		scenarios=Util.csv2AL(_param.rootScenarios);
		System.out.println(scenarios.size() + " scenarios (CSV)");
		for (int i = 0; i < scenarios.size(); i++) {
			System.out.println(scenarios.get(i));
		}
		
		this.simualitons = new ArrayList<Simulation>();
		switch (_param.typeEXP) {
		case "BRC":
			// add a unique simulation
			this.simualitons.add(new Simulation("BRC",this));
			break;
		case "Label_1M":
			// repeat for each scenaro
			for (int i = 0; i < scenarios.size(); i++) {
				Simulation S = new Simulation(scenarios.get(i),listSR,this);
				S.scenarioPath = scenarios.get(i);
//				System.out.println(S.scenarioPath);
				this.simualitons.add(S);
			}

			for (int i = 0; i < simualitons.size(); i++) {
				simualitons.get(i).Start();
			}

			break;
		case "Dataset":
			// Java code
			;
		default:
			System.out.println("xxx Unknown typeEXP");
			;
		}
		System.out.println("Experimentation finished");
	}

}
