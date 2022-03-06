package lesson_2;

public class Task9 {
    public static void main(String[] args) {
        createArray(128, 256);
    }

    public static int[] createArray(int len, int initialValue) {
        int array[] = new int[len];
        for (int i : array) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        return array;
    }
}
