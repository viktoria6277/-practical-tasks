import java.awt.*;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program{
    static int calculateFactorial(int n){
        int result = 1;
        for (int i=1; i<=n; i++){
            result = result*i;
        }
        return result;
    }
    static int calcuklateFactorialRecursion(int n){
    int result = 1;
    if(n==1 || n==0){
        return result;
    }
    result = n * calcuklateFactorialRecursion(n-1);
    return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to calculate the factorial:");
        int num = in.nextInt();
        System.out.println("Factorial calculation: "+calculateFactorial(num));
        System.out.println("recursive factorization: 5"+calcuklateFactorialRecursion(num));

    }
}