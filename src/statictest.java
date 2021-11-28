import java.util.Scanner;
class staticclasses {
    static int s; // static variable
    static void met(int a, int b) { // static method
        System.out.println("static method to calculate sum");
        s = a + b;
        System.out.println(a + "+" + b); // print two numbers
    }
    static class MyNestedClass { // static class
        static { // static block
            System.out.println("static block inside a static class");
        }
        public void disp() {
            int c, d;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two values");
            c = sc.nextInt();
            d = sc.nextInt();
            met(c, d); // calling static method
            System.out.println("Sum of two numbers=" + s); // print the result in static variable
        }
    }
}
public class statictest {
    public static void main(String args[]) {
        staticclasses.MyNestedClass mnc = new staticclasses.MyNestedClass(); // object for static class
        mnc.disp(); // accessing methods inside a static class
    }
}