import java.util.ArrayList;
import java.util.Scanner;

public class Employee{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter salary of employee " + i + ": ");
            salaries.add(sc.nextDouble());
        }

        double total = 0;
        for (double salary : salaries) {
            total += salary;
        }

        double average = total / salaries.size();

        System.out.println("Average salary of employees = " + average);

        sc.close();
    }
}
