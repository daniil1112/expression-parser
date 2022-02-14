package expression.operations;

public abstract class AbstractChecked implements TripleExpression {
    private final TripleExpression expression1, expression2;
    private final String operation;

    public AbstractChecked(TripleExpression expression1, TripleExpression expression2, String operation) {
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operation = operation;
    }

    protected abstract void checkOverflow(int val1, int val2);

    protected abstract int calculate(int val1, int val2);

    public int evaluate(int x, int y, int z) {
        int val1 = expression1.evaluate(x, y, z);
        int val2 = expression2.evaluate(x, y, z);
        checkOverflow(val1, val2);
        return calculate(val1, val2);
    }

    public String toString() {
        return "(" + expression1 + " " + operation + " " + expression2 + ")";
    }

}
