package codeforces;

public class Drinks {
    public static float drinkcalculator(int[] drink) {
        int len = drink.length, sum = 0, total = len * 100;
        for (int i = 0; i < len; i++) {
            sum += drink[i];
        }
        return (float) sum / len;
    }
}

/* Main
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] drink = new int[len];
        for(int i=0;i<len;i++){
            drink[i] = sc.nextInt();
        }
        System.out.println(drinkcalculator(drink));
    }
/*
