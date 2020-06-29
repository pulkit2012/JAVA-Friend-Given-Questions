package vesehi3;

import java.util.Scanner;

public interface D {
    void show(int a,double b);
}
class test3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        D obj = (int a, double b) -> System.out.println("int -> " + a + " , double -> " + b);
        obj.show(in.nextInt(),in.nextDouble());
    }
}
