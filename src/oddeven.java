import java.util.Scanner;
public class oddeven {
    public static void main(String[]args){
    int n;
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();

        if(n%2 == 0){
        if(n >=2 && n<= 5){
            System.out.println("not weird");
        }else if(n>=6 && n<=20) {
            System.out.println("weird");
        } else if(n>20){
            System.out.println("not weird");
        }
    } else{
        System.out.println("weird");
    }

}
}

