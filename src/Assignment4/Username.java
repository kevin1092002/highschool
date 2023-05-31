package Assignment4;

public class Username {
	private String name;
	private int year;
	public Username(String n,int y) {
		name=n;
		year=y;
}
	public String user() {
		String rr="";
		String x=" ";
		rr=name.substring(0,1)+name.substring(name.indexOf(x)+1);
		return rr;
	}
	public String pass() {
		String p="";
		String z=" ";
		p=name.substring(0,2)+year+name.substring(name.indexOf(z)+1,name.indexOf(z)+4);
		return p;
	}
}