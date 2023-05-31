package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class driverhangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		String guessw="";
		int n=0;
		int e=6;
		int b=0;
			Hangman h=new Hangman(null);
			guessw=h.getwords();
			char[] guesswords=new char[guessw.length()];	
			char[] testg=new char[guessw.length()];
			for(int x=0;x<guessw.length();x++) {
				guesswords[x]='_';
			}
			 System.out.println(Arrays.toString(guesswords));
			for(int x=0;x<h.getwords().length();x++) {
			System.out.println("Enter the guess word");
				char guess=c.nextLine().charAt(0);
				for(int y=0;y<guessw.length();y++) {
					if(h.check(guess)==true) {
							guesswords[guessw.indexOf(guess)]=guess;
							testg[guessw.indexOf(guess)]=guess;
						}
						else if(h.check(guess)==false) {
							if(guesswords[y]!=testg[y]) {
							guesswords[y]='_';
						}
				}
				}
				System.out.println(Arrays.toString(guesswords));
				if(h.check(guess)==false) {
					e--;
				}
				else if(h.check(guess)==true) {
					b++;
				}
				if(e==0) {
					System.out.println("game over");
					System.out.println(guessw);
					break;
				}else if(b==guessw.length()) {
					System.out.println("won");
					break;
				}
			}
}
}
