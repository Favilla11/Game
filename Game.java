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
					break;
			}
				System.out.println("Enter the number you want to add: ");
			}
			totalnum+=add;
			
		    if (totalnum<14&&totalnum!=0) {
		    a+=1;
		    int addC=r.nextInt(3-1+1)+1;
		    totalnum=totalnum+addC;
		    System.out.println(totalnum);
		    }	
		    
		    if (totalnum==14&&a/2==0) {
		    a+=1;
			int add3=3;
			totalnum=totalnum+add3;
			System.out.println(totalnum);
		    }
		    
            if (totalnum<17&&totalnum>14) {
            	totalnum=totalnum+(17-totalnum);
            	System.out.println(totalnum);
            }
			
			
			if (totalnum==18&&a/2==0) {
			int addA=3;
			totalnum=totalnum+addA;
			System.out.println(totalnum);
			}
			
			if (totalnum==19&&a/2==0) {
				int addB=3;
				totalnum=totalnum+addB;
				System.out.println(totalnum);
				}
			
			if (totalnum==20&&a/2==0) {
				int addc=1;
				totalnum=totalnum+addc;
				System.out.println(totalnum);
				}
			
			if (totalnum>=21) {
				System.out.println("You lost and I win!");
				break;
				}
		   }
		}
	}
