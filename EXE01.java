class EXE01 {
    public static void main(String[] args) {
        // Print Command
        System.out.print("Good Morning! "); // print screen-out without newline
        System.out.println("Chayanon"); // print screen-out with newline

        // Value-setting Method
        int value1 = 20;
        float value2 = 10.5f;
        char alphabet = 'A';
        System.out.println(value1);
        System.out.println("Second Value is "+value2);
        System.out.println(alphabet);

        value2 = 5.0f;
        System.out.println("Second Value is "+value2);

        // Constant value
        final float pi = 3.14f; // Can't adjust anything
        System.out.println("pi value is "+pi);
    }
}

