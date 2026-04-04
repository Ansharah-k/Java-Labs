
// public class Lab3 {
//     public static void main(String[] args) {
        
//         char gender = 'M';
//         boolean hasDrivingLicense = true;
        
//         System.out.print("Gender: " + gender + "\nHas driving license: " + hasDrivingLicense);
//     }
// }


// 



// import java.util.Scanner;

// public class Lab3 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the name of item 1: ");
//         String item1 = input.nextLine();
//         System.out.print("Enter the price of " + item1 + ": ");
//         double price1 = input.nextDouble();
//         input.nextLine();

//         System.out.print("Enter the name of item 2: ");
//         String item2 = input.nextLine();
//         System.out.print("Enter the price of " + item2 + ": ");
//         double price2 = input.nextDouble();
//         input.nextLine();

//         System.out.print("Enter the name of item 3: ");
//         String item3 = input.nextLine();
//         System.out.print("Enter the price of " + item3 + ": ");
//         double price3 = input.nextDouble();
//         input.nextLine();

//         System.out.print("Enter the name of item 4: ");
//         String item4 = input.nextLine();
//         System.out.print("Enter the price of " + item4 + ": ");
//         double price4 = input.nextDouble();
//         input.nextLine();

//         System.out.print("Enter the name of item 5: ");
//         String item5 = input.nextLine();
//         System.out.print("Enter the price of " + item5 + ": ");
//         double price5 = input.nextDouble();

//         double totalBill = price1 + price2 + price3 + price4 + price5;
//         int roundedBill = (int) totalBill;

//         System.out.print("\nTotal Bill (Original): $" + totalBill + "\nTotal Bill (Rounded): $" + roundedBill);
//         input.close();
//     }
// }



// import java.util.Scanner;

// public class Lab3 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter Employee Name: ");
//         String empName = input.nextLine();

//         System.out.print("Enter Employee ID: ");
//         int empID = input.nextInt();

//         System.out.print("Enter Basic Salary: ");
//         double basicSalary = input.nextDouble();

//         System.out.print("Enter Allowance: ");
//         float allowance = input.nextFloat();

//         System.out.print("Enter Tax Rate (%): ");
//         int taxRate = input.nextInt();

//         // Calculations
//         double grossSalary = basicSalary + allowance;

//         double taxRateCasted = (double) taxRate;  
//         double taxAmount = (grossSalary * taxRateCasted) / 100;

//         double netSalaryOriginal = grossSalary - taxAmount;
//         int netSalaryRounded = (int) netSalaryOriginal;  

//         // Display Output
//         System.out.print("\nEmployee Name: " + empName +
//                          "\nEmployee ID: " + empID +
//                          "\nBasic Salary: $" + basicSalary +
//                          "\nAllowance: $" + allowance +
//                          "\nGross Salary: $" + grossSalary +
//                          "\nTax Amount (" + taxRate + "%): $" + taxAmount +
//                          "\nNet Salary (Original): $" + netSalaryOriginal +
//                          "\nNet Salary (Rounded): $" + netSalaryRounded);
                         
//         input.close();
//     }
// }







import java.util.Scanner;
public class SampleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        // Calculations
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Type cast area to int
        int areaRounded = (int) area;
        
        System.out.print("\n--- Rectangle Details ---" +
                         "\nLength: " + length +
                         "\nWidth: " + width +
                         "\nArea (Original): " + area +
                         "\nArea (Rounded): " + areaRounded +
                         "\nPerimeter: " + perimeter);
        input.close();  
    }
}