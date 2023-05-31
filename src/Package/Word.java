package Package;



public class Word {
	private String Name;
	public Word(String nam ) {
		Name=nam;
	}
	public String getName() {
		return Name;
	}
	public void setName(String n) {
		Name=n;
	}
	
	public boolean palindrome() {
		int y=Name.length();
		String Pal="";
		for(int x=y-1;x>=0;x--) {
			Pal=Pal+Name.charAt(x);
		}
		if(Pal.equals(Name)) {
			return true;
		}
		return false;
	}//This part of the code check for if a word is a palydrome
	public int numchar(char wanted) {
		int count=0;
		int l=Name.length();
		for(int num=0;num<l;num++) {
			if(Name.charAt(num)==wanted) {
				count++;
			}
		}
		return count;
		//This part check for the time the char appear by checking a char input within the word
	}
	public String len(String another) {
		int y=another.length();
		int x=Name.length();
		if(x>y) {
			return ("the original one is larger");
		}else if(x==y) {
			return("they are both in the same lenght");
		}
	return("the checked string one is larger");
	//it check whether the checked word is larger or smaller than the original or they both have the same length.
}
}