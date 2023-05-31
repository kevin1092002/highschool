package Assignment5;
import java.util.Scanner;
public class driverhouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the street");
		String street=input.nextLine();
		System.out.println("please enter the district");
		String district=input.nextLine();
		System.out.println("please enter the ward");
		String ward=input.nextLine();
		System.out.println("please enter the number of houses are there");
		int hounum=input.nextInt();//Input all the district, ward,street and numb address
		if(district.length()<2)
			district="0"+district;
		if(ward.length()<2)
			ward="0"+ward;//make the ward and district become two digit variables
		House h=new House(district,ward,street);
		System.out.println(h.checkhouse(24));//output the part a
		for(int count=0;count<hounum;count++) {
			System.out.println("please input the number of address");
			int addnum=input.nextInt();
			h.checkhouse(addnum);
			System.out.println(h.printhouse(hounum));//output part b
		}
		
	}

}
