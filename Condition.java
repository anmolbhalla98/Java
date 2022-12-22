public class Condition{
    public static void main(String args[]){
        int a=55;
        int b=70;
        if(a<50 && a<b){
            System.out.println("Condition 1 is true that is a is less than 50 and also from b that is 70");
        }
        else if(a<50 || a<b){
            System.out.println("Condition 2 is true that is a is less than 50 or a is less than b that is 70");

        }
        else{
            System.out.println("False");
        }
        
    }
}