public class PrintSubArrays {
    // printing all possible sub arr from given arrays and sum of each sub arr then get largest and smallest sum
    public static void printSubArr(int numbers[]) {  // brute force approach O(n3)
        int ts = 0;
        // int finalSum =0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;

                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    sum = sum + numbers[k];
                    if (j > 0 && k < j) {
                        System.out.print(numbers[k] + ",");
                    } else {
                        System.out.print(numbers[k]);
                    }
                }
                //  finalSum = finalSum + sum;
                ts++;
                System.out.print("] sum = " + sum + " ");

                if (sum < minSum) {
                    minSum = sum;
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Sub Arr = " + ts);
        System.out.println("minSum Sum All sub Array = " + minSum);
        System.out.println("maxSum Sum All sub Array = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArr(numbers);
    }
}
