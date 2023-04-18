package com.lc.framework.context;

import com.lc.framework.beans.factory.BeanFactory;

public interface ApplicationContext extends BeanFactory {
    void refresh() throws Exception;
}
