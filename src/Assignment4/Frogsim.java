package Assignment4;

public class Frogsim {
	private int goal;
	private int maxHops;
	private int minidist;
	private int maxidist;
	public Frogsim(int dist, int hops,int mindist,int maxdist) {
		goal=dist;
		maxHops=hops;
		minidist=mindist;
		maxidist=maxdist;
	
}
		
	public int hopdistance() {
				int distance=(int)((Math.random()*(maxidist-minidist)+1)+minidist);
				return distance;
			}
	
	public boolean simulate() {
		int goaldist=0;
		for(int counter=0;counter<maxHops;counter++) {
		goaldist+=hopdistance();
		}
		if(goaldist>=goal) {
			return true;
		}else if(goaldist<0) {
		return false;
	}
		return false;
	}
	public double runSimulations(int num) {
			double run=0;
			for(int counter=0;counter<num;counter++) {
				if(simulate()) {
					run=run+1;
				}
	}
			return run/num;	
}
}