package com.lc.interpreter;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description
 */
public class Plus extends AbstractExpression{
    //加号左边
    private AbstractExpression left;
    //加号右边
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "+" + right.toString() + ")";
    }

    @Override
    public int interpert(Context context) {
        //左加右
        return left.interpert(context) + right.interpert(context);
    }
}
