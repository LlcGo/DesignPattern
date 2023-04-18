package com.lc.framework.beans.factory.xml;

import com.lc.framework.beans.BeanDefinition;
import com.lc.framework.beans.MutablePropertyValues;
import com.lc.framework.beans.PropertyValue;
import com.lc.framework.beans.factory.support.BeanDefinitionReader;
import com.lc.framework.beans.factory.support.BeanDefinitionRegistry;
import com.lc.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/4/18
 * @Description 针对xml配置文件进行解析的类
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    //申明注册表
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        //使用dom4j解析xml
        SAXReader reader = new SAXReader();
        //获取类路径下的配置文件
        InputStream resourceAsStream = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(resourceAsStream);
        //根据document获取跟标签对象
        Element rootElement = document.getRootElement();
        //获取跟标签下的所有bean标签对象
        List<Element> beanElement = rootElement.elements("bean");
        //遍历集合
        for (Element element : beanElement) {
            //获取id属性
            String id = element.attributeValue("id");
            //获取class属性
            String className = element.attributeValue("class");
            //将id属性和class属性封装到BeanDefinition对象
            //创建beanDefinition
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            //创建容器
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();

            //获取bean标签下的所有的property标签对象
            List<Element> propertyElemts = element.elements("property");
            for (Element propertyElemt : propertyElemts) {
                String name = propertyElemt.attributeValue("name");
                String ref = propertyElemt.attributeValue("ref");
                String value = propertyElemt.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name,ref,value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            //将MutablePropertyValues封装到注册表中
            beanDefinition.setPropertyValues(mutablePropertyValues);
            //将beanDefinition注册到注册表中
            registry.registerBeanDefinition(id,beanDefinition);
        }
    }
}
