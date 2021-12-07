import java.util.ArrayList;
import java.util.Scanner;

public class Program {
public static void main(String[]args){
    System.out.println("Enter lenght or array");
    Scanner in = new Scanner(System.in);
    String[] array = new String[in.nextInt()];
    System.out.println("Enter elements of array");
    for (int i=0; i< array.length; i++){
        array[i] = in.next();
    }
    System.out.println();
    System.out.println("Array:");
    for (int i=0; i< array.length; i++){
        System.out.println(array[i]);
    }
    int n = array.length;
    String temp;
    for (int i=0; i< n/2; i++){
        temp = array[n-i-1];
        array[n-i-1] = array[i];
        array[i] = temp;
    }
    System.out.println();
    System.out.println("Reversed array:");
    for (int i=0; i< array.length; i++){
        System.out.println(array[i]);

    }

}
}
