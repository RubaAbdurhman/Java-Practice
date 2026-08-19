import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    System. out.println("Enter a numberone:");
	    int numberone=input.nextInt();
         System. out.println("Enter a numbertwo:");
	    int numbertwo=input.nextInt();
	    System.out.println("Enter numberthree:");
	    int numberthree=input.nextInt();
	     int max = numberone;
	     if(numbertwo>max){
	         max=numbertwo;
	     }
	     if(numberthree>max){
	         max=numberthree;
	     }
	     System. out. println(" the number is "+ max);
	}
	
}