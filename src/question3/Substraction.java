package question3;

public class Substraction implements Expression {

    private Expression left;

    public Expression getLeft() {
        return this.left;
    }

    private Expression right;

    public Expression getRight() {
        return this.right;
    }

    public Substraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }


    @Override
    public <T> T accept(Visitor<T> v) {
        return (T) v.visit(this);
    }
}
