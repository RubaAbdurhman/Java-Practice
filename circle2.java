import java .util. Scanner;
public class Main
{
    public static void main (String[]args){
    
    Scanner input = new Scanner (System . in);
   System . out. print ("Enter a number for radius:");
    double radius=input.nextDouble();
    
    double Area= radius*radius*3.1415;
    
    System . out . print ( "the area of Circal"+ radius +"is"+ Area);
}
}