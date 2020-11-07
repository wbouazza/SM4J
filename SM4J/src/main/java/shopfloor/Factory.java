package shopfloor;

import java.util.LinkedList;

import process.ManRange;
import shopfloor.data_stat.FactoryStats;
import shopfloor.data_stat.MachineStats;

public class Factory {

	// static information
	int id;
	String name;
	String description;
	int L;
	int R;
	FactoryStats Stats;
	// working configuration
	// dynamic information
	public LinkedList<Cell> cells;
	public LinkedList<ManRange> manRanges;
	public Stock rawStock;
	public Stock finalStock;

	// working logs (statistics)
	// nuull

	public Factory(int _id, String _name) {
		this.name = _name;
		this.id = _id;
		this.cells = new LinkedList<Cell>();
	}

	// function to initiate after cell's adding complete
	public void init() {
		this.L=0;
		this.R=0;
		for (int i = 0; i < this.cells.size(); i++) {
			this.L++;
			this.R+=this.cells.get(i).machines.size();
		}
	}

	// function to test using the console
	public void sayMe(boolean cell_detail, boolean machine_detail) {
		System.out.print("Factory id=" + this.id + " named: " + this.name);
		System.out.println("|L|= " + this.L+"cells with |R|= "+this.R+"resources");
		// if detailed description
		if (cell_detail)
			for (int i = 0; i < this.cells.size(); i++) {
				this.cells.get(i).sayMe(machine_detail);
			}
	}
}
