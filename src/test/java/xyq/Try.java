package xyq;

import java.util.Scanner;

public class Try {


		 public  void convertStringtoInt( String time1,String time2){

			
		 String [] time11= time1.split(" ");
		 String [] time22= time2.split(" ");

		int h1= Integer.parseInt(time11[0]) ;int h2= Integer.parseInt(time22[0]);
		
		 int hours=h1+h2;
		
		 int m1=Integer.parseInt(time11[1]); int m2= Integer.parseInt(time22[1]);
		 int min=m1+m2;
		 
		if(min>59) {
			
			hours+=1;
			min%=60;
		
			
		}
	
		if(hours>24) {
			
			hours=(hours+min)%24;
		}
		System.out.println("Space ship Destroyed At"+hours +" "+min);
		
		}
		 
		   public static void main(String args[] ) throws Exception {

			//Write code here
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a lanuch time");
		   String lanuchtime=sc.nextLine();
		   System.out.println("Enter a travel time");
		 String traveltime=sc.nextLine();
		 
		 Try tr=new Try();
		 tr.convertStringtoInt(lanuchtime, traveltime);

		   
		}


}
