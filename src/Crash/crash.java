package Crash;

import java.util.Scanner;

public class crash {

static char find(String set) {//this method will find the most common letter in the sentence
set = set.replaceAll(" ", "");
char i=set.charAt(0);
int count=1;
int n=0;
for(int y=0	;y<set.length();y++) {
	count=1;
	for(int x=y+1;x<set.length();x++) {
	if(set.charAt(y)==set.charAt(x)) {
		count++;
	}
	if(count>n) {
		i=set.charAt(y);
		n=count;
	}
}
}
return i;
}
public  static String upper(String sent) {//this method will make all the letters to upper case
return sent.toUpperCase();
}

public static String mix(String word1, String word2) {//this will mix the letter together
return word1.substring(0, word1.length()) + word2.substring(0,word2.length());
}

public static int countWords(String str)//this method will count the words in the sentence
{
int count = 1;
if("".equals(str.substring(0))) {
	System.out.println("enter a word please");
	count=0;
	return count;
}
if(" ".equals(str.substring(0,1))){
	count=0;
}
if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
{
for (int i = 0; i < str.length(); i++)
{
if (str.charAt(i) == ' ')
{
count++;
}
}



count = count; 
}
return count; 
}

/*public static int pasta(String mushroom) 
{ 
int n[] = new int[256]; 

int len = mushroom.length(); 
for (int i=0; i<len; i++) 
	
	
	
//n[mushroom.charAt(i)]++; 

int max = 1;  


//char result = ' ';    

for (int i = 0; i < len; i++) { 
//if (max < n[mushroom.charAt(i)]) { 
//max = n[mushroom.charAt(i)]; 
//result = mushroom.charAt(i); 
} 
} 
//return result;
return max;
} */
public static int count(String b) {
	b.replaceAll(" ", "");
	return b.length();
}
public static int fib(int n) 
{ 
if (n <=1) {
return n; 
}
return fib(n-1) + fib(n-2); 
} 


public static void main(String[] args) {
// TODO Auto-generated method stub?
System.out.println("Lets have some fun with Strings!");

int sel = 2;

Scanner input = new Scanner(System.in);
for(int i =0; i < 1;--i) {
System.out.println("Pick the action you would like to do");
System.out.println("1. Count the amount of letters in a sentence!\n"
+ "2. Make all the letters in the sentence to uppercare!\n"
+ "3. Mix 2 words together!\n"
+ "4. Count the amount of words in a sentence!\n"+
"5. Find the most common letter in a sentence!\n"
+ "6. Enter how many numbers in the Fibonacci sequence you would like displayed\n"
+ "7. Exit");
sel = input.nextInt();
input.nextLine();
if(sel == 1) {
System.out.println("Enter the String!");
String sent = input.nextLine();
System.out.println(count(sent));
}
else if(sel == 2) {
System.out.println("Enter the String!");
String sent = input.nextLine();
System.out.println(upper(sent));
}
if(sel == 3) {
System.out.println("Lets mix 2 words!");
System.out.println("Enter word 1!");
String word1 = input.nextLine();
System.out.println("Enter word 2!");
String word2 = input.nextLine();

System.out.println(mix(word1,word2));
}
else if(sel == 4){
System.out.println("Enter the String!");
String sent = input.nextLine();
System.out.println(countWords(sent));
}
else if(sel == 5) {
System.out.println("Enter the String!");
String sent = input.nextLine();
System.out.println(find(sent));
}
else if(sel ==6) {
System.out.println("Which fibonacci number do you want?");
int n= input.nextInt();
System.out.println(fib(n));
}
else if(sel==7){
i = 2;
System.out.println("bye");
}
}
}
}
