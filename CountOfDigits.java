import java.util.Scanner;

public class CountOfDigits { //Count of digits in a number using recursion or recursive function
    static int contDigits(int num){
        if(num>=0 && num<=9) return 1;
        return contDigits(num/10)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(contDigits(num));
    }
}
