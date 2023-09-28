package com.Design.abstractory.one;

/**
 * @Author Lc
 * @Date 2023/9/22
 * @PackageName: com.Design.abstractory
 * @ClassName: MainGo
 * @Description:
 */

public class MainGo {
    public static void main(String[] args) {
        SqlServerUser sqlServerUser = new SqlServerUser();
        sqlServerUser.getUserInfo(1);
    }
}
