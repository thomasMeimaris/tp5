package question3;

public abstract class Visitor<T> {

    public abstract T visit(LeafExpression n);

    public abstract T visit(Substraction s);

}
