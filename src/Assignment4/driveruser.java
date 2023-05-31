package Assignment4;
import java.util.Scanner;

public class driveruser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("input the names");
		String name=input.nextLine();
		System.out.println("input the years");
		int year=input.nextInt();
		Username n=new Username(name,year);
		System.out.println(n.user());
		System.out.println(n.pass());
	}

}
