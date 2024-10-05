//This Program is Converting Number from Integer number to binary number
import java.util.Scanner;
public class ConvertNumber{
    void Convert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer Number to convert it into Binary");
        int num= sc.nextInt();
        int n=num, a=0;
        int[] rem = new int[100];
        while(n>0){
            rem[a]=n%2;
            n=n/2;
            a++;
        }
        for (int j = a - 1; j >= 0; j--)
            System.out.print(rem[j]);
    }
    public void close(){}

    public static void main (String[] args){
        ConvertNumber obj = new ConvertNumber();
        obj.Convert();
    }
}
