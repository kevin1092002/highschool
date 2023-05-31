package Lab8;
import java.util.Arrays;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr v=new pr("asus","ssssbest");//test product and review
		pr b=new pr("asus","best");
		pr bb=new pr("apple","bbbbb");
		ReviewCollector n=new ReviewCollector();//make ReviewCollector object
		n.addReview(v);//use add review method
		n.addReview(bb);
		n.addReview(b);
		System.out.println(n.getPl());//print the product list
		for(int count=0;count<n.getRl().size();count++) {//print the review list
		System.out.println(n.getRl().get(count).getBoth());
		}
		System.out.println(n.numGoodReviews("asus"));//use the numGoodReviews method
	}

}
