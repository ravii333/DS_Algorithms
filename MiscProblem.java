package Arrays;
import java.util.Scanner;

public class MiscProblem {
    static void swap(int a, int b) {
        System.out.println("Values before swapping ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int temp =a;
        a = b;
        b = temp;
        System.out.println("Values after swapping ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a  and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
}