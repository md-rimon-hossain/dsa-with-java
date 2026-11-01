public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void callLinearSearch() {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int key = 14;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key of index = " + index);
        }
    }

    public static void main(String[] args) {
        callLinearSearch();
    }
}
