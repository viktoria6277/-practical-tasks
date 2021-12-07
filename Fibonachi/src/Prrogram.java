import java.util.Scanner;

public class Prrogram {
    public static void main(String[] args) {
        System.out.println("Enter count of Fibonacci numbers");
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < array.length; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println("Fibonacci numbers is:");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}
