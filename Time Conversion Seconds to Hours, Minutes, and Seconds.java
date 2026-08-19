import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter second");
        int second = input.nextInt();
        
        int hours= second/3600;
        int remainderSecond= second%3600;
        int minets =remainderSecond/60;
        int Second= remainderSecond%60;
        
        System.out.println("hours"+"is"+ hours);
        System.out.println("minet"+"is"+minets);
        System.out.println("Second"+"is"+Second);
    }
    
}

