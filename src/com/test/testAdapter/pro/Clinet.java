package com.test.testAdapter.pro;

/**
 * @Author Lc
 * @Date 2023/5/9
 * @Description
 */
public class Clinet {
    public static void main(String[] args) {
        ParamAdapter adapter = new ParamAdapter();
        Param1Impl.work(adapter);
    }
}
