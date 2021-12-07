import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[]args){
        System.out.println("Convert negative numbers to positive");
        ArrayList<Integer> positiveNum = new ArrayList<Integer>();
        Collections.addAll(positiveNum,-2,-1,0,1,2);
        positiveNum.stream()
               .filter(s-> s < 0)
               .map(s-> s*-1)
               .forEach(System.out::println);
        positiveNum.stream()
                .filter(s-> s>0)
                .forEach(System.out::println);
        System.out.println("Even numbers *100, odd numbers -100");
        ArrayList<Integer> evenOdd = new ArrayList<Integer>();
        Collections.addAll(evenOdd,123,124,125,126,127);
        evenOdd.stream()
                .filter(s->(s%2)==1)
                .map(s-> s-100)
                .forEach(System.out::println);
        evenOdd.stream()
                .filter(s-> (s%2)==0)
                .map(s-> s*100)
                .forEach(System.out::println);
        System.out.println("Surnames that start with 'A'");
        ArrayList<String> lastNames = new ArrayList<String>();
        Collections.addAll(lastNames,"Ajhb, Hjdkf, Appd, Ksxc, Uiso, Awqs");
        lastNames.stream()
                .filter(s-> s.contains("A"))
                .collect(Collectors.toList());
        System.out.println(lastNames);







    }
}
