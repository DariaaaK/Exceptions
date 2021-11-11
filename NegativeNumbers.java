package Exceptions;

public class NegativeNumbers {
    public static void main(String[] args) throws IllegalAccessException {

        System.out.println(getValue(-1,100));

    }
    public static int getValue(int a, int b) throws IllegalAccessException {
        if (a < 0 || b < 0) throw new IllegalAccessException("value of 'a' or 'b' is negative");
        return a * b;
    }
}
