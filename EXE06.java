class EXE06 {
    public static void main(String[] args) {
        // Array arrangement *1D*\\
        int[] age = { 18, 19, 20 }; // First method

        int[] year = new int[3]; // Second method
        year[0] = 2018;
        year[1] = 2019;
        year[2] = 2020;

        for (int i = 1; i <= age.length; i += 1) {
            System.out.println("Member's age " + i + " = " + age[i - 1]);
        }

        for (int years : year) {
            System.out.println(years);
        }

        // Array arrangement *2D*\\
        int[][] number = {
            {2,4,6,8,10},
            {1,3,5,7,9}
        };  
        for (int rows = 0; rows < number.length; rows+=1 ){
            for (int column = 0;column < number[rows].length; column+=1){
                System.out.println(number[rows][column]);
            }
        }
    }
}