package com.lc.behavioralPattern.interpreter;

/**
 * @Author Lc
 * @Date 2023/4/15
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //创建环境变量
        Context context = new Context();

        //创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        //变量存储到环境变量中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //获取抽象语法树 b - c + d - a
        AbstractExpression expression = new Minus(a,new Plus(new Minus(b,c),d));
        //解释计算
        int result = expression.interpert(context);
        System.out.println(expression + "=" + result);
    }
}
