package IT5Conditional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int age = 17;

        if(age > 18){
            System.out.println("You are a adult");
        }
        else {
            System.out.println("You are a minor");
        }
        */

        Scanner input = new Scanner(System.in);
        int grade;

        System.out.println("Enter grade:");
        grade = input.nextInt();

        if(grade >= 95) {
            System.out.println("With Highest Honor");
        } else if(grade < 90 && grade) {
            System.out.println("With High Honors");
        } else if(grade < 75 && grade) {
            System.out.println("Pass");
        } else if (grade < 60 && grade) {
            System.out.println("Fail or INC");
        } else {
            System.out.println("Invalid grade");
        }
        input.close();
    }
}
