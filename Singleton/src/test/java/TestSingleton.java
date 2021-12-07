class Singleton {
    private static Singleton _instance=null;
    private int a;

    protected Singleton() {
        a = 0;
    }

    public static Singleton Instance() {
        if (_instance==null) {
            _instance = new Singleton();
            return _instance;
        }
        else
            return null;
    }

    public void Set(int _a) {
        a = _a;
    }

    public int Get() { return a; }

    public void Print() {
        System.out.println("A.a = " + a);
    }
}

public class TestSingleton {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.Instance();
        if (obj1!=null) {
            obj1.Set(233);
            obj1.Print();
        }
        else
            System.out.println("obj1==null");

        Singleton obj2 = Singleton.Instance();
        if (obj2!=null) {
            obj2.Set(777);
            obj2.Print();
        }
        else
            System.out.println("obj2==null");
    }
}
