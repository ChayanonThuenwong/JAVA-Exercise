import java.util.Scanner; // Import Class

class EXE03 {
    public static void main(String[] args) {
        // String Processing
        String Name = "Chayanon";
        System.out.println(Name);

        // Scanner Command
        Scanner sc = new Scanner(System.in); // Only used one 
        System.out.print("Your University name : ");
        String university = sc.nextLine();

        System.out.print("Your age : ");
        int age = sc.nextInt();

        System.out.print("Your Height : ");
        float height = sc.nextFloat();

        System.out.println("Your University : "+university);
        System.out.println("Your age : "+age);
        System.out.println("Your height : "+height);

    }
}