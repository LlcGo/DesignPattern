package com.lc.framework.context.support;

import com.lc.framework.beans.BeanDefinition;
import com.lc.framework.beans.MutablePropertyValues;
import com.lc.framework.beans.PropertyValue;
import com.lc.framework.beans.factory.support.BeanDefinitionRegistry;
import com.lc.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.lc.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @Author Lc
 * @Date 2023/4/18
 * @Description IOC容器具体的子实现类
 * 用于加载类路径下的xml格式的配置文件
 */
public class ClassPathXmlApplicationContext extends AbstracApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
       this.configLocation = configLocation;
        //构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try{
            this.refresh();
        }catch (Exception e){

        }
    }

    //根据bean对象的名称获取bean对象
    @Override
    public Object getBean(String name) throws Exception {
        //判断对象容器中是否包含指定名称的bean对象如果包含直接返回
        //如果不包含需要自行创建
        Object o = sigletonObjects.get(name);
        if(o!=null){
            return o;
        }
        //获取beandefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        //获取bean信息中的classname
        String className = beanDefinition.getClassName();
        //通过反射创建对象
        //获取字节码
        Class<?> clazz = Class.forName(className);
        //获取对象
        Object beanObj = clazz.newInstance();

        //进行依赖注入操作
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            //获取name属性值
            String propertyName = propertyValue.getName();
            //获取value属性
            String value = propertyValue.getValue();
            //获取ref属性
            String ref = propertyValue.getRef();
            if(ref != null && !"".equals(ref)){
                //获取依赖的bean对象
                Object bean = getBean(ref);
                //拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                //获取所有的方法对象1
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if(methodName.equals(method.getName())){
                        //执行该set方法
                        method.invoke(beanObj,bean);
                    }
                }
            }
            if(value != null && !"".equals(value)){
                //拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj,value);
            }
        }

        //再返回对象之前将该对象放入map容器中
        sigletonObjects.put(name,beanObj);
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) {
        Object bean = null;
        try {
            bean = getBean(name);
            if(bean == null){
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clazz.cast(bean);
    }
}
