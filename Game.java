package game;
import java.util.Scanner;
import java. util.Random;
public class Game {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		System.out.println("Welcome to the Compute 21!");
		int totalnum=0;
		Random r= new Random();
		for (int index=1;index<100;index++) {
			int a=1;
			System.out.println("Enter the number you want to add: ");
			int add=Keyboard.nextInt();
			if (add>3||add<1) {
				for (int b=0; b<100; b++){
					System.out.println("Enter the number you want to add: ");
					add=Keyboard.nextInt();
					if (add>0&&add<4) {
						break;
					}
				}
				
			}
			totalnum+=add;
			
			
		    if (totalnum<10&&totalnum!=0) {
		    a+=1;
		    int addC=r.nextInt(3-1+1)+1;
		    totalnum=totalnum+addC;
		    System.out.println(totalnum);
		    }	
		    
		    if (totalnum<13&&totalnum>9&&a/2==0) {
				a+=1;
				totalnum=totalnum+(13-totalnum);
				System.out.println(totalnum);
			}
		    
		    if (totalnum==13&&a/2==0) {
		    	a+=1;
		    	int ran1=r.nextInt(3-1+1)+1;
		    	totalnum=totalnum+ran1;
		    }
		    
		    
            if (totalnum<17&&totalnum>13&&a/2==0) {
            	a+=1;
            	totalnum=totalnum+(17-totalnum);
            	System.out.println(totalnum);
            }
			
            if (totalnum==17&&a/2==0) {
		    	a+=1;
		    	int ran1=r.nextInt(3-1+1)+1;
		    	totalnum=totalnum+ran1;
		    }
            
			if (totalnum<21&&totalnum>17&&a/2==0) {
				a+=1;
				totalnum=totalnum+(21-totalnum);
				System.out.println(totalnum);
			}
			
			
			if (totalnum==21&&a/2==0) {
				System.out.println(totalnum);
				System.out.println("You lost!");
				break;
				}
			

		   }
	}
}
