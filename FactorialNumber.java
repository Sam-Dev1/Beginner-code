import java.util.Scanner;

public class FactorialNumber {
    public void calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int res = 1, n = num;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        FactorialNumber obj = new FactorialNumber();
        obj.calculation();
    }
}
//Formula n=1*2*3*4*------*n
