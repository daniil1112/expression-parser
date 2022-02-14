package expression.operations;

public class CheckedRightZero implements TripleExpression {
    TripleExpression expression;

    public CheckedRightZero(TripleExpression expression) {
        this.expression = expression;
    }

    private int count(int val) {
        int res = 0;
        for (int i = 0; i <= 31; i++) {
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
        return "t0(" + expression.toString() + ")";
    }
}
