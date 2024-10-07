import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строчек и столбцов массива: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Введите массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location largest = Location.locateLargest(array);

        System.out.printf("Наибольший элемент массива, равный %.1f, находится в позиции (%d, %d)\n",
                largest.maxValue, largest.row, largest.column);

        System.out.println("\n");

        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000);
        MyTime time3 = new MyTime(5, 23, 55);

        System.out.println("Текущее время: " + time1);
        System.out.println("Время после 555550000 миллисекунд: " + time2);
        System.out.println("Время 5:23:55: " + time3);

        MyInteger myInt1 = new MyInteger(23);
        MyInteger myInt2 = new MyInteger(10);

        System.out.println("\n");

        System.out.println("myInt1 is even? " + myInt1.isEven());
        System.out.println("myInt1 is odd? " + myInt1.isOdd());
        System.out.println("myInt1 is prime? " + myInt1.isPrime());

        System.out.println("myInt2 is even? " + myInt2.isEven());
        System.out.println("myInt2 is odd? " + myInt2.isOdd());
        System.out.println("myInt2 is prime? " + myInt2.isPrime());

        System.out.println("10 is even? " + MyInteger.isEven(10));
        System.out.println("10 is odd? " + MyInteger.isOdd(10));
        System.out.println("10 is prime? " + MyInteger.isPrime(10));

        System.out.println("myInt1 equals 23? " + myInt1.equals(23));
        System.out.println("myInt1 equals myInt2? " + myInt1.equals(myInt2));

        char[] chars = {'1', '2', '3'};
        System.out.println("parseInt(char[]) result: " + MyInteger.parseInt(chars));

        String str = "456";
        System.out.println("parseInt(String) result: " + MyInteger.parseInt(str));
    }
}