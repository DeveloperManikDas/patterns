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

}

class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, choice;

        do {
            System.out.println("\n===== Pattern Printer =====");
            System.out.println("1. Right-Angled Triangle");
            System.out.println("2. Square");
            System.out.println("3. Inverted Triangle");
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

                default:
                    break;
            }

        } while (true);

        sc.close();
    }
}