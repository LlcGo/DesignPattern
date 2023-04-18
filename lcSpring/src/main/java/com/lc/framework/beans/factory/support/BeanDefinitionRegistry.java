package com.lc.framework.beans.factory.support;

import com.lc.framework.beans.BeanDefinition;

/**
 * 注册表对象
 */
public interface BeanDefinitionRegistry {
   //注册BeanDefinition对象注册到注册表中
   void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

   //注册表中删除指定BeanDefinition对象
   void removeBeanDefinition(String beanName) throws Exception;

   //根据名称从注册表中获取BeanDefinition
    BeanDefinition getBeanDefinition(String beanName) throws  Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();

}
