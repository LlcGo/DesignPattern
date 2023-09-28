package com.Design;

import com.Design.builder.Builder;
import com.Design.builder.FatPerson;

/**
 * @Author Lc
 * @Date 2023/9/19
 * @PackageName: com.Design.builder
 * @ClassName: Diector
 * @Description:
 */

public class Director {

    public Director(FatPerson fatPerson){
        fatPerson.body();
        fatPerson.head();
        fatPerson.leg();
    }

}
