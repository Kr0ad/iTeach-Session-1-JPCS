package Exercise1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        int year;
        double averageGrade;

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("Enter your school year:");
        year = input.nextInt();
        System.out.println("Enter your average grade:");
        averageGrade = input.next().charAt(0);

        System.out.println("-- Student Profile --");
        System.out.println("School     : De La Salle Lipa");
        System.out.println("Year       :" + year);
        System.out.println("Name       :" + name);
        System.out.println("Age        :" + age + " years old");
        System.out.println("Avg. Grade :" + averageGrade);



        input.close();

    }
}
