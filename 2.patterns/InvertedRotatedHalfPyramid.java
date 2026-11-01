public class InvertedRotatedHalfPyramid {
    public static void invertedAndRevertedHalfPyramid(int n) {
        for (int l = 1; l <= n; l++) {
            for (int j = 1; j <= n - l; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= l; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedAndRevertedHalfPyramid(5);
    }
}
