package codeforces;

public class PoliceRecruits {
    public static int policeCrimes(int[] n) {
        int crime = 0;
        int police = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                if (police == 0) {
                    crime++;
                } else {
                    police--;
                }
            } else {
                police += n[i];
            }
        }
        return crime;
    }
}
