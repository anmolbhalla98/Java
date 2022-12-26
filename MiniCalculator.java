import java.util.Scanner;
public class MiniCalculator{
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
        float c=sc.nextFloat();
        if(c==1){
            d=a+b;
            System.out.println("Result After Addition Is = "+d);

        }
        else if(c==2)
        {
            d=a-b;
            System.out.println("Result After Substraction Is = "+d);
        }
        else if(c==3){
            d=a/b;
            System.out.println("Result After Division Is = "+d);

        }
        else if(c==4){
            d=a*b;
            System.out.println("Result After Multiplication Is = "+d);
        }
        else if(c==5){
            d=a%b;
            System.out.println("Result After Performing Modulus Operation Is = "+d);
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}