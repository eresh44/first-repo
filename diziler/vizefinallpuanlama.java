package eresh;
import java.util.Scanner;

public class vizefinallpuanlama {
	static String dizi [] = {"ff","fd","dd","dc","cc","cb","bb","ba","aa"};
	public static void main(String[] args) {
	 Scanner brs = new Scanner(System.in);
	
	 System.out.println("vize notunu gir : ");
	
	double vize= brs.nextInt();
	System.out.println("finall notunu gir: ");
	double finall= brs.nextInt();
	double sonuc= vize*0.4+finall*0.6 ;
	if (sonuc<30 ) {
		System.out.println("sonuc : " + dizi[0]); 
		
		}
	else if(sonuc<40){
		System.out.println("sonuc : " + dizi[1]);
	}
	else if(sonuc<55){
		System.out.println("sonuc : " + dizi[2]);
	 
	}
	
	else if(sonuc<60){
		System.out.println("sonuc : " + dizi[3]);
	 
	}
	else if(sonuc<65){
		System.out.println("sonuc : " + dizi[4]);
	 
	}
	else if(sonuc<70){
		System.out.println("sonuc : " + dizi[5]);
	 
	}
	else if(sonuc<80){
		System.out.println("sonuc : " + dizi[6]);
	 
	}
	else if(sonuc<90){
		System.out.println("sonuc : " + dizi[7]); 
	 
	}
	else if(sonuc<100){
		System.out.println("sonuc : " + dizi[1]);
	 
	}
	
	
	
	
	
	
	
	
	}

}
