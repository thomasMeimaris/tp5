package question3;

public class LeafExpression implements Expression {

    private Integer value;

    public int getValue(){
        return this.value;
    }

    public LeafExpression(Integer value){
        this.value = value;
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return (T) v.visit(this);
    }
}
