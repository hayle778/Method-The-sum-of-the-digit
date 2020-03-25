
// Write a Java method to compute the sum of the digits in an integer



import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digits;
        System.out.println("Enter the digit:");
        digits = input.nextInt();
        System.out.println("The sum is: " + sumDigits(digits));

    }

   private static int sumDigits(long n) {
        int result = 0;
// you gonna work with the parameter that you parametrize
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

}