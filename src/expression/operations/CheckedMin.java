package expression.operations;

public class CheckedMin extends AbstractChecked {
    public CheckedMin(TripleExpression exp1, TripleExpression exp2) {
        super(exp1, exp2, "min");
    }

    @Override
    protected void checkOverflow(int val1, int val2) {
    }

    @Override
    protected int calculate(int val1, int val2) {
        return Math.min(val1, val2);
    }
}
