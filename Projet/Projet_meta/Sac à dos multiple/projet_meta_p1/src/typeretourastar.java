
import java.util.ArrayList;

public class typeretourastar {
	public typeretourastar(long duration, int nbrn2, int prof2,ArrayList<ArrayList<objet>> sol2, int solcourante) {
		this.duree=duration;
		this.nbrn=nbrn2;
		this.prof=prof2;
		this.sol=sol2;
		this.valtot=solcourante;
	}
	protected long  duree;
	protected int nbrn;
	protected int prof;
	protected ArrayList<ArrayList<objet>> sol ;
	protected int valtot;

}
