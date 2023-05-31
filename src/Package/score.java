package Package;
//inputs are not taken correctly
//outputs do not match the expected outputs
//-5
import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int count=0;
		double scores=0;
		Scanner input = new Scanner(System.in);
		for(int y=1;y!=-1;) {
			System.out.println("please type in the scores");//this line ask for the score
			int score=input.nextInt();//input the scores
			total=total+score;//make a total
			count=count+1;//count the number
			y=input.nextInt();//check when the user types -1 in will break the code
		}
		scores=(double)total/count;// calculate the average
		if(scores<=59) {
			System.out.println("F");
		}if(scores>=60 && scores<=69) {
			System.out.println("D");
		}if(scores>=70 && scores<=79) {
			System.out.println("C");
		}if(scores>=80 && scores<=89) {
			System.out.println("B");
		}if(scores>=90 && scores<=100) {
			System.out.println("A");
		}
	}//these line check and print out the letter score

}
