package progress_241109;

public class Overloading2 {
    public static void main(String[] args) {
    myMethod(1,1.5);
    myMethod(1.5,1);
    }

    public  static void myMethod(int a, double b) {
        System.out.println("int a : " + a + ", double b : " + b);

    }

    public static void myMethod(double a, int b) {
        System.out.println("double a : " + a + ", int b : " + b);

    }
}