public class Swap{
    public static void main(String args[]){
        int a=50;
        int b=60;
        //int c=a;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values of a and b after swapping are "+" = "+a+","+b);
        // Then after swapping a=50,b=60;
    }
}