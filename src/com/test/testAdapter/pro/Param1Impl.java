package com.test.testAdapter.pro;

/**
 * @Author Lc
 * @Date 2023/5/9
 * @Description
 */
public class Param1Impl implements Param1 {
    @Override
    public void doingThings() {
        System.out.println("我正在干活");
    }

    public static  void work(Param1 param1){
        System.out.println("准备开始干活");
        param1.doingThings();
        System.out.println("干完活了");
    }

}
