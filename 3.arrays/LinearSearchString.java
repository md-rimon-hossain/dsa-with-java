public class LinearSearchString {
    public static int linearSearchForStr(String numbers[], String key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void callLinearSearchForStr() {
        String numbers[] = { "Rimon", "likhon", "ridoy", "luka", "maria", "maya" };
        String key = "maya";

        int index = linearSearchForStr(numbers, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key of index = " + index);
        }
    }

    public static void main(String[] args) {
        callLinearSearchForStr();
    }
}
