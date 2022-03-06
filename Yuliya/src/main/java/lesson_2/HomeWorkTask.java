package lesson_2;

public class HomeWorkTask {
    public static void main(String[] args) {
        checkSum(7, 7);
        checkSum(9, 1);
        checkSum(11, 9);
        checkSum(20, 200);
        checkForPositivity(-10);
        checkForPositivity(0);
        checkForPositivity(1);
        System.out.println(checkForPositivityBoolean(-10));
        System.out.println(checkForPositivityBoolean(0));
        System.out.println(checkForPositivityBoolean(1));
        printString(4, "Моя домашняя работа");
        checkLeapYear(2000);




    }

    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else return false;
    }

    public static void checkForPositivity(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        }
        System.out.println("Отрицательное");
    }

    public static boolean checkForPositivityBoolean(int a) {
        if (a >= 0) {
            return true;
        }
        return false;
    }

    public static void printString(int a, String string) {
        for (int i = 0; i < a; i++){
            System.out.println(string);
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            } else {
                return year % 4 == 0;
            }
        }
    }

}
