package com.lc.framework.beans.factory.support;

import com.lc.framework.beans.factory.support.BeanDefinitionRegistry;

/**
 * 定义规范，具体由于子类实现 解析配置文件
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();
    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
