package shopfloor;

public class Machine {

	// static information
	int id;
	int cell_ID;
	String name;
	String description;

	// working configuration
	public int[][] Rmat;

	// dynamic information
	String state;

	public void sayMe(boolean machine_detail) {
		System.out.println("Machine_id=" + this.id + " named: " + this.name);
		if (machine_detail) {
		}
	}

	public Machine(int _id, String _name) {
		this.id = _id;
		this.name=_name;
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
