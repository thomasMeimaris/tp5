package question2;

public class Substraction implements Expression {

    private Expression left, right;

    public Substraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return left.interpreter() - right.interpreter();
    }
}
