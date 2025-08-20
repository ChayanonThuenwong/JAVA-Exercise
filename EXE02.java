class EXE02 {
    public static void main(String[] args) {
        // Type of Variable
        int a = 100; //Global Variable
        System.out.println(a);

        {
            int c = 300; //Local Variable
            System.out.println(c);
        }

        // Max - Min Variable
        System.err.println(Integer.MIN_VALUE);
        System.err.println(Integer.MAX_VALUE);
        System.err.println(Byte.MAX_VALUE);
        System.err.println(Byte.MIN_VALUE);
        System.err.println(Double.MIN_VALUE);
        System.err.println(Double.MAX_VALUE);   

        // Type Casting 
        int x = 10; // Auto Casting
        double y = x;
        System.err.println(y);

        double u = 12.5; // Manual Casting
        int u2 = (int)u;
        System.err.println(u2);
    }
}