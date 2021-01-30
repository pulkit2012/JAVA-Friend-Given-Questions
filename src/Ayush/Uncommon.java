package Ayush;

import java.util.HashSet;

public class Uncommon {
    static int returner(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        int sum = 0;
        for (int c : set1) {
            if (!set2.contains(c)) {
                sum += c;
            }
        }
        for (int c : set2) {
            if (!set1.contains(c)) {
                sum += c;
            }
        }
        return sum % 9 == 0 ? 9 : sum % 9;
    }

    public static void main(String[] args) {
        int[] arr1 = {123, 45, 7890, 67, 2, 90};
        int[] arr2 = {45, 7890, 123};
        System.out.println(returner(arr1, arr2));
    }
}
