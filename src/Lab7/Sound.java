package Lab7;

import java.util.Arrays;

public class Sound {
private int[] samples;
public Sound(int[]s) {//make a constructor
	samples=s;
}
public int limitAmplitude(int limit) {//this  method will compare the amplitude with the limit and return the number of changes in that array
	if(limit<0) {
		limit=limit*-1;
	}
	int c=0;
	for(int counter=0;counter<samples.length;counter++) {//use for loop to go over the whole array
		if(samples[counter]>limit) {//check if the amplitude higher than limit
			samples[counter]=limit;//change  that value to limit
			c++;
		}else if(samples[counter]<-limit) {//check if the amplitude lower than negative limit
			samples[counter]=-limit;//change it to negative limit
			c++;//increase the number of changes
		}
	}return c;
}
public void trimSilenceFromBeginning() {//this method will change all the beginning 0 amplitude in the array
	int counter=0;
	int v=0;
	int c=samples.length;
	while(samples[counter]==0) {//use while loop to find the length for new array
		c--;
		counter++;
	}
	int[] s=new int[c];
		for(int count=0;count<samples.length;count++) {//checking and making new array
			if(samples[count]!=0) {
				for(int b=0;b<s.length;b++) {
					s[b]=samples[b+count];
				}
				break;
			}
	}
		System.out.println(Arrays.toString(s));//print out the new array
		
}
}
