import java.util.Scanner;

class EXE04 {
    public static void main(String[] args) {

        // "If" Condition (Switch..Case)
        Scanner sc = new Scanner(System.in);
        System.out.print("Your final score : ");
        int score = sc.nextInt();

        if (score < 50 && score >= 0) {
            System.out.println("Grade 0");
        } else if (score >= 50 && score < 60) {
            System.out.println("Grade 1");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade 2");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade 3");
        } else if (score >= 80 && score <= 100) {
            System.out.println("Grade 4");
        } else {
            System.out.println("Try again!");
        }
    }
}