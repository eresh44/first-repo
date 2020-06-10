import java.util.ArrayList;

public class switchCase {

	public static void main(String[] args) {
		ArrayList<String> monthlist = new ArrayList<String>();
		
		int month= 2 ;
		switch (month) {
		case 1 : monthlist.add("jenuary");
		case 2 : monthlist.add("february");
	    case 3 : monthlist.add("march");
	    case 4 : monthlist.add("april");
	    case 5 :monthlist.add("may");
	    case 6 : monthlist.add("june");
	    case 7 : monthlist.add("jully");
	    case 8 : monthlist.add("august");
	    case 9 : monthlist.add("september");
	    case 10 : monthlist.add("october");
	    case 11 : monthlist.add("november");
	    case 12 : monthlist.add("december");
		break;
		default : break ; 
		}
if(monthlist.isEmpty()) {
	System.out.print("eror");
	}
	else {
		for(String monthname : monthlist) {
		System.out.println( monthname );
		}
	}
		


	}
	
	}


