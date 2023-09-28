package com.Design.Adapter;

/**
 * @Author Lc
 * @Date 2023/9/25
 * @PackageName: com.Design.Adapter
 * @ClassName: Foreigner
 * @Description:
 */

public class Foreigner extends FSay {
    @Override
    public void say() {
        System.out.println("get out of the way");
    }
}
