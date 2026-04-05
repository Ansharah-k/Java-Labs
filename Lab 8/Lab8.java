// import java.util.Scanner;

// public class Lab8 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Choose an option:");
//         System.out.println("a: Add two numbers");
//         System.out.println("b: Find power using math function");
//         System.out.println("c: Exit");
//         System.out.print("Enter choice: ");
//         char choice = sc.next().charAt(0);

//         switch (choice) {

//             case 'a':
//                 System.out.print("Enter first number  : ");
//                 double num1 = sc.nextDouble();
//                 System.out.print("Enter second number : ");
//                 double num2 = sc.nextDouble();
//                 System.out.println("Sum = " + (num1 + num2));
//                 break;

//             case 'b':
//                 System.out.print("Enter base     : ");
//                 double base = sc.nextDouble();
//                 System.out.print("Enter exponent : ");
//                 double exp = sc.nextDouble();
//                 System.out.println("Result = " + Math.pow(base, exp));
//                 break;

//             case 'c':
//                 System.out.println("Exiting program. Goodbye!");
//                 break;

//             default:
//                 System.out.println("Invalid choice!");
//         }

//         sc.close();
//     }
// }


// import java.util.Scanner;
// public class Lab8 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the category of item:");
//         System.out.println("1. Electronics");
//         System.out.println("2. Groceries");
//         System.out.println("3. Clothing");
//         int category = sc.nextInt();

//         System.out.print("Enter amount spent: ");
//         double amount = sc.nextDouble();

//         switch (category) {

//             case 1:
//                 System.out.println("Total spent on Electronics: $" + amount);
//                 break;

//             case 2:
//                 System.out.println("Total spent on Groceries: $" + amount);
//                 break;

//             case 3:
//                 System.out.println("Total spent on Clothing: $" + amount);
//                 break;

//             default:
//                 System.out.println("Invalid category!");
//         }

//         sc.close();
//     }
// }




// import java.util.Scanner;
// public class Lab8 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your grade (0-100): ");
//         int grade = sc.nextInt();

//         // Divide grade by 10 to get range
//         int range = grade / 10;

//         switch (range) {

//             case 10:
//             case 9:
//                 System.out.println("Letter Grade: A");
//                 break;

//             case 8:
//                 System.out.println("Letter Grade: B");
//                 break;

//             case 7:
//                 System.out.println("Letter Grade: C");
//                 break;

//             case 6:
//                 System.out.println("Letter Grade: D");
//                 break;

//             default:
//                 System.out.println("Letter Grade: F");
//         }
//         sc.close();
//     }
// }






import java.util.Scanner;
public class Lab8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of Circle: " + circleArea);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                double rectArea = length * width;
                System.out.println("Area of Rectangle: " + rectArea);
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double triArea = 0.5 * base * height;
                System.out.println("Area of Triangle: " + triArea);
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}