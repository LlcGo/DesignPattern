package com.Design.builder;

import java.util.Date;

/**
 * @Author Lc
 * @Date 2023/9/19
 * @PackageName: com.Design.builder
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        FatPerson fatPerson = new FatPerson();
        new Director(fatPerson);
    }
}
