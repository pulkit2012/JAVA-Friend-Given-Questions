package vesehi4;

import java.util.Scanner;

public class Player {
    String Name;
    int score;

    public Player(String name, int score) {
        Name = name;
        this.score = score;
    }
}
class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        Player[] arr = new Player[a];
        for (int i = 0; i < a; i++) {
            arr[i] = new Player(in.nextLine(),in.nextInt());
        }
    }
}
