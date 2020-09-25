import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){

        int maxNumber = 20;
        int previousNumber = 0;
        int nextNumber = 1;
        int i = 0;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        while ( i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            ++i;
        }
    }
}

