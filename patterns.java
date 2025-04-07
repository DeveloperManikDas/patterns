import java.util.*;

class patternPrinter {

    // This is pattern of Right-Angle Triangle
    public static void printRightAngledTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // This is pattern of inverted Right-Angle Triangle
    public static void printInvertedRightAngledTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = n; star >= line; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // This is pattern of Half Pyramid with numbers
    public static void halfPyramidNumbers(int n) {
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }

    // This is pattern of Half Pyramid with characters
    public static void halfPyramidCharacters(int n) {
        char letter = 'A';
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(letter);
                letter++;
            }
            System.out.println("");
        }
    }

    // This is pattern of Hollow Rectangle
    public static void hollowRectangle(int col, int row) {

        for (int line = 1; line <= row; line++) {
            for (int star = 1; star <= col; star++) {
                if (line == 1 || line == row || star == 1 || star == col) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }
    }
}

class patterns {

    static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean running = true;

        while (running) {
            System.out.println("\n===== Pattern Printer =====");
            System.out.println("1. Right-Angled Triangle");
            System.out.println("2. Inverted Right-Angled Triangle");
            System.out.println("3. Half-Pyramids with Numbers");
            System.out.println("4. Half-Pyramids with Characters");
            System.out.println("5. Hollow Rectangle");
            System.out.print("Choose a pattern (1-9) or 0 to EXIT: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Keep Going... Never stop coding!");
                break;
            }

            switch (choice) {
                case 1: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.printRightAngledTriangle(n);
                    break;
                }
                case 2: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.printInvertedRightAngledTriangle(n);
                    break;
                }
                case 3: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.halfPyramidNumbers(n);
                    break;
                }
                case 4: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.halfPyramidCharacters(n);
                    break;
                }
                case 5: {
                    System.out.print("Enter the number of rows: ");
                    int row = sc.nextInt();
                    System.out.print("Enter the number of columns: ");
                    int col = sc.nextInt();
                    patternPrinter.hollowRectangle(col, row);
                    break;
                }
                default: {
                    System.out.print("Please enter a valid number!");
                    break;
                }
            }
        }
        ;

        sc.close();
    }
}