package Assignment8;

import java.util.Scanner;

public class ErrorHandling {
    public static void verifyPassword(String password) throws PasswordLengthException, NoNumberException, NoSpecialCharacterException {
        int digitCount = 0, letterCount = 0, specialCharacterCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isDigit(character))
                digitCount++;
            else if (Character.isLetter(character))
                letterCount++;
            else
                specialCharacterCount++;

        }

        if (password.length() < 8)
            throw new PasswordLengthException(" : Please enter the password atleast 8 characters long\n");
        if (digitCount == 0)
            throw new NoNumberException("\n : Password should contain atleast one number");
        if (specialCharacterCount == 0)
            throw new NoSpecialCharacterException("Password should contain atleast one Special character\n");

        String username = null;
        username.equals("Aman Sachaan");
    }

    public static void main(String args[]) {

        System.out.println("Enter Password");
        System.out.println("Password Should be atleast 8 characters long, having one digit and one special character");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        try {
            verifyPassword(password);
        } catch (PasswordLengthException | NoNumberException | NoSpecialCharacterException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e + " Username is Compared to null");
        } finally {
            System.out.println("Finally block Statement");
        }
    }
}
