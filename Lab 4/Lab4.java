// import java.util.Scanner;
// public class Lab4 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         // Addition
//         System.out.println("Addition: " + (a + b));

//         // Subtraction
//         System.out.println("Subtraction: " + (a - b));

//         // Multiplication
//         System.out.println("Multiplication: " + (a * b));

//         // Division
//         System.out.println("Division: " + (a / b));

//         // Exponentiation
//         System.out.println("Exponentiation: " + (int) Math.pow(a, b));

//         // Bitwise AND
//         System.out.println("Bitwise AND: " + (a & b));

//         // Bitwise OR
//         System.out.println("Bitwise OR: " + (a | b));

//         // Ternary - Maximum
//         int max = (a > b) ? a : b;
//         System.out.println("Maximum: " + max);

//         // Ternary - Minimum
//         int min = (a < b) ? a : b;
//         System.out.println("Minimum: " + min);

//         sc.close();
//     }
// }




// public class Lab4 {

//     public static void main(String[] args) {

//         int a = 10, b = 5, c = 2, d = 3;

//         System.out.println("Values: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
//         System.out.println("==========================================");

//         // Expression 1: Without parentheses
//         int result1 = a + b * c - d;
//         System.out.println("Expression 1 (Without parentheses):");
//         System.out.println("a + b * c - d = " + a + " + " + b + " * " + c + " - " + d);
//         System.out.println("Step: b*c = " + b + "*" + c + " = " + (b * c));
//         System.out.println("Step: a + 10 - d = " + a + " + 10 - " + d);
//         System.out.println("Result = " + result1);

//         System.out.println("------------------------------------------");

//         // Expression 2: With parentheses changing the order
//         int result2 = (a + b) * (c - d);
//         System.out.println("Expression 2 (With parentheses):");
//         System.out.println("(a + b) * (c - d) = (" + a + "+" + b + ") * (" + c + "-" + d + ")");
//         System.out.println("Step: (a+b) = " + (a + b));
//         System.out.println("Step: (c-d) = " + (c - d));
//         System.out.println("Result = " + result2);

//         System.out.println("==========================================");
//         System.out.println("Without parentheses result : " + result1);
//         System.out.println("With parentheses result    : " + result2);
//         System.out.println("Results are DIFFERENT — parentheses change the answer!");
//     }
// }




// import java.util.Scanner;

// public class Lab4{

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Ask user for temperature in Celsius
//         System.out.print("Enter temperature in Celsius: ");
//         double celsius = sc.nextDouble();

//         // Convert Celsius to Fahrenheit using the formula
//         double fahrenheit = celsius * 9 / 5 + 32;

//         // Print the result
//         System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");

//         sc.close();
//     }
// }




// public class Lab4 {

//     public static void main(String[] args) {

//         int a = 5;

//         System.out.println("Initial value of a = " + a);
//         System.out.println("================================");

//         // Pre-Increment (++a) — increment first, then use
//         System.out.println("Pre-Increment (++a) = " + (++a));   // a becomes 6

//         // Post-Increment (a++) — use first, then increment
//         System.out.println("Post-Increment (a++) = " + (a++));  // prints 6, then a becomes 7
//         System.out.println("After Post-Increment, a = " + a);   // a is now 7

//         System.out.println("================================");

//         // Pre-Decrement (--a) — decrement first, then use
//         System.out.println("Pre-Decrement (--a) = " + (--a));   // a becomes 6

//         // Post-Decrement (a--) — use first, then decrement
//         System.out.println("Post-Decrement (a--) = " + (a--));  // prints 6, then a becomes 5
//         System.out.println("After Post-Decrement, a = " + a);   // a is now 5

//         System.out.println("================================");
//         System.out.println("Final value of a = " + a);
//     }
// }






import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- Check Even or Odd ----
        System.out.print("Enter a number to check Even/Odd: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        System.out.println("================================");

        // ---- Check Absolute Value ----
        System.out.print("Enter a number to find Absolute value: ");
        int n = sc.nextInt();

        int absolute = (n < 0) ? -n : n;
        System.out.println("Absolute value of " + n + " = " + absolute);

        sc.close();
    }
}