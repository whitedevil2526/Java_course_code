import java.sql.SQLOutput;
import java.util.Scanner;

public class CW_userinput {
    public static void main (String[] args){
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of the number is:" + sum);
    }
}
