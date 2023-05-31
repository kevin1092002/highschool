package Lab1;
import java.util.Scanner;
public class converter {
	public String dbconverter(int n) {
		String bin="";//declare the binary
		if(n==0) {//condition for the recursive method to end
			return bin;//the dbconverter(0)(the first dbconverter)
		}else {
			if(n%2==1) {//this check if the decimal number input is divisible by to add 1 to the binary number
				bin=bin+"1";//add 1 to the String binary
			}else if(n%2==0) {//this check if the decimal number input is divisible by to add 0 to the binary number
				bin=bin+"0";//add 0 to the String binary
			}return dbconverter(n/2)+bin;//add binary to the last dbconverter
			
	}//this method convert decimal to binary using recursive
		
}
	public int bdconverter(String b,int p) {
		int dec=0;//declare the decimal number
		if(b.length()==0) {//the condition for the recursive method to end
			return dec;//the bdconverter("")(the first bdconverter)
		}else {
		if(b.charAt(0)=='1') {//check if there is 1 in the binary to add the power of2
			dec=(int)Math.pow(2,p);//add power of two to the decimal
			p++;//add 1 to the postion of the binary
		}else {//because there is no 1 so we skip it
			p++;//add 1 to the postion of binary
		}
		return bdconverter(b.substring(1,b.length()),p)+dec;//add up all results from the last bdconverter
		}
		//this method convert binary to decimal
}public String dhconverter(int num) {
	String hex="";//declare the hexadecimal
	if(num==0) {//condition for the recursive method to end
		return hex;//the dhconverter(0)(the first dhconverter)
	}else {
		if(num%16!=0) {//check if the number divisible by 16 to determine the number in the hex
			hex=hex+num%16;//add that number to the String hex
			if(num%16==10) {//check if divisible by 10 to add letter A to string hex
				hex="A";//add letter A to String hex
			}if(num%16==11) {//check if divisible by 11 to add letter b to string hex
				hex="B";//add letter b to String hex
			}if(num%16==12) {//check if divisible by 12 to add letter c to string hex
				hex="C";//add letter c to String hex
			}if(num%16==13) {//check if divisible by 13 to add letter d to string hex
				hex="D";//add letter d to String hex
			}if(num%16==14) {//check if divisible by 14 to add letter e to string hex
				hex="E";//add letter e to String hex
			}if(num%16==15) {//check if divisible by 15 to add letter f to string hex
				hex="F";//add letter f to String hex
			}
		}else if(num%16==0) {//because the number is divisible by 16 therefore add number 0 to String hex
			hex="0";//add 0 to String hex
		}
		return dbconverter(num/16)+hex;//build up our hexadecimal from all of the last method
	}
}//this method conver decimal to hexadecimal
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String rev="";//declare the reverse of binary number
		System.out.println("please input your binary number");
		String bin=input.nextLine();//input binary
		for(int i=bin.length()-1;i>=0;i--) {
			rev=rev+bin.charAt(i);//make the reverse of that binary
		}
			
		converter n=new converter();//make an object
		System.out.println(n.dbconverter(123456789));//use the method dbconverter method
		System.out.println(n.bdconverter(rev,0));//use the bdconverter method
		System.out.println(n.dhconverter(19));//use the dhconverter method
	}
}//main driver

