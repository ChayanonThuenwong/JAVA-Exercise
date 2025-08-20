import java.util.Scanner;

class EXE05 {
    public static void main(String[] args) {
        // **Loop Condition** //

        // While loop //
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x += 1;
        }

        // For loop //
        for (int i = 1; i <= 10; i += 1) { // for (Default; Conditon; Processing)
            System.out.println(i);
        }

        // Do ... While //
        int y = 1;
        do {
            System.out.println(y);
            y += 1;
        } while (y <= 10);

        // ****************** Exercises ***************** \\
        // ******************* EXE 001 ******************* \\

        Scanner sc = new Scanner(System.in);
        System.out.print("Your value : ");
        int n = sc.nextInt(), i = 1;

        while (i <= 12) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i += 1;
        }

        // ********************************************** \\
        // ******************* EXE 002 ****************** \\

        System.out.print("Pyramid number : ");
        int n_pyramid = sc.nextInt();
        for (int a = 1; a <= n_pyramid; a += 1) {
            for (int b = 1; b <= a; b += 1) {
                System.out.print(b);
            }
            System.out.println("");
        }

        // ********************************************** \\
    }
}