package Exceptions;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Throws {

    public static void main(String[] args) throws MyException {

        int result = 0;

        try {
            result = getAreaValue(-1,100);
        } catch (IllegalAccessException e) {
            Logger.getLogger(Throws.class.getName()).log(new LogRecord(Level.WARNING,"Negative value!"));
            throw new MyException(e);

        }

        System.out.println( "Result is : " + result);

    }
    public static int getAreaValue (int a, int b) throws IllegalAccessException {
        if (a < 0 || b < 0) throw new IllegalAccessException("value of 'a' or 'b' is negative");
        return a * b;
    }
}