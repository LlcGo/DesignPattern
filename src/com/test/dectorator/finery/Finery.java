package com.test.dectorator.finery;

import com.test.dectorator.service.ICharacter;

/**
 * @Author Lc
 * @Date 2023/9/13
 * @PackageName: com.test.dectorator.finery
 * @ClassName: Finery
 * @Description:
 */
//服饰类
public class Finery implements ICharacter {

    //装饰的接口
    protected ICharacter iCharacter;

    //传入装饰的东西
    public void decorate(ICharacter iCharacter){
        this.iCharacter = iCharacter;
    }


    @Override
    public void show() {
        if(this.iCharacter != null){
            //调用传入的接口的方法
            this.iCharacter.show();
        }
    }
}
