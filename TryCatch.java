package Exceptions;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class TryCatch {

    public static void main(String[] args) throws IllegalAccessException {
        int result = 0;
        try {
            result = getValue(-1,100);
        } catch (IllegalAccessException e) {
            Logger.getLogger(TryCatch.class.getName()).log(new LogRecord(Level.WARNING,"Negative value"));
            throw e;

        }
        System.out.println("Result is : " + result);
    }

    public static int getValue(int a, int b) throws IllegalAccessException {
        if (a < 0 || b < 0) throw new IllegalAccessException("value of 'a' or 'b' is negative");
        return a * b;
    }
}