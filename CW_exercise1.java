import java.sql.SQLOutput;
import java.util.Scanner;

public class CW_exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float total = 500;
        System.out.println("Enter the marks of 5 subject:");
        System.out.println("English");
        float a = sc.nextFloat();
        System.out.println("Mathematics");
        float b = sc.nextFloat();
        System.out.println("Physics");
        float c = sc.nextFloat();
        System.out.println("Chemistry");
        float d = sc.nextFloat();
        System.out.println("Java");
        float e = sc.nextFloat();
        float sum = a + b + c + d + e;
        System.out.println("total marks is:" + sum);
        float percentage = (sum/total)*100;
        System.out.println("marks in percentage is:" + percentage);
    }
}
