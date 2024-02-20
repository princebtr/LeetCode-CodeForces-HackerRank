package codeforces;

import java.util.Scanner;

public class BlackSquare {
    public static int blackSq(int[] arr , String s){
        int calories = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - '0' - 1;
            calories += arr[index];
        }
        return calories;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        System.out.println(blackSq(arr,s));
    }
}
