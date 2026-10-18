public class HollowRectangle {
    public static void hollow_rectangle(int totalRows, int totalCols) {
        // rows
        for (int i = 1; i <= totalRows; i++) {
            // cells
            for (int j = 1; j <= totalCols; j++) {
                // checking is that exact row and col on boundary
                if (i == 1 | i == totalRows | j == 1 | j == totalCols) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
