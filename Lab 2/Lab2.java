import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        // Separate each digit
        int digit1 = number / 100;           
        int digit2 = (number / 10) % 10;     
        int digit3 = number % 10;            

        int sum = digit1 + digit2 + digit3;

        System.out.println("\nNumber  : " + number);
        System.out.println("Digits  : " + digit1 + ", " + digit2 + ", " + digit3);
        System.out.println(digit1 + " + " + digit2 + " + " + digit3 + " = " + sum);
        sc.close();
    }
}