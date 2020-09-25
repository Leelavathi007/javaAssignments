import java.util.Scanner;
public class Operator {
    public static void main(String[]args) {
        double a, b, output = 0;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        a = sc.nextDouble();

        System.out.println("enter b value");
        b = sc.nextDouble();

        System.out.println("enter an expreesion (+,-,*,/):");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                output = a + b;
                break;

            case '-':
                output = a - b;
                break;

            case '*':
                output = a * b;
                break;

            case '/':
                output = a / b;
                break;

            default:
                System.out.println("you have entered wrong operaton");


        }
        System.out.println(a + " " + operator + " " + b + " :" + output);
        return;

    }

}

