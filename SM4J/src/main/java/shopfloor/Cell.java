package shopfloor;

import java.util.LinkedList;

import shopfloor.data_stat.CellStats;
import shopfloor.data_stat.MachineStats;

public class Cell {

	// static information
	int id;
	String name;
	String description;
	CellStats Stats;
	public Stock cellStock;
	
	// working configuration

	// dynamic information
	String state;

	// working logs (statistics)

	public LinkedList<Machine> machines;

	/**
	 * @param _id cell id
	 * @param _name cell name
	 */
	public Cell(int _id, String _name) {
		this.id=_id;
		this.name=_name;
		this.machines = new LinkedList<Machine>();
		
	}

	public Cell() {
		this.machines = new LinkedList<Machine>();
	}

	/**
	 * @param machine_detail
	 */
	public void sayMe(boolean machine_detail) {
		System.out.println("Cell_id=" + this.id + " named: " + this.name);
		System.out.println("Machines=" + this.machines.size());
		// if detailed description
		if (machine_detail)
			for (int i = 0; i < this.machines.size(); i++) {
				this.machines.get(i).sayMe(machine_detail);
			}
	}
}
