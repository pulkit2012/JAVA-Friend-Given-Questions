package vesehi3;

import java.util.Scanner;

public interface A {
    boolean isEven(int nos);
}
class test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A obj = (int nos) -> (nos % 2 == 0);
        System.out.println(obj.isEven(in.nextInt()) ? "Even" : "Odd");
    }
}
