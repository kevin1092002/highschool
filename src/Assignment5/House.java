package Assignment5;

public class House {
	private String dist;
	private String ward;
	private String street;
	private String address;//declare all the private variable
	public House(String d, String w, String s) {
		dist=d;
		ward=w;
		street=s;//make the constructor
	}
	public String checkhouse(int num) {
		String add="";
		add=(String)("distrtict"+dist+" "+"ward"+ward+" "+num+" "+ street);
		address=add;
		return address;//part a asks for the whole address
	}
	public String printhouse(int house) {
		for(int x=0;x<house;x++) {
			return address;
		}
		return null;//part b asks for every whole address of every house on the street
	}
	}

