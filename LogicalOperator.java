public class LogicalOperator{
    public static void main(String args[]){
        int a=10,b=20,c=30;
        if( ( a < b ) && ( b == c ) )
        {
            System.out.println("The Sum Is"+(a+b+c));
        }
        else{
            System.out.println("Condition Unsatisfied therefore Sum is not calculated");
        }

    }
}