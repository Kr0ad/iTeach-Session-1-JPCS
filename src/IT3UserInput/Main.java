package IT3UserInput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        String name;
        int age;
        double gpa;

        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your GPA: ");
        gpa = input.nextDouble();
        System.out.println("Enter your final grade: ");
        char grade = input.next().charAt(0);

        System.out.println("==============");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Final Grade: " + grade);
        input.close();
    }
}
