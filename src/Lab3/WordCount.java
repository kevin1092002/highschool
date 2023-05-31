package Lab3;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {//make a constructor
	private String wo;
	private int co;
	public WordCount(String w,int c) {
		wo=w;
		co=c;
	}
	public static int countWord(ArrayList<String> v) {//total words
	return v.size();
	}
	public static int checkCount(String e, ArrayList<String> t) {//count the most popular word
		e.toLowerCase();
		e=e.replaceAll("^[a-z]A-Z", "");
		int b=0;
		for(int count=0; count<t.size();count++) {
			if(t.get(count).equals(e)) {
				b++;
			}
		}
		return b;
	}
	public String u(){
		return wo+co;
	}
	
		
	
	public static void main(String[] args) throws FileNotFoundException {//driver
		// TODO Auto-generated method stub
		ArrayList<WordCount>n=new ArrayList<WordCount>();//declare a final array list consist of the word and it's appear
		ArrayList<String>v=new ArrayList<String>();
		ArrayList<String>o=new ArrayList<String>();
		ArrayList<String>b=new ArrayList<String>();//declare a String array list
		File file=new File("C:\\Users\\drogers\\Desktop\\hp.txt");//import a txt file
		Scanner doc= new Scanner(file);
		
		int y=0;
		while(doc.hasNextLine()) {//input all the words in the txt to an ArrayList
			b.add(doc.nextLine().toLowerCase().replaceAll("^[a-z]A-Z", ""));
		}
		for(int counts=0;counts<b.size();counts++) {//loop through to find duplicate
			y=checkCount(b.get(counts),b);
			n.add(new WordCount(b.get(counts),y));
		}
		for(int count=0;count<n.size();count++) {//add to the string list
			o.add(n.get(count).u());
		}
		for(String m:o) {//remove duplicates
			if(!v.contains(m)) {
				v.add(m);
			}
		}
		
		
		for(int count=0;count<v.size();count++) {
		System.out.println(v.get(count));
		}
		System.out.println("the total word :" +b.size());//print out the toal word
	}
}
