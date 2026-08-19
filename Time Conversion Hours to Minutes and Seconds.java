import java. util. Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System. out. println("Enter hours:");
        double hours=input.nextDouble();
        
        double menet = hours*60;
        double second= hours*3600;
        System.out.println("the menet "+"is"+menet+"the second "+ second+ hours);
    }
}
