import java.util.ArrayList;
import java.util.Collections;

public class Teisendamine {
    static void toBinary(int number) {
        ArrayList<Integer> binaryNum = new ArrayList<Integer>();
        while (number > 0) {
            int remainder = number % 2;
            binaryNum.add(remainder);
            number = number / 2;
        }
        Collections.reverse(binaryNum);
        System.out.println("Kahendsüsteemi arv: " + binaryNum);
    }

    static void toOctal(int number) {
        ArrayList<Integer> octalNum = new ArrayList<Integer>();
        while (number > 0) {
            int remainder;
            remainder = number % 8;
            octalNum.add(remainder);
            number = number / 8;
        }
        Collections.reverse(octalNum);
        System.out.println("Kaheksandssüsteemi arv: " + octalNum);
    }

    static void toHex(int number) {
        ArrayList<Character> hexNum = new ArrayList<Character>();
        int remainder;
        char hexSys[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(number > 0) {
            remainder = number % 16;
            hexNum.add(hexSys[remainder]);
            number= number / 16;
        }
        Collections.reverse(hexNum);
        System.out.println("Kuueteistkümnendsüsteemi arv: " + hexNum);
    }

    static void binToDecimal(String number){
        String decimal = "Kahendsüsteemist kümnendsüsteemi: " + Integer.parseInt(number, 2);
        System.out.println(decimal);
    }

    static void octToDecimal(String number) {
        String decimal = "Kaheksandsüsteemist kümnendsüsteemi: " + Integer.parseInt(number, 8);
        System.out.println(decimal);
    }

    static void hexToDecimal(String number) {
        String decimal = "Kuueteistkümnendsüsteemist kümnendsüsteemi: " + Integer.parseInt(number, 16);
        System.out.println(decimal);
    }

    static void binToOctal(String number) {
        int decimal = Integer.parseInt(number, 2);
        toOctal(decimal);
    }
    static void binToHex(String number) {
        int decimal = Integer.parseInt(number, 2);
        toHex(decimal);
    }
    static void octToBinary(String number) {
        int decimal = Integer.parseInt(number, 8);
        toBinary(decimal);
    }
    static void octToHex(String number) {
        int decimal = Integer.parseInt(number, 8);
        toHex(decimal);
    }
    static void hexToBinary(String number){
        int decimal = Integer.parseInt(number, 16);
        toBinary(decimal);
    }
    static void hexToOctal(String number){
        int decimal = Integer.parseInt(number, 16);
        toOctal(decimal);
    }

}

/*
Teisendamine

        * Luua klass, kus oleksid funktsioonid teisendada arv kümnendsüsteemist kahendsüsteemi, kaheksandsüsteemi, kuueteistkümnendsüsteemi
        * Samuti tagasi nendest
        * Omavahel ka nt kümnendsüsteemist kuueteistkümnendsüsteemi, kaheksandsüsteemist kümnendsüsteemi jne (kõik seosed)

 */