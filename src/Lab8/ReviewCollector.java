package Lab8;
import java.util.ArrayList;


public class ReviewCollector {
	private ArrayList<pr> rl;
	private ArrayList<String>pl;
	public ReviewCollector() {//the Review constructor which contain the two lists
		rl=new ArrayList<pr>();
		pl=new ArrayList<String>();
	}
	
	public ArrayList<pr> getRl() {
		return rl;
	}
	public ArrayList<String> getPl() {
		return pl;
	}
	public void addReview(pr proreview) {
		rl.add(proreview);//add the new product review into review list
		if(pl.size()==0) {
			pl.add(proreview.getName());
		}
		for(int count=0;count<pl.size();count++) {//add only the name to product list
		 if(!pl.contains(proreview.getName())) {
		pl.add(proreview.getName());
	}
		}
}
	public int numGoodReviews(String pn) {
		int cc=0; 
		for(int count=0;count<rl.size();count++) {//check for product name
			if(rl.get(count).getName().equals(pn)) {
				/*if(rl.get(count).getReview()==null) {//check for if there is any review
					return 0;
				}
				else {
					if(rl.get(count).getReview().charAt(0)=='b') {//check for good review
						if(rl.get(count).getReview().charAt(1)=='e') {
							if(rl.get(count).getReview().charAt(2)=='s') {
								if(rl.get(count).getReview().charAt(3)=='t') {*/
				if(rl.get(count).getReview().contains("best")) {
									cc++;//increase number of good review
								}
							
				/*else if(rl.get(count).getReview().charAt(0)!='b') {//if the review not begin with best
					x++;
					rl.get(count).getReview().substring(x);
				}*/
			
		}
	}
		return cc;//return number of good review
}
}