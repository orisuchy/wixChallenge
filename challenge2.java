package wixChallenge;

import java.util.HashMap;
import java.util.Scanner;


public class challenge2 {
	public static void insertXY(HashMap Xmap, int Xloc, int Yloc) {
		Xmap.put(Xloc, new HashMap());
		((HashMap) Xmap.get(Xloc)).put(Yloc,false);
	}
	public static int howManyVisits(String s, HashMap Xmap, int Xloc, int Yloc, int visits) {
		if(s.length()==0)
			return visits;
		
		 if (s.startsWith(">"))
		Xloc++;
	else if (s.startsWith("<"))
		Xloc--;
	else if (s.startsWith("^"))
		Yloc++;
	else if (s.startsWith("v"))
		Yloc--;
		 
		if (Xmap.containsKey(Xloc)) {
			if(((HashMap) Xmap.get(Xloc)).containsKey(Yloc)) {
				if (!(Boolean)((HashMap) Xmap.get(Xloc)).get(Yloc)) {
					((HashMap) Xmap.get(Xloc)).put(Yloc,true);
					visits++;
				}
			}
			else
				((HashMap) Xmap.get(Xloc)).put(Yloc,false);
		}
		else
			insertXY(Xmap, Xloc, Yloc);
		
		return howManyVisits(s.substring(1),Xmap,Xloc,Yloc,visits);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  String s = scan.next();
		  int visits=0;
		  int Xloc=0;
		  int Yloc=0;
		  HashMap Xmap = new HashMap();
		  System.out.println(howManyVisits(s,Xmap,Xloc,Yloc,visits));
		
	}

}
