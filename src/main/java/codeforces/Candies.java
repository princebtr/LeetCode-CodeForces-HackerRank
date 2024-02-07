package codeforces;

public class Candies {
    public static int candies(int n, int m) {
        int c = n / m, d = n % m;
        int result = 0;
        for (int i = 0; i < m - d; i++) {
            result += c;
        }
        for (int j = 0; j < d; j++) {
            result += c + 1;
        }
        return result;
    }
}

/*
main
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(candies(n,m));
    }
 */
