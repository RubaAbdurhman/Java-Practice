import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your grade (0-100:");
          int grade =input.nextInt ();
        
        switch(grade/ 10){
            case 10:
                case 9 :
                    System.out.println("A");
                    break;
        
                       case 8 :
                        System.out.println("B");
                        break;
                        case 7:
                            System .out.println("C");
                            break;
                        case 6:
                            System.out.println("D");
                            
                             default:
                            System. out.println(" F");

        }
        
    }
}

