import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Num1:");
        int n1 = sc.nextInt();

        System.out.println("Enter A Num2");
        int n2 = sc.nextInt();

        System.out.println("Choose operator: + - * / %");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                int add = n1 + n2;
                System.out.println(add);
                break;
            case '-':
                int sub = n1 - n2;
                System.out.println(sub);
                break;
            case '/':
                int div = n1 / n2;
                System.out.println(div);
                break;
            case '*':
                int mul = n1 * n2;
                System.out.println(mul);
                break;
            case '%':
                int mod = n1 % n2;
                System.out.println(mod);
                break;

            default:
                System.out.println("Plese give valid operator");
                break;
        }

        sc.close();
    }
}
