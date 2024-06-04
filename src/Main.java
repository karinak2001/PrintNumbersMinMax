import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower bound: ");
        int lower = scanner.nextInt();

        System.out.println("Enter the upper bound: ");
        int upper = scanner.nextInt();

        printMinMaxNumbers(lower, upper);
        //כאשר אנחנו מעבירים יותר מפרמטר אחד לפונקציה, הערך הראשון מוכנס אל הפרמטר הראשון, הערך השני מוכנס אל הפרמטר השני, וכך הלאה.
    }




    public static void printMinMaxNumbers(int min, int max){         //הערך של lower מועבר ל min והערך של upper מועבר ל max
        for (int i = min; i <= max; i++) {
            System.out.print(i + ",");

        }
    }
}