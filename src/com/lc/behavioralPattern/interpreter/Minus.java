package com.lc.behavioralPattern.interpreter;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description
 */
public class Minus extends AbstractExpression{
    AbstractExpression left;
    AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
       return  "(" + left.toString() + "-" + right.toString() + ")";
    }

    @Override
    public int interpert(Context context) {
       return left.interpert(context) - right.interpert(context);
    }

}
