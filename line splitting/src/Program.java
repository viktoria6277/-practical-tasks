import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.println("Enter line");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[]words = line.split("\\s");
        System.out.println("Splited line:");
        for(int i=0; i< words.length; i++){
            System.out.println(words[i]);
        }

    }
}
