import java.util.Scanner;

public class Lab9{
    public static void main(String[] args){
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);
        
        while (playAgain) {
            System.out.println("==============================================");
            System.out.println("Welcome to Math Quiz Game...!!");
            System.out.println("==============================================");
            System.out.println("Choose Difficulty Level: ");
            System.out.println("==============================================");
            System.out.println("1. Easy ");
            System.out.println("2. Medium ");
            System.out.println("3. Hard ");
            System.out.println("==============================================");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            int start = 2;
            int end = 25;

            int randomNum = (int)(Math.random() * (end - start + 1)) + start;
            int randomNum2 = (int)(Math.random() * (end - start + 1)) + start;

            switch(choice){
                case 1:
                    System.out.println(randomNum + " + " + randomNum2 + " = ?");
                    int answer1 = scanner.nextInt();
                    if(answer1 == randomNum + randomNum2){
                        System.out.println("Congratulations! Your answer is correct.");
                    } else {
                        System.out.println("Wrong! Correct answer: " + (randomNum + randomNum2));
                    }
                    break;

                case 2:
                    System.out.println(randomNum + " * " + randomNum2 + " = ?");
                    int answer2 = scanner.nextInt();
                    if(answer2 == randomNum * randomNum2){
                        System.out.println("Congratulations! Your answer is correct.");
                    } else {
                        System.out.println("Wrong! Correct answer: " + (randomNum * randomNum2));
                    }
                    break;

                case 3:
                    System.out.println(randomNum + " / " + randomNum2 + " = ?");
                    int answer3 = scanner.nextInt();
                    if(answer3 == randomNum / randomNum2){
                        System.out.println("Congratulations! Your answer is correct.");
                    } else {
                        System.out.println("Wrong! Correct answer: " + (randomNum / randomNum2));
                    }
                    break;

                default:
                    System.out.println("Invalid choice....Choose option between 1 to 3");
            }

            System.out.println("Do you want to play again?");
            System.out.println("yes / no");
            scanner.nextLine(); // flush
            String again = scanner.nextLine();
            if(again.equalsIgnoreCase("no")){
                playAgain = false;
            }
        }
        scanner.close();
    }
}