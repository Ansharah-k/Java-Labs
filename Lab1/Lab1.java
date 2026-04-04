import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        System.out.print("Enter Father's Name: ");
        String fatherName = sc.nextLine();

        // Greeting message with result
        System.out.println("\n--- Greeting Message ---");
        System.out.println("Hello, " + name + "! Welcome to the " + department + " department.");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Department : " + department);
        System.out.println("Email ID   : " + email);
        System.out.println("Father Name: " + fatherName);
        sc.close();
    }
}