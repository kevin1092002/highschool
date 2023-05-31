package Package;


import java.util.Scanner;

public class Checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please type in the numbers");//ask for the number to check
		int x=input.nextInt();//input number
		int y=x;
		while(x>=1) {//make a loop that goes through every multiple of that number
			if(y%x==0) {//check if the number is multiple or not
				System.out.println(x);//print out the multiple of it
			}
		x--;	
		}
	}

}
