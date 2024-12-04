package com.lessons.strings;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(reverse("Hello world!"));
        System.out.println(reverse1("Hello world!"));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse1(String str) {
        char[] chars = str.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        return new String(reversed);
    }
}