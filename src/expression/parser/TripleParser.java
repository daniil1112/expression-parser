package expression.parser;

import expression.operations.TripleExpression;

public interface TripleParser {
    TripleExpression parse(String expression);
}
