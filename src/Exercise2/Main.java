package Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        int gradeMath;
        int gradeEnglish;
        int gradeScience;

        System.out.println("Enter your first name:");
        firstName = input.nextLine();
        System.out.println("Enter your last name:");
        lastName = input.nextLine();
        System.out.println("Enter your grade in Math:");
        gradeMath = input.nextInt();
        System.out.println("Enter your grade in English:");
        gradeEnglish = input.nextInt();
        System.out.println("Enter your grade in Science:");
        gradeScience = input.nextInt();
        double result = (gradeMath+gradeEnglish+gradeScience) / 3.00;

        if(result >= 90) {
            System.out.println("A");
        } else if(result < 80 && result){
            System.out.println("B");
        } else if(result < 70 && result) {
            System.out.println("C");
        } else if(result < 60 && result) {
            System.out.println("D");
        }

        System.out.println("Hello, " + firstName + lastName + "!");
        System.out.printf("Your average is: %.2f");

        input.close();
    }
}
