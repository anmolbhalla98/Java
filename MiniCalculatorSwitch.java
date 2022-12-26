import java.util.Scanner;
public class MiniCalculatorSwitch{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float d;
        System.out.println("Enter first number");
        float a=sc.nextFloat();
        System.out.println("Enter second number");
        float b=sc.nextFloat();
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Division");
        System.out.println("Enter 4 for Multiplication");
        System.out.println("Enter 5 for Modulus");
        int c=sc.nextInt();
        switch(c){
            case 1:{
                d=a+b;
            System.out.println("Result After Addition Is = "+d);
            }
            break;
            case 2:
            {
                 d=a-b;
            System.out.println("Result After Substraction Is = "+d);
        
            }
            break;
            case 3:{
                 d=a/b;
            System.out.println("Result After Division Is = "+d);

            }
            break;
            case 4:{
                 d=a*b;
            System.out.println("Result After Multiplication Is = "+d);
        
            }
            break;
            case 5:{
                  d=a%b;
            System.out.println("Result After Performing Modulus Operation Is = "+d);
             
            }
            break;
            default :{
                System.out.println("Invalid Input");
            }
            break;

        }
    }
}
