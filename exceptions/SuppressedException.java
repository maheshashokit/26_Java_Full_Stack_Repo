package exceptions;

import java.io.IOException;

public class SuppressedException {
    
	public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
        	System.out.println("2132323232");
            System.out.println("Caught exception: " + e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable throwable : suppressed) {
				System.out.println(throwable.getMessage());
			}
        }
    }

    @SuppressWarnings("finally")
	public static void throwException() {
        try {
            throw new IOException("IOException occurred");
        }catch(Exception e) {
          System.out.println("454545454" + e.getMessage());
          //throw new NullPointerException("NullPointerException occurred");
		}
    }
}
