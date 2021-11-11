package Exceptions;

public class TryCatchFinally {

    static void partOne() {

        try {
            System.out.println("inside partOne");
            throw new RuntimeException("test");
        } finally {
            System.out.println("partOne finally");
        }
    }

    static void partTwo() {

        try {
            System.out.println("inside partTwo");
            return;
        } finally {
            System.out.println("partTwo finally");
        }
    }

    public static void main(String[] args) {

        try {
            partOne();
        } catch (Exception e) {
        }
        partTwo();
    }

}