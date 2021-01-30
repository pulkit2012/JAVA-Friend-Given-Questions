package Vesehi5;

import java.util.Scanner;

public class OperatorGame {
    /* static boolean operatorReturner(int index, String input) {
         boolean check = false;
         int negCount = 0;
         int posCount = 0;
         while (input.charAt(index) == '+' || input.charAt(index) == '-') {
             while (true) {
                 if (input.charAt(index) == '-') {
                     negCount++;
                     index++;
                 } else {

                     break;
                 }
             }
             while (true) {
                 if (input.charAt(index) == '+') {
                     posCount++;
                     index++;
                 }
                 else {
                     break;
                 }
             }
         }
     }*/
    static int[] opReturner(int k, String input) {
        int[] arr = new int[2];
        int counter = 0;
        if (input.charAt(k) == '+') {
            while (true) {
                if (input.charAt(k) == '+') {
                    k++;
                    counter++;
                } else {
                    break;
                }
            }
            arr[0] = counter;
        }
        else if (input.charAt(k) == '-') {
            while (true) {
                if (input.charAt(k) == '-') {
                    counter++;
                    k++;
                } else {
                    break;
                }
            }
            arr[0] = counter;
            arr[1] = (counter % 2) == 0 ? 0 : 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        int k = 0;
        int[] arr = new int[2];
        int ans = 0;
        while (k < input.length()) {
           if(input.charAt(k) == '+' || input.charAt(k) == '-'){
               arr = opReturner(k,input);
               k += arr[0];
           }
           else {
               if(arr[1] == 1){
                   ans -= Integer.parseInt(String.valueOf(input.charAt(k)));
               }
               else {
                   ans += Integer.parseInt(String.valueOf(input.charAt(k)));
               }
               k++;
           }
        }
        System.out.println(ans);
    }
}
