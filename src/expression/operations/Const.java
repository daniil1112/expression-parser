package expression.operations;

public class Const implements TripleExpression {
    int value;

    public Const(int x) {
        value = x;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return value;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return value == ((Const) obj).value;
    }

    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {
        return value;
    }

    public String toMiniString() {
        return String.valueOf(value);
    }
}
