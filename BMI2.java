/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java . util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner input= new Scanner (System . in );
   System . out . print(" Enter Weight in pounds ");
    double Weight = input. nextDouble();
    System .out.print  ("Enter height in pounds :");
    double height = input. nextDouble ();
    final double KILOGRAMS_PER_POUND =0.45359237;
    final double METERS_PER_INCH=0.0254;
    
    double weightInKilograms = Weight * KILOGRAMS_PER_POUND;
double heightInMeters= height * METERS_PER_INCH ;
double bmi = weightInKilograms /
(heightInMeters * heightInMeters);
if (bmi >= 30) {
System. out. println("Obese");
} else if (bmi >= 25) {
System. out. println("Overweight");
} else if (bmi >= 18.5) {
System. out. println ("Normal");
} else {
System. out. println ("Underweight");
     
	}
}
}