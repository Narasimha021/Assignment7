import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        System.out.print("Enter the year in which the employee joined: ");
        int joinYear = scanner.nextInt();
        
        int yearsOfService = currentYear - joinYear;
        
        if (yearsOfService > 5) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded for your years of service.");
        }
        scanner.close();
    }
}

