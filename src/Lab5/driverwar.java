package Lab5;

import java.util.ArrayList;

public class driverwar {

	public static void main(String[] args) {
		int g=1;
		// TODO Auto-generated method stub
		ArrayList<war>tie=new ArrayList<war>();
		ArrayList<war>o=new ArrayList<war>();
		ArrayList<war>t=new ArrayList<war>();
		//ArrayList<war>vo=new ArrayList<war>();
		ArrayList<war>n=new ArrayList<war>();
		war War = new war(0);
		//ArrayList<war>vt=new ArrayList<war>();
		for(int count=2;count<15;count++) {
			for(int v=0;v<4;v++) {
				if(v==0) {
					n.add(new war(count));
				}if(v==1) {
					n.add(new war(count));
				}if(v==2) {
					n.add(new war(count));
				}if(v==3) {
					n.add(new war(count));
				}
				}//make a deck of card, because the ace is the largest; therefore i make the smallest is equal 2 and the largest is 14. Sorry i don't know how to make the ace represents the 14 without setting it to 14.
		}
		System.out.println(n.size());// i just want to make sure it is a valid deck of card
		n = n.get(0).s(n);//shuffle it
	for(int count=0;count<n.size();count++) {//deal out the card one time each for each player
		if(count%2==0) {
			o.add(n.get(count));
		}else {
			t.add(n.get(count));
		}
	}
	for(int count=0;count<o.size();count++) {//i just want to make sure i have the valid deck for two
		System.out.println(o.get(count).getN());
	}System.out.println(o.size());
	for(int count=0;count<t.size();count++) {
		System.out.println(t.get(count).getN());
		}
	
	while(o.size()!=0 && t.size()!=0) {//play the game
		
		System.out.println("round"+g);
		System.out.println(o.size());// show the hand size of each player after each turn
		System.out.println("o");
		System.out.println(t.size());
		System.out.println("v");
		o = o.get(0).s(o);//shuffle the new player deck
		t = t.get(0).s(t);
		int c = 0;
		System.out.println(o.get(c).getN()+" and"+t.get(c).getN());// print out the card played that round
		if(o.get(c).getN()>t.get(c).getN()) {// check if the first card is larger than the second card
			for (int temp = 0; temp < tie.size(); temp++) {
				o.add(tie.get(temp));//also add all the tie card in war
			}
			tie = new ArrayList<war>();//set the tie deck empty
			o.add(t.get(c));//add the losing card to the win player deck
			t.remove(c);//remove the  losing card from the loser deck
			}else if(o.get(c).getN()<t.get(c).getN()) {// check if the second card is larger than the first card
			for (int temp = 0; temp < tie.size(); temp++) 
			{
				t.add(tie.get(temp));					
			}// add all the tie card in war
			tie = new ArrayList<war>();//set the tie deck empty
			t.add(o.get(c));//add the losing card to the win player deck
			o.remove(c);//remove the  losing card from the loser deck
			}
			else {//begin war if the players had the same card
				System.out.println("war");
				for(int count=0;count<5;count++) {//skip the 4 next card
					if (count<o.size() && count<t.size()) {// the condition if one of the player had less than 5 cards
						tie.add(o.get(0+count));//add all the card from first  player
						tie.add(t.get(0+count));//add all the card from second player
						o.remove(0);//remove all of them
						t.remove(0);//remove all of them
						}
					}
				}
		g++;//increment the round
		System.out.println( o.size() + " " + t.size() + " " +tie.size());//check the size all of the size of three decks in case the player had nothing left to play. Example: tie when the player had the last card
		System.out.println("Total cards" + (o.size() + t.size() + tie.size()));//check the total card in deck to make sure.
		if(o.size()==0) {//print the winner
			System.out.println("player one win"+" "+"in round"+" "+g);
			break;
		}else if(t.size()==0) {
			System.out.println("player two win"+" "+ "in round"+" "+ g);
			break;
		}
	}
		
	}
	}
