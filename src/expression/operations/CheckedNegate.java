package expression.operations;

import expression.exceptions.OverflowException;

public class CheckedNegate implements TripleExpression {
    TripleExpression expression;

    public CheckedNegate(TripleExpression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        int val = expression.evaluate(x, y, z);
        if (val == Integer.MIN_VALUE) {
            throw new OverflowException("Negate overflow");
        }
        return -val;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return (toString()).equals(obj.toString());
    }

    public String toString() {
        return "-(" + expression.toString() + ")";
    }

    @Override
    public int hashCode() {
        return (toString()).hashCode();
    }
}
