package Lab7;

import java.util.Scanner;

public class driverSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*System.out.println("please type in the length of array");//this line ask for the length of array
		int l=input.nextInt();//input the length
		int[]so=new int[l];//declare array
		for(int c=0;c<so.length;c++) {
		System.out.println("please type in the sound");//this line ask for the sound
		int s=input.nextInt();//input the sound
		so[c]=s;//make an array
		}*/
		int[] so= {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
		Sound v=new Sound(so);//declare object
		System.out.println(v.limitAmplitude(20));//use the compare limit method
		v.trimSilenceFromBeginning();//use the trim method
	}

}
