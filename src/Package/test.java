package Package;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type the year");
		int year = input.nextInt();
		System.out.println("Type the month");
		int month =input.nextInt();
		System.out.println("Type the day");
		int day=input.nextInt();
		int newday=0;
		int newmonth=1;
		int newyear=0;
		if(day<=0 && day>31) {
			System.out.println("Please type in the valid day");
		}else {
			newday=day+1; //This generate the next day
		}if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) & (newday>31)) {
			newday=1;//This statement check that month that have 31 days. It reset after 31
		}else if((month==4 || month==6 || month==9 || month==11) & (newday>30)) {
			newday=1;//This statement check the month that have 30 days. It will reset day after 30
	    }else if((month==2) & ((newday>28) || ((year%4==0 & year%100>0 & year%400>0) &(newday>29)))) {
			newday=1;
	    }//This if statement check the second month and the leap year. They will reset day after 28 or 29
		if((month<=0) & (month>12)) {
			System.out.println("Please type in the valid month");// this is statement check the valid month
		}else{
			if((month==4||month==6||month==9||month==11) & day==31) {
			newmonth=month+1;// This if statement check the months that have 31 days
	       }else if((month==4||month==6||month==9||month==11) & (day==30)) {
	    	   newmonth=month+1;//This else statement check the months that have 30 days
	       }else if((month==2 & day==28)||(year%4==0 & year%100>0 & year%400>0 & month==2 & day==29)) {
	    	   newmonth=month+1; //This else statement check the second month. This also check leap year.   
           }else if(newday>1 & newday<31) {
        	   newmonth=month;
           }
			if(newmonth>12) {
				newmonth=1;
			}
		// the above code to check for the month
		if(year>=0) {
			if(month==12) {
				newyear=year+1;//This generate the next year
			}else {
				newyear=year;
			}
		}
		System.out.println(newyear);
		System.out.println(newmonth);
		System.out.println(newday);
}
}
}