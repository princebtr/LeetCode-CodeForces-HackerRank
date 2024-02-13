package codeforces;

import java.util.Scanner;

public class PasswordCheck {
    public static String Password(String pass) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean lengthFive = false;

        if (pass.length() >= 5) {
            lengthFive = true;
        }
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        if (lengthFive && hasLowercase && hasDigit && hasUppercase) {
            return "Correct";
        }
        return "Too weak";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        System.out.println(Password(pass));
    }
}
