package Assignment4;
import java.util.Scanner;

public class driverfrogsim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("input distance");
		int distance=input.nextInt();
		System.out.println("input hop");
		int hops=input.nextInt();
		System.out.println("input max");
		int max=input.nextInt();
		System.out.println("input min");
		int min=input.nextInt();
		System.out.println("input the number of run");
		int run=input.nextInt();
		Frogsim sim=new Frogsim(distance,hops,max,min);
		for(int x=0;x<hops;x++) {
			sim.hopdistance();
			System.out.println(sim.hopdistance());}
			System.out.println(sim.simulate());
		
		for(int z=0;z<run;z++) {
			for(int y=0;y<hops;y++) {
			sim.hopdistance();
			System.out.println(sim.hopdistance());
			}
			sim.simulate();
			System.out.println(sim.simulate());
}
		System.out.println(sim.runSimulations(run));
}
}
