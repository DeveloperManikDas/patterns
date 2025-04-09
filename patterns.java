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

    // This is pattern of Inverted and Rotated Pyramid
    public static void invertedRotatedPyramid(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col > (n - row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // This is pattern of Inverted half Pyramid with Numbers
    public static void invertedhalfPyramidNumbers(int n) {

        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= (n - row); col++) {
                System.out.print(col);
            }
            System.out.println("");

        }
    }

    // This is pattern of Floyd's Triangle with Numbers
    public static void floydsTriangleWithNumbers(int n) {
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");

        }
    }

    // This is pattern of Zero One Triangle
    public static void zeroOneTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);

                }

            }
            System.out.println("");

        }
    }

    // This is pattern of Butterfly
    public static void butterfly(int n) {

        // for upper part
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= (2 * (n - row)); col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        // for lower part
        for (int row = n; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= (2 * (n - row)); col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
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
            System.out.println("6. Inverted and rotated Pyramid");
            System.out.println("7. Inverted Half Pyramid with Numbers");
            System.out.println("8. Floyd's Triangle with Numbers");
            System.out.println("9. Zero One Triangle");
            System.out.println("10. Butterfly");
            System.out.println("11. Solid Rhombus");
            System.out.println("12. Hollow Rhombus");
            System.out.println("13. Diamond");

            System.out.print("Choose a pattern (1-13) or 0 to EXIT: ");
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
                case 6: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.invertedRotatedPyramid(n);
                    break;
                }
                case 7: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.invertedhalfPyramidNumbers(n);
                    break;
                }
                case 8: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.floydsTriangleWithNumbers(n);
                    break;
                }
                case 9: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.zeroOneTriangle(n);
                    break;
                }
                case 10: {
                    int n = getInput(sc, "Enter the number of lines: ");
                    patternPrinter.butterfly(n);
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