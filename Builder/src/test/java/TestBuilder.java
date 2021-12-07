interface Builder {
    void Convert(String str2);
    String GetResult();
}

class Convert_2_to_10 implements Builder {

    private String str10;

    public void Convert(String str2) {

        for (int i=0; i<str2.length(); i++)
            if (!((str2.charAt(i)=='0') || (str2.charAt(i)=='1'))) {
                str10 = "Error. Incorrect value.";
                return;
            }

        int power = 1;
        int number = 0;
        int pos;

        for (int i=0; i<str2.length(); i++) {
            if (i==0)
                power = 1;
            else
                power = power*2;
            pos = str2.length()-i-1;
            if (str2.charAt(pos) == '1')
                number = number + power;
        }

        str10 = "";
        while (number>0) {
            str10 = (number%10) + str10;
            number = number / 10;
        }
    }

    public String GetResult() {
        return str10;
    }
}

class Convert_8_to_10 implements Builder {
    private String str10; // результат

    public void Convert(String str8) {
        for (int i=0; i<str8.length(); i++)
            if ((str8.charAt(i)<'0') || (str8.charAt(i)>'7')) {
                str10 = "Error. Incorrect value.";
                return;
            }

        int power = 1;
        int number = 0;
        int pos;

        for (int i=0; i<str8.length(); i++) {
            if (i==0)
                power = 1;
            else
                power = power*8;

            pos = str8.length()-i-1;

            number = number + (str8.charAt(pos)-'0')*power;
        }

        str10 = "";
        while (number > 0) {
            str10 = (number % 10) + str10;
            number = number / 10;
        }
    }

    public String GetResult() {
        return str10;
    }
}

class Director {
    void Construct(Builder builder) {
        builder.Convert("100010");
    }
    void Construct2(Builder builder) {
        builder.Convert("770");
    }
}

public class TestBuilder {
    public static void main(String[] args) {
        Convert_2_to_10 obj1 = new Convert_2_to_10();

        Director D = new Director();
        D.Construct(obj1);

        String res = obj1.GetResult();
        System.out.println("res_2 = " + res);

        // ----------------------------------------------------------------

        Builder obj2 = new Convert_8_to_10();

        D.Construct2(obj2);

        String res2 = obj2.GetResult();
        System.out.println("res_8 = " + res2);
    }
}