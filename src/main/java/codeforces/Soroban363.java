package codeforces;

public class Soroban363 {
    public static void soroban(int num) {
        if (num == 0) {
            System.out.println("O-|-OOOO");
        }
        String[] sorobanarray = {"O-|-OOOO", "O-|O-OOO", "O-|OO-OO", "O-|OOO-O", "O-|OOOO-", "-O|-OOOO", "-O|O-OOO", "-O|OO-OO", "-O|OOO-O", "-O|OOOO-"};
        while (num > 0) {
            int rem = num % 10;
            System.out.println(sorobanarray[rem]);
            num /= 10;
        }
    }
}
