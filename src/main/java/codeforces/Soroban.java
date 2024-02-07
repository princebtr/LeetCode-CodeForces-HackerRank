package codeforces;

public class Soroban {
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

/*
 main
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        soroban(num);
    }
 */
