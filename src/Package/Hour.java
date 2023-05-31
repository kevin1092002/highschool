package Package;
//this is not a 12 hour clock
//12:60 is not a time
//-10

public class Hour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int hour=0; hour<24;hour++) {//this line looping for the hours
			for (int minute=-1;minute<60;) {//this line looping for the minutes
				minute=minute+1;//this line add one to the minute
				if(hour<=11) {
					if(minute<10) {//This line add the 0 into the minutes less than 10
					System.out.println(hour+":"+"0"+minute+"AM");
				}else {
					System.out.println(hour+":"+minute+"AM");
				}
				}else {
					if(minute<10) {
						System.out.println(hour+":"+"0"+minute+"PM");
					}else {
						System.out.println(hour+":"+minute+"PM");
					}
					
				}
			
		}
	}
}
}