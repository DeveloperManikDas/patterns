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
            for (int star = 4; star >= line; star--) {
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

}

class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, choice;

        do {
            System.out.println("\n===== Pattern Printer =====");
            System.out.println("1. Right-Angled Triangle");
            System.out.println("2. Inverted Right-Angled Triangle");
            System.out.println("3. Half-Pyramids with Numbers");
            System.out.println("4. Exit");
            System.out.print("Choose a pattern (1-4): ");
            choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Keep Going... Never stop coding!");
                break;
            }

            System.out.print("Enter the number of lines: ");
            n = sc.nextInt();

            switch (choice) {
                case 1:
                    patternPrinter.printRightAngledTriangle(n);
                    break;
                case 2:
                    patternPrinter.printInvertedRightAngledTriangle(n);
                    break;
                case 3:
                    patternPrinter.halfPyramidNumbers(n);
                    break;
                default:
                    break;
            }

        } while (true);

        sc.close();
    }
}