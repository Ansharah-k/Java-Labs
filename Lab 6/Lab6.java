// public class Lab6 {

//     public static void main(String[] args) {

//         // Generate random number between 97 and 122
//         int num = (int)(Math.random() * 26) + 97;

//         // Convert number to character
//         char ch = (char) num;

//         // Print result
//         System.out.println("Number    : " + num);
//         System.out.println("Character : " + ch);
//     }
// }


// import java.util.Scanner;

// public class Lab6 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Take user input
//         System.out.print("Enter side a: ");
//         double a = sc.nextDouble();

//         System.out.print("Enter side b: ");
//         double b = sc.nextDouble();

//         // Calculate hypotenuse using Pythagorean theorem
//         double c = Math.sqrt(a * a + b * b);

//         // Print result
//         System.out.println("Hypotenuse c = " + c);

//         sc.close();
//     }
// }






//import java.util.Scanner;

// public class Lab6 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Principal (P): ");
//         double P = sc.nextDouble();

//         System.out.print("Enter Rate (r) in %: ");
//         double r = sc.nextDouble() / 100;

//         System.out.print("Enter Times compounded per year (n): ");
//         int n = sc.nextInt();

//         System.out.print("Enter Time in years (t): ");
//         int t = sc.nextInt();

//         // Formula: A = P * (1 + r/n) ^ (n*t)
//         double A = P * Math.pow(1 + r / n, n * t);
//         double CI = A - P;

//         System.out.println("Final Amount        : " + A);
//         System.out.println("Compound Interest   : " + CI);

//         sc.close();
//     }
// }



import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Formula: distance = sqrt((x2-x1)^2 + (y2-y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance = " + distance);

        sc.close();
    }
}