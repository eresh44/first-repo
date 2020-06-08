package eresh;
import java.util.Scanner;
public class hesapmakinesi {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner (System.in);
		System.out.println("toplama: ");
		System.out.println("a ");
		int a= keyboard.nextInt();
		System.out.println("b ");
		int b= keyboard.nextInt();
		
		int c;
		c=a+b;
		
		
		System.out.println("x ");
		int x= keyboard.nextInt();
		System.out.println("y ");
		int y= keyboard.nextInt();
		int z=x-y;
		if(x==y) {int cikartma = x-y ;
			}
		else  if (x<y) {int cikarma=x-y;}
		System.out.println("cýkartma: " + z);
		
		 
		int j;
		System.out.println("k ");
		int k= keyboard.nextInt();
		System.out.println("l ");
		int l= keyboard.nextInt();
		j=k*l;
		System.out.println("carpma: " + j);
	    int d;
	    System.out.print("e ");
	    int e= keyboard.nextInt();
	    System.out.print("f ");
	    int f= keyboard.nextInt();
		  if ( f != 0 ) {
			  d=e/f;
			  System.out.print("bölme " + e/f);
			  
			  
		  }
		  else if (f==0) {
			  System.out.print("bölme tanýmsýz");

		  }
		
	  
	 
	
	    
	    
		}
		
					
	}


