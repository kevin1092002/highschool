package Lab3;

public class time {
public static String times(int n,int v, int t) {
	String g="";
	String g2="";
	String g3="";
	String g4="";
	String g5="";
	String g6="";
	String g7="";
	String g8="";
	String g9="";
	String g1="";
	if(n<=9&&n>=0&&v>=0&&v<=9&&t>=0&&t<=9) {//check the range
	if((n!=v&&v!=t&&n!=t)) {//check all the integer is different
			if((n<2||t<2||v<2)&&(n<6&&t<6&&v<6)) {//check the time if all integer input is less than 6
				if(n==1||t==1||v==1) {//build up the time
					if(n>v&&v>t) {
			g="the time is"+n+":"+v+t;
			g2="the time is"+v+t+":"+n+t;
			g3="the time is"+n+":"+t+n  ;
			g4="the time is"+v+t+":"+t+v;
			g5="the time is"+v+":"+t+n;
			g6="the time is"+v+":"+n+t;
					}if(n>t&&v<t) {
						g="the time is"+n+":"+v+t;
						g2="the time is"+t+v+":"+v+n;
						g3="the time is"+n+":"+t+v;
						g4="the time is"+t+v+":"+n+v;
						g5="the time is"+t+":"+v+n;
						g6="the time is"+t+":"+n+v;
					}
			if(n<v&&v<t) {
				g="the time is"+t+":"+v+n;
				g2="the time is"+t+":"+n+v;
				g3="the time is"+v+n+":"+t+n;
				g4="the time is"+v+n+":"+n+t;
				g5="the time is"+v+":"+t+n;
				g6="the time is"+v+":"+n+t;
		}
			if(n>v&&n<t) {
				g="the time is"+t+":"+v+n;
				g2="the time is"+t+":"+n+v;
				g3="the time is"+n+v+":"+t+v;
				g4="the time is"+n+v+":"+v+t;
				g5="the time is"+n+":"+t+v;
				g6="the time is"+n+":"+v+t;
			}
				if(v>n&&t>n) {
						g="the time is"+t+":"+v+n;
						g2="the time is"+t+":"+n+v;
						g3="the time is"+t+n+":"+v+n;
						g4="the time is"+t+n+":"+n+v;
						g5="the time is"+v+":"+t+n;
						g6="the time is"+v+":"+n+t;
					
			
		}if(v>n&&t<n) {
			g="the time is"+n+":"+v+t;
			g2="the time is"+n+":"+t+v;
			g3="the time is"+n+t+":"+v+t;
			g4="the time is"+n+t+":"+t+v;
			g5="the time is"+v+":"+t+n;
			g6="the time is"+v+":"+n+t;
		

}
		if(n==2||v==2||t==2) {
			if(n>t&&v<t) {
				g7="the time is"+t+n+":"+n+v;
				g8="the time is"+t+n+":"+t+v;
				g9="the time is"+t+n+":"+v+t;
				g1="the time is"+t+n+":"+v+n;
			}if(n>t&&v>t) {
				g7="the time is"+v+n+":"+n+t;
				g8="the time is"+v+n+":"+v+t;
				g9="the time is"+v+n+":"+t+v;
				g1="the time is"+v+n+":"+t+n;
			}
			if(n<t&&v<n) {
				g7="the time is"+n+t+":"+n+v;
				g8="the time is"+n+t+":"+t+v;
				g9="the time is"+n+t+":"+v+t;
				g1="the time is"+n+t+":"+v+n;
			}if(n<t&&v>n) {
				g7="the time is"+v+t+":"+v+n;
				g8="the time is"+v+t+":"+t+n;
				g9="the time is"+v+t+":"+n+t;
				g1="the time is"+v+t+":"+n+v;
			}if(n>t&&v>n) {
				g7="the time is"+n+v+":"+n+t;
				g8="the time is"+n+v+":"+v+t;
				g9="the time is"+n+v+":"+t+v;
				g1="the time is"+n+v+":"+t+n;
			}
			if(n<t&&v>t) {
				g7="the time is"+t+v+":"+v+n;
				g8="the time is"+t+v+":"+t+n;
				g9="the time is"+t+v+":"+n+t;
				g1="the time is"+t+v+":"+n+v;
			}
		}
	}
}
				if(n>=6&&t>=6&&v>=6) {//check if the input is all larger than 5
					g="Invalid time";//can make the time
				}
				if(n<2||t<2||v<2) {//check there is an input less than 6
					if(n>=6&&(t<6||v<6)) {
						if(t<6&&v<6) {//build up the time all the time if there is only on int larger than 6
						g="the time is"+n+":"+v+t;
						g2="the time is"+n+":"+t+v;
						g3="the time is"+v+":"+t+n;
						g4="the time is"+t+":"+v+n;
						}
						else if(t>=6||v>=6) {//build up the time if there are two integers larger than 5
							if(t>=6) {
							g="the time is"+n+":"+v+t;}
							if(v>=6) {
								g="the time is"+n+":"+t+v;}
						}
					}if(t>=6&&(n<6||v<6)) {
						if(n<6&&v<6) {
						g="the time is"+t+":"+v+n;
						g2="the time is"+t+":"+n+v;
						g3="the time is"+n+":"+v+t;
						g4="the time is"+v+":"+n+t;
						}
						else if(v>=6||n>=6) {
							if(v>=6) {
							g="the time is"+t+":"+n+v;}
							if(n>=6) {
								g="the time is"+t+":"+v+n;}
						}
					}if(v>=6&&(n<6||t<6)) {
						
						if(t<6&&n<6) {
						g="the time is"+v+":"+t+n;
						g2="the time is"+v+":"+n+t;
						g3="the time is"+n+":"+t+v;
						g4="the time is"+t+":"+n+v;
						}
						else if(t>=6||n>=6) {
							if(t>=6) {
							g="the time is"+v+":"+n+t;}
							if(n>=6) {
								g="the time is"+v+":"+t+n;}
						}
					}
	}
	}
	if(n==t&&t==v) {//check for all int is the same
		if(n>5) {//can't build because all of them is larger than 5
			g="Invalid time";
		}else if(n<6){//check if they are all smaller than 6
			if(n!=1&&n!=0) {//build the time if they are not all 1
			g="the time is"+n+":"+v+t;
		}else if(n==0) {//if they are 0 can't build the time
			g="invalid time";
		}else if(n==1) {//if they are 1 so there are two output
			g="the time is"+n+":"+v+t;
			g2="the time is"+n+n+":"+n+n;
		}
	}
	}
	return g +" "+ g2+" " +" "+ g3+" " + g4+" " + g5+" " + g6+" "+g7+" "+ g8+" "+ g9+" " +g1;//return all possible out come
	}
	else if((n>9||n<0)&&(v<0||v>9)&&(t<0||t>9)) {//they are not in range so can't build
		System.out.println("please input valid number");
		return g;
	}
return g;
}
public static void main(String[] args) {//driver
	// TODO Auto-generated method stub
	System.out.println(times(4,5,6));
}
}
