package Assignment4;

public class gmail {
private String mail;
	public gmail(String yourmail) {
		mail=yourmail;
	}
	public String username() {
		String y="";
		String x="@";
		y=mail.substring(0,mail.indexOf(x));
		return y;
	}
	public String server() {
		String y="";
		String x="@";
		String n=".";
		y=mail.substring(mail.indexOf(x)+1,mail.indexOf(n));
		return y;
	}
	public String domain() {
		String y="";
		String x=".";
		y=mail.substring(mail.indexOf(x)+1);
		return y;
	}
}
