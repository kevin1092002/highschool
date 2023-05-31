package Assignment5;

import java.util.Arrays;
import java.util.Random;

public class Hangman {
	private String guessw;
	private char c;
	
	public Hangman(String guessword) {
		guessword="computer";
		guessw=guessword;
	}
	public String getwords() {
		return guessw;
	}
	public boolean check(char guessc) {
		c=guessc;
			if(guessw.indexOf(c)>=0) {
				return true;}
		return false;
	}
}