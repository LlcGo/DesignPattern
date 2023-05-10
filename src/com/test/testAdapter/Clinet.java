package com.test.testAdapter;

import com.test.testAdapter.pro.ParamAdapter;

/**
 * @Author Lc
 * @Date 2023/5/9
 * @Description
 */
public class Clinet {
    public static void main(String[] args) {
        Param2Impl param2 = new Param2Impl();
        ParamAdapter adapter = new ParamAdapter();
        adapter.doingThings();
    }
}
