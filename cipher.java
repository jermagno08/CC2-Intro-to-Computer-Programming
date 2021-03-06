import java.util.Scanner;

public class cipher {

    public static final String UPPER_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final String DIGITS = "0123456789";

    public static String encrypt (String plainText, int shift) {

        String cipherText = "";

        for (int i = 0; i < plainText.length(); i++) {

            char c = plainText.charAt(i);

            String alphabet = null;

            if (UPPER_ALPHABET.indexOf(c) > -1) {
                alphabet = UPPER_ALPHABET;
            } else if (LOWER_ALPHABET.indexOf(c) > -1) {
                alphabet = LOWER_ALPHABET;
            } else if (DIGITS.indexOf(c) > -1) {
                alphabet = DIGITS;
            }

            if (alphabet != null) {
                int length = alphabet.length();

                c += shift;

                while (c > alphabet.charAt(length - 1)) {
                    c -= length;
                }
            }

            cipherText += c;
        }

        return cipherText;
    }

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String for Encryption: ");
        String plainText = input.nextLine();

        System.out.print("Enter a numeric key between 0 and 26 to create our CeasarCipher: ");
        int shift = input.nextInt();

        if (shift < 0 || shift > 26) {
            System.out.println("Pew! pew! pew!");
            System.exit(0);
        }

        System.out.println("The Encrypted Result is");
        System.out.println(encrypt(plainText, shift));
    } 
}