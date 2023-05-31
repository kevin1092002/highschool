//comments missing in main
//-2
//output message does not say if it is a palindrome
//-1

package Package;
import java.util.Scanner;

public class driverword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("what is the word");
		String n=input.nextLine();
		Word names=new Word(n);
		System.out.println(names.getName());
		System.out.println(names.palindrome());
		System.out.println("what is your char");
		char want=input.nextLine().charAt(0);
		System.out.println(names.numchar(want));
		System.out.println("what is the string to check");
		String anotherwords=input.nextLine();
		System.out.println(names.len(anotherwords));
	}

}
