package Lab5;

import java.util.ArrayList;

public class war {
		private int n;
		public war(int num) {
			n=num;
		}
		public int getN() {
			return n;
		}
		public void setN(int n) {
			this.n = n;
		}
		public ArrayList<war> s(ArrayList<war> a) {
	 		ArrayList<war> b=new ArrayList<war>();
			for(int c=0;c<a.size();c++) {
				int e=(int)(Math.random()*((a.size()-0)));
				b.add(a.get(e));
				//a.remove(e);
			  }return b;
		}

	}


