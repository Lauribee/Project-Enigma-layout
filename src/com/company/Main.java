package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice1 = "Number cipher";
        String choice2 = "Caesar cipher";
        String choice3 = "Vigenère cipher";

        while(true) {
            System.out.println("Welcome to the Enigma project!");
            System.out.println("Please, select one of the following crypting methods: ");
            System.out.println("\n   1) "+ choice1);
            System.out.println("   2) " + choice2);
            System.out.println("   3) " + choice3);
            System.out.println("   0) terminate program");
            System.out.print("choose (0-3): ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("You have selected choice number one: " + choice1);
            } else if (choice == 2) {
                System.out.println("You have selected choice number two: " + choice2);
            } else if (choice == 3) {
                System.out.println("You have selected choice number three: " + choice3);
            } else if (choice == 0) {
                System.out.println("You have chosen to exit the program.\nGoodbye!");
                System.exit(0);
            }

            System.out.println("Now choose one of the following options: ");
            System.out.println("enter e to encrypt" + "\nor\n" + "enter d to decrypt");
            char enteredLetter = scanner.nextLine().charAt(0);

            if (choice == 1 || enteredLetter == 'e') {
                encryptNumberMenu();
            } else if (choice == 1 || enteredLetter == 'd') {
                decryptNumberMenu();
            } else if (choice == 2 || enteredLetter == 'e') {
                encryptCaesarMenu();
            } else if (choice == 2 || enteredLetter == 'd') {
                decryptCaesarMenu();
            } else if (choice == 3 || enteredLetter == 'e') {
                encryptVigenereMenu();
            } else if (choice == 3 || enteredLetter == 'd') {
                decryptVigenereMenu();
            }
        }

    }

    // UI methods ...

    // NumberCipher
    public static void encryptNumberMenu() {
        String textToEncrypt;
        int[] encryptedText;

        System.out.println("Please insert the text you wish to encode:");
        Scanner scanner = new Scanner(System.in);
        textToEncrypt = scanner.next();

        encryptedText = textToListOfNumbers(textToEncrypt);
        System.out.println("Your encrypted text is:\n" + encryptedText);
    }

    public static void decryptNumberMenu() {
        int[] numbersToDecode;
        String decodedNumbers;

        System.out.println("Please insert the list of numbers you wish to decode:");
        Scanner scanner = new Scanner(System.in);
        numbersToDecode = scanner.nextInt();

        decodedNumbers = listOfNumbersToText(numbersToDecode);

    }

    public static String listOfNumbersToText( int[] numbers ) {
        String text = "";
        for( int i=0; i < numbers.length; i++) {
            int number = numbers[i];

            char letter = numberToLetter(number);

            text = text + letter;
        }
        return text;
    }

    public static char numberToLetter( int number ) {
        String theAlphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        char letter = theAlphabet.charAt(number);

        return letter;
    }

    public static int[] textToListOfNumbers( String text ) {
        int[] list = new int[text.length()];

        int[] numbers = new int[text.length()];
        char[] letters = text.toCharArray();

        for(int i=0; i < letters.length; i++){
            numbers[i] = letterToNumber( letters[i] );
        }
        return numbers;
    }

    public static int letterToNumber( char letter ) {
        String theAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int num = theAlphabet.indexOf( letter +1);

        return num;
    }

    // CaesarCipher
    public static void decryptCaesarMenu() {
        String sentenceToDecrypt;
        int shift;
        String ciphertext;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the cypher code you wish to decrypt down below:\n");
        sentenceToDecrypt = scanner.next();

        System.out.println("Now please, insert the shifting number used to encrypt this text:");
        shift = scanner.nextInt();

        ciphertext = caesarDecrypt(sentenceToDecrypt, shift);
        System.out.println("Your decrypted text is:\n" + ciphertext);


        // beder brugeren om ciphertext
        // beder brugeren om shift-værdi
        // kalder caesarDecrypt med ciphertext og shift-værdi
        // udskriver plaintext modtaget fra ovenstående
    }

    public static void encryptCaesarMenu() {
        String sentenceToEncrypt;
        int shift;
        String ciphertext;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the sentence(s) you wish to encrypt down below:\n");
        sentenceToEncrypt = scanner.next();

        System.out.println("Now please, insert the shifting number the text is to be encrypted with:");
        shift = scanner.nextInt();

        ciphertext = caesarEncrypt(sentenceToEncrypt, shift);
        System.out.println("Your ciphered text is:\n" + ciphertext);

        //beder brugeren om ciphertext
        //beder brugeren om shift-værdi
        //kalder caesarEncrypt med ciphertext og shift-værdi
        //udskriver text modtaget fra overstående
    }

    public static String caesarDecrypt( String ciphertext, int shift ) {
        //textToListOfNumbers
        // shiftListOfNumbers
        // listOfNumbersToText
    }

    public static int[] shiftListOfNumbers( int[] numbers, int shift ) {
        // kald shiftNumber for hvert tal i numbers
        // - men ikke mellemrum!
    }

    public static int shiftNumber( int number, int shift ) {


        /*
       A->D 3
       Å->A 1
       Å->B 2
       Å->C 3

       {1,2,5,0,11,1,20}
       {4,5,8,0,14,4,23}

         */

    }

    public static String caesarEncrypt( String plaintext, int shift ) {
        textToListOfNumbers(plaintext);
        // shiftListOfNumbers
        // listOfNumbersToText
    }

    //VigenèreCipher
    public static void encryptVigenereMenu(){

    }

    public static void decryptVigenereMenu(){

    }
}

