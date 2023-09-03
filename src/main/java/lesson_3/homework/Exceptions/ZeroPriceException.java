package lesson_3.homework.Exceptions;

import java.io.IOException;

public class ZeroPriceException extends IOException {
    public ZeroPriceException(String message) {
        super(message);
    }
}
