package vesehi3;

import java.util.Scanner;

public interface B {
    double product(int a,int b);
}
class test1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        B obj = (int a, int b) -> (a * b);
        System.out.println(obj.product(in.nextInt(),in.nextInt()));
    }
}
