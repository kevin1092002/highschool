package hailstone;

public class hailstone {
	public hailstone() {
	}
public int hailstoneLength(int n) {//the method check for the length of the sequence
	int length=0;
	if(n==0) {
		System.out.println("enter the number larger than 0");
		return 0;
	}
	while(n!=1) {//loop until the n number =1
	if(n%2==0) {//if it is even number
		length++;
		n=n/2;//divide it by 2
	}
	else if(n%2!=0) {//if it is odd number
		length++;
		n=3*n+1;//multiply it by 3 and then +1 to get the number in sequence
	}
	if(n==1) {
		length++;
	}
	}
	return length;//return the length of the sequence
}
public  boolean isLongSeq(int n) {//this method check if the sequence is long
	if(n==0) {
		System.out.println("enter the number larger than 0");
		return false;
	}if(n>=hailstoneLength(n)) {//if the n number is larger than the length of the sequence
		return false;//it is not the long sequence
	}
		return true;//it is the long sequence
}
public  double propLong(int n) {//the method will find the proportion of long sequence to short sequence
	int c=0;
	if(n==0) {
		System.out.println("enter the number larger than 0");
		return 0;
	}
	for(int counter=1;counter<=n;counter++) {//loop through the sequence from 1 to n 
		if(isLongSeq(counter)==true) {//if it is a long sequence
			c++;//increment counter
			System.out.println(c);
		}
	}
	
	return (double)c/n;//the proportion
}
public static void main(String[] args) {//
	// TODO Auto-generated method stub
	hailstone v=new hailstone();
	System.out.println(v.hailstoneLength(8));
	System.out.println(v.isLongSeq(5));
	System.out.println(v.isLongSeq(8));
	System.out.println(v.propLong(10));
}
}
