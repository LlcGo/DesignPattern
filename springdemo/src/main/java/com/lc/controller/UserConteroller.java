package com.lc.controller;

import com.lc.service.UserService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author Lc
 * @Date 2023/4/16
 * @Description
 */
public class UserConteroller {
    public static void main(String[] args) {
        //执行完直接会实例化创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //执行之后不会创建对象
        //XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //从容器中获取service
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
