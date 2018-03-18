package wixChallenge;
import java.util.Scanner;
public class challenge1 {
	 	  
	  public static int whatFloor(String s, int floorNumber){
	    if (s.length()==0)
	    return floorNumber;
	    else{
	      if(s.startsWith("("))
	       floorNumber++;
	      else
	        floorNumber--;
	     return whatFloor(s.substring(1),floorNumber);
	    }
	    
	    
	  }
	  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  String s = scan.next();
	  System.out.println(whatFloor(s,0));
	  
	  }
	}