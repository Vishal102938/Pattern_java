import java.util.Scanner;

public class Patterns {

    // Pattern 1: Full Square of Stars
    public static void fullSquare(int i, int rows) {
        if (i > rows) return;
        printStars(rows);
        System.out.println();
        fullSquare(i + 1, rows);
    }

    // Pattern 2: Right Triangle
    public static void rightTriangle(int i, int rows) {
        if (i > rows) return;
        printStars(i);
        System.out.println();
        rightTriangle(i + 1, rows);
    }

    // Pattern 3: Inverted Right Triangle
    public static void invertedTriangle(int i, int rows) {
        if (i < 0) return;
        printStars(i + 1);
        System.out.println();
        invertedTriangle(i - 1, rows);
    }

    // Pattern 4: Hollow Square
    public static void hollowSquare(int i, int rows) {
        if (i >= rows) return;
        printHollowStars(i, rows);
        System.out.println();
        hollowSquare(i + 1, rows);
    }

    // Pattern 5: Center-aligned Triangle
    public static void centerTriangle(int i, int rows) {
        if (i >= rows) return;
        printSpaces((rows - i - 1) * 2);
        printStars(i + 1);
        System.out.println();
        centerTriangle(i + 1, rows);
    }

    // Pattern 6: Inverted Center-aligned Triangle
    public static void invertedCenterTriangle(int i, int rows) {
        if (i >= rows) return;
        printSpaces(i * 2);
        printStars(rows - i);
        System.out.println();
        invertedCenterTriangle(i + 1, rows);
    }

    // Pattern 7: Left Arrow Star Pattern
    public static void leftArrow(int i, int rows) {
        if (i == rows) return;
        if (i < rows / 2) {
            printStars(i + 1);
        } else {
            printStars(rows - i);
        }
        System.out.println();
        leftArrow(i + 1, rows);
    }

    // Pattern 8: Plus Star Pattern
    public static void plusPattern(int i, int rows) {
        if (i >= rows) return;
        if (i == rows / 2) {
            printStars(rows);
        } else {
            printSpaces((rows / 2) * 2);
            System.out.print("* ");
        }
        System.out.println();
        plusPattern(i + 1, rows);
    }

    // Pattern 9: Diamond Star Pattern
    public static void diamondPattern(int i, int rows) {
        if (i == rows) return;
        int half = rows / 2;
        if (i <= half) {
            printSpaces((half - i) * 2);
            printStars(i * 2 + 1);
        } else {
            printSpaces((i - half) * 2);
            printStars((rows - i) * 2 - 1);
        }
        System.out.println();
        diamondPattern(i + 1, rows);
    }

    // Pattern 10: Eight Shape Star Pattern
    public static void eightShapePattern(int i, int rows) {
        if (i >= rows) return;
        if (i == 0  i == rows - 1  i == rows / 2) {
            printStars(rows);
        } else {
            System.out.print("* ");
            printSpaces((rows - 2) * 2);
            System.out.print("* ");
        }
        System.out.println();
        eightShapePattern(i + 1, rows);
    }

    // Helper function to print stars
    public static void printStars(int count) {
        if (count == 0) return;
        System.out.print("* ");
        printStars(count - 1);
    }

    // Helper function to print spaces
    public static void printSpaces(int count) {
        if (count == 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    // Helper function to print stars for hollow square
    public static void printHollowStars(int i, int rows) {
        if (i == 0 || i == rows - 1) {
            printStars(rows);
        } else {
            System.out.print("* ");
            printSpaces((rows - 2) * 2);
            System.out.print("* ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int rows;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Full Square of Stars");
            System.out.println("2. Right Triangle");
            System.out.println("3. Inverted Right Triangle");
            System.out.println("4. Hollow Square");
            System.out.println("5. Center-aligned Triangle");
            System.out.println("6. Inverted Center-aligned Triangle");
            System.out.println("7. Left Arrow Star Pattern");
            System.out.println("8. Plus Star Pattern");
            System.out.println("9. Diamond Star Pattern");
            System.out.println("10. Eight Shape Pattern");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 10) {
                System.out.print("Enter the number of rows: ");
                rows = sc.nextInt();
            } else {
                rows = 0; 
            }

            switch (choice) {
                case 1:
                    fullSquare(0, rows);
                    break;
                case 2:
                    rightTriangle(0, rows);
                    break;
                case 3:
                    invertedTriangle(rows - 1, rows);
                    break;
                case 4:
                    hollowSquare(0, rows);
                    break;
                case 5:
                    centerTriangle(0, rows);
                    break;
                case 6:
                    invertedCenterTriangle(0, rows);
                    break;
                case 7:
                    leftArrow(0, rows);
                    break;
                case 8:
                    plusPattern(0, rows);
                    break;
                case 9:
                    diamondPattern(0, rows);
                    break;
                case 10:
                    eightShapePattern(0, rows);
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 11);

        sc.close();
    }
}