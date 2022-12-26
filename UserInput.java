import java.util.Scanner;
public class UserInput{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Value of a");
        int a = sc.nextInt();
        if(a==0){
            System.out.println("BYE BYE");
            return;
        }
        System.out.println("Please Enter Value of b");
        int b = sc.nextInt();
        if(a>0){
            a=a/b;
            System.out.println("The final value of positive integer a after division is ="+a);
        }
        else if(a<0){
            a=a*b;
            System.out.println("The final value of negative integer a is ="+a);

        }
        
    }
}