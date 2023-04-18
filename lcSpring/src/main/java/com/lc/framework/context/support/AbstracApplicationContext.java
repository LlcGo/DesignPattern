package com.lc.framework.context.support;

import com.lc.framework.beans.factory.support.BeanDefinitionReader;
import com.lc.framework.beans.factory.support.BeanDefinitionRegistry;
import com.lc.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Lc
 * @Date 2023/4/18
 * @Description ApplicationContext接口的子实现类 用于立即加载
 */
public abstract class AbstracApplicationContext implements ApplicationContext {
    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定义用于存储bean对象的map集合
    protected Map<String,Object> sigletonObjects = new HashMap<>();

    //声明一个变量用来记录配置文件路径的变量
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        //加载beanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        //初始化bean
        finishBeanInitialization();
    }

    //bean对象的初始化
    private void finishBeanInitialization() throws Exception{
        //获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        //获取beandefintion对象
        String[] beanNames = registry.getBeanDefinitionNames();
        //bean初始化
        for (String beanName : beanNames) {
            getBean(beanName);
        }
    }
}
