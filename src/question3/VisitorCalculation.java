package question3;

public class VisitorCalculation extends Visitor<Integer> {


    @Override
    public Integer visit(LeafExpression n) {
        return n.getValue();
    }

    @Override
    public Integer visit(Substraction s) {
        return s.getLeft().accept(this) - s.getRight().accept(this);
    }
}
