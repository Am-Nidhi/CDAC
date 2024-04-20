public class Pattern1 {
    public static void main(String[] args){
        int size = 5;
        // Loop through rows
        for (int i = 1; i <= size; i++) {
            // Loop through columns
            for (int j = 1; j <= 2 * size - 1; j++) {
                if (i == size || j == size - i + 1 || j == size + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }
}
