package Assignment4;
import java.util.Scanner;
public class drivermail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.println("please enter your gmail");
		String gmails=n.nextLine();
		gmail mail=new gmail(gmails);
		System.out.println("your username is:"+mail.username());
		System.out.println("your server is :"+mail.server());
		System.out.println("your domain is:"+mail.domain());
	}

}
