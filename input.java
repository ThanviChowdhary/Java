import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        // System.out.println("Enter Number 1: ");
        // Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();

        /*
         * System.out.println("Enter a number 1: ");
         * Scanner sc = new Scanner(System.in);
         * // int i = sc.nextInt();
         * boolean j = sc.hasNextInt();
         * System.out.println(j);
         */

        System.out.println("Hello!");
        System.out.println("Enter maths mark: ");
        Scanner sc = new Scanner(System.in); // will take the input from user
        float marks = sc.nextInt(); // will save that input in the mentioned variable(marks in this case)
        float sum = marks + 50;
        System.out.println("Maths mark is: " + sum);

    }
}
