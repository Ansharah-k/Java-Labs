// public class Lab5 {
//    // Example Code
//    int a = 10;
//    double b = a;        // Implicit (widening) — works automatically → 10.0
//    double x = 9.99;
//    int y = (int) x;     // Explicit (narrowing) — must cast manually → 9 
// }


// public class Lab5 {

//     public static void main(String[] args) {

//         // 1. Assigning a byte value to an int variable
//         byte byteValue = 10;
//         int intValue = byteValue;   // implicit casting: byte -> int
//         System.out.println("--- byte to int ---");
//         System.out.println("Before (byte) : " + byteValue);
//         System.out.println("After  (int)  : " + intValue);

//         System.out.println();

//         // 2. Assigning an int value to a long variable
//         int intNum = 5000;
//         long longNum = intNum;      // implicit casting: int -> long
//         System.out.println("--- int to long ---");
//         System.out.println("Before (int)  : " + intNum);
//         System.out.println("After  (long) : " + longNum);

//         System.out.println();

//         // 3. Assigning a float value to a double variable
//         float floatValue = 3.14f;
//         double doubleValue = floatValue;  // implicit casting: float -> double
//         System.out.println("--- float to double ---");
//         System.out.println("Before (float)  : " + floatValue);
//         System.out.println("After  (double) : " + doubleValue);
//     }
// }



// public class Lab5 {

//     public static void main(String[] args) {

//         // 1. Converting double to int
//         double doubleValue = 9.99;
//         int intValue = (int) doubleValue;   // explicit casting: double -> int
//         System.out.println("--- double to int ---");
//         System.out.println("Before (double) : " + doubleValue);
//         System.out.println("After  (int)    : " + intValue);

//         System.out.println();

//         // 2. Converting long to short
//         long longValue = 100000L;
//         short shortValue = (short) longValue;  // explicit casting: long -> short
//         System.out.println("--- long to short ---");
//         System.out.println("Before (long)  : " + longValue);
//         System.out.println("After  (short) : " + shortValue);

//         System.out.println();

//         // 3. Converting float to byte
//         float floatValue = 130.75f;
//         byte byteValue = (byte) floatValue;   // explicit casting: float -> byte
//         System.out.println("--- float to byte ---");
//         System.out.println("Before (float) : " + floatValue);
//         System.out.println("After  (byte)  : " + byteValue);
//     }
// }



// public class Lab5 {

//     public static void main(String[] args) {

//         // Three integers
//         int a = 10, b = 20, c = 30;

//         System.out.println("Three numbers: a=" + a + ", b=" + b + ", c=" + c);
//         System.out.println("==========================================");

//         // Average stored as int (using explicit casting)
//         int intAverage = (int) ((a + b + c) / 3.0);
//         System.out.println("Average as int    : " + intAverage);

//         // Average stored as double
//         double doubleAverage = (a + b + c) / 3.0;
//         System.out.println("Average as double : " + doubleAverage);

//         System.out.println("==========================================");

//         // Difference between both results
//         double difference = doubleAverage - intAverage;
//         System.out.println("Difference        : " + doubleAverage + " - " + intAverage + " = " + difference);
//     }
// }



import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take item prices as doubles from user
        System.out.print("Enter price of item 1: ");
        double item1 = sc.nextDouble();

        System.out.print("Enter price of item 2: ");
        double item2 = sc.nextDouble();

        System.out.print("Enter price of item 3: ");
        double item3 = sc.nextDouble();

        // Subtotal as double
        double subtotalDouble = item1 + item2 + item3;

        // Subtotal cast to int (explicit casting)
        int subtotalInt = (int) subtotalDouble;

        // Tax 8% calculated on int subtotal
        double tax = subtotalInt * 8.0 / 100;

        // Final amount
        double finalAmount = subtotalInt + tax;

        // Print results
        System.out.println();
        System.out.println("Subtotal (as double): " + subtotalDouble);
        System.out.println("Subtotal (cast to int): " + subtotalInt);
        System.out.println("Tax (8%): " + tax);
        System.out.println("Final amount: " + finalAmount);

        sc.close();
    }
}