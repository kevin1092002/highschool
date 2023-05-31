package Lab8;

public class pr{
private String name;
private String review;
public pr(String pn, String pR) {//the product review constructor contain the product name and review
	name=pn;
	review=pR;
}
public String getName() {//get name method
	return name;
}
public String getReview() {//get review method
	return review;
}
public String getBoth() {
	return name+review;
}

}
