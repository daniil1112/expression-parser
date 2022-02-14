package expression.exceptions;

import expression.exceptions.ArithmeticException;

public class DivisionOnZero extends ArithmeticException {
    public DivisionOnZero(String message) {
        super(message);
    }
}
