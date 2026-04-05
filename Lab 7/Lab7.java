// import java.util.Scanner;

// public class Lab7 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length  : ");
//         int length = sc.nextInt();

//         System.out.print("Enter breadth : ");
//         int breadth = sc.nextInt();

//         if (length == breadth) {
//             System.out.println("It is a Square!");
//         } else {
//             System.out.println("It is NOT a Square.");
//         }

//         sc.close();
//     }
// }



// import java.util.Scanner;

// public class Lab7 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter marks: ");
//         int marks = sc.nextInt();

//         if (marks < 25) {
//             System.out.println("Grade: F");
//         } else if (marks < 45) {
//             System.out.println("Grade: E");
//         } else if (marks < 50) {
//             System.out.println("Grade: D");
//         } else if (marks < 60) {
//             System.out.println("Grade: C");
//         } else if (marks <= 80) {
//             System.out.println("Grade: B");
//         } else {
//             System.out.println("Grade: A");
//         }

//         sc.close();
//     }
// }




// import java.util.Scanner;

// public class Lab7 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter total classes held    : ");
//         int total = sc.nextInt();

//         System.out.print("Enter classes attended      : ");
//         int attended = sc.nextInt();

//         // Calculate attendance percentage
//         double percentage = (attended * 100.0) / total;

//         System.out.println("Attendance Percentage       : " + percentage + "%");

//         if (percentage >= 75) {
//             System.out.println("Student IS allowed to sit in exam.");
//         } else {
//             System.out.println("Student is NOT allowed to sit in exam.");
//         }

//         sc.close();
//     }
// }



import java.util.Scanner;
public class Lab7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Full Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age       : ");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Email     : ");
        String email = sc.nextLine();

        System.out.print("Enter Password  : ");
        String password = sc.nextLine();

        // Validation using if-else ladder
        if (name.isEmpty()) {
            System.out.println("Error: Full Name cannot be empty.");
        } else if (age < 18 || age > 60) {
            System.out.println("Error: Age must be between 18 and 60.");
        } else if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Error: Email must contain @ and a dot (.)");
        } else if (password.length() < 6) {
            System.out.println("Error: Password must be at least 6 characters.");
        } else {
            System.out.println("Registration Successful! Welcome, " + name);
        }

        sc.close();
    }
}