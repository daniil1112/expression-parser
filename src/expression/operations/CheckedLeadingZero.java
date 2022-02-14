package expression.operations;

public class CheckedLeadingZero implements TripleExpression {
    TripleExpression expression;

    public CheckedLeadingZero(TripleExpression expression) {
        this.expression = expression;
    }

    private int count(int val) {
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if (((val >> i) & 1) == 0) {
                res++;
            } else {
                break;
            }
        }
        return res;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return count(expression.evaluate(x, y, z));
    }

    @Override
    public String toString() {
        return "l0(" + expression.toString() + ")";
    }
}
