package shopfloor;

import java.util.LinkedList;

import process.MachineProcess;
import shopfloor.data_stat.MachineStats;

//enum presetMachine {
//	test1, test2
//}

public class Machine {

	// static information
	int id;
	int cell_ID;
	String name;
	String description;
	MachineStats Stats;
	Object waitingQ;

	// working configuration
	// public int[][] Rmat;
	public MachineProcess process;

	// dynamic information
	String state;

	public void sayMe(boolean machine_detail) {
		System.out.println("Machine_id=" + this.id + " named: " + this.name);
		if (machine_detail) {
		}
	}

	public Machine(int _id, String _name, int _nbFam, int _processing, int _setup) {
		this.id = _id;
		this.name = _name;
		this.process = new MachineProcess(_nbFam, _processing, _setup);
	}
	// working logs (statistics)

	// public Ord O;
	// public Ag_Ress_Ctx1 myAgent = this;
	// public int SPCompt;
	// public Ag_Simo_Ctx1 Home;
	// public int Brk_Duration = 0;
	// public int Last_IdxSP = 0;
	// public Ord O;
}
