import java.util.Scanner;
public class sumaverage {
    public static void main(String[] args) {
        int n , sum = 0;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        System.out.println("Enter all the elements:");

        int[] A = new int[n];
        for (int i = 0; i < n; i++)
        {
            A[i] = sc.nextInt();
            sum = sum +A[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}
