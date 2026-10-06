import java.util.Scanner;

public class sanzida {
    
    // 6. Method 
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Print Options & Data Types
        System.out.println("=== 1. Variables and Print Options ===");
        int studentAge = 20;
        double gpa = 3.85;
        char grade = 'A';
        boolean isJavaFun = true;
        
        System.out.println("Age: " + studentAge);
        System.out.printf("GPA: %.2f\n", gpa); 
        System.out.println("Grade: " + grade + ", Java is fun: " + isJavaFun);

        // 2. Scanner - User Input
        System.out.println("\n=== 2. User Input (Scanner) ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");

        // 3. Conditional Statements
        System.out.println("\n=== 3. Conditionals ===");
        int score = 85;

        if (score >= 90) {
            System.out.println("Performance: Excellent (A+)");
        } else if (score >= 80) {
            System.out.println("Performance: Good (A)");
        } else {
            System.out.println("Performance: Needs Improvement");
        }

        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Day 1: Saturday");
                break;
            case 2:
                System.out.println("Day 2: Sunday");
                break;
            default:
                System.out.println("Weekday");
                break;
        }

        // 4. Loops (For, While, Do-While)
        System.out.println("\n=== 4. Loops ===");
        
        System.out.print("For Loop (1 to 3): ");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("While Loop (1 to 3): ");
        int j = 1;
        while (j <= 3) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // 5. Arrays (1D and 2D Two-Dimensional Array)
        System.out.println("\n=== 5. Arrays ===");
        int[] scoresArray = {80, 85, 90, 95, 100};
        System.out.println("First element in 1D Array: " + scoresArray[0]);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Element at 2D Array [1][2]: " + matrix[1][2]);

        // 6. Calling the Method
        System.out.println("\n=== 6. Methods ===");
        int sumResult = calculateSum(25, 35);
        System.out.println("Result from custom method addition (25 + 35) = " + sumResult);

        
        scanner.close();
    }
}
