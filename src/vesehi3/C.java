package vesehi3;

import java.util.Scanner;

public interface C {
    int sumOfArray(int[] arr);
}
class test2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length");
        int a = in.nextInt();
        in.nextLine();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        C obj = (int[] ar) -> {
            int d = 0;
            for(int b : ar){
               d += b;
            }
            return d;
        };
        System.out.println(obj.sumOfArray(arr));
    }
}
