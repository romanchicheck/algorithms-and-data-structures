package com.pandazilla.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class ChapterOne {

    public static void main(String[] args) {
        //testUniqueCharAlg();
        //testStringPermutation();
        //replaceAllSpaces();
        //palindromePermutation();
        //oneAway();
        compression();
    }

    public static void testUniqueCharAlg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your string: ");
        String input = scanner.nextLine();
        UniqueCharAlg uniqueCharAlg = new UniqueCharAlg();
        System.out.println("Result: " + uniqueCharAlg.isUniqueChar(input));
    }

    public static void testStringPermutation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Input your second string: ");
        String str2 = scanner.nextLine();
        StringPermutation permutation = new StringPermutation();
        System.out.println("Result: " + permutation.isPermutation(str1, str2));
    }

    public static void replaceAllSpaces() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your string: ");
        String str = scanner.nextLine();
        System.out.print("Input the real string length: ");
        int length = scanner.nextInt();
        ReplaceAllSpaces replaceAllSpaces = new ReplaceAllSpaces();
        System.out.print("Result: " + replaceAllSpaces.replaceAllSpaces(str, length));
    }

    public static void palindromePermutation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your palindrome: ");
        String palindrome = scanner.nextLine();
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        System.out.println("Result: " + palindromePermutation.isPalindromePermutation(palindrome));
    }

    public static void oneAway() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your existing string: ");
        String existing = scanner.nextLine();
        System.out.println("Enter string which is modified: ");
        String modified = scanner.nextLine();
        OneAway oneAway = new OneAway();
        System.out.println("Result: " + oneAway.isStringModified(existing, modified));
    }

    public static void compression() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scanner.nextLine();
        StringCompression compression = new StringCompression();
        System.out.println("Result: " + compression.compression(str));
    }
}
