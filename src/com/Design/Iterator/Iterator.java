package com.Design.Iterator;

/**
 * @Author Lc
 * @Date 2023/9/27
 * @PackageName: com.Design.Iterator
 * @ClassName: Iterator
 * @Description:
 */

public interface Iterator {

     Object first();

     Object next();

     Boolean isDone();

     Object currentItem();

}
