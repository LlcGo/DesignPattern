package com.lc.StructuralPatterns.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description 获取代理对象的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation trainStation = new TrainStation();

    //获取代理对象的方法
    public SellTickets getProxyObject(){
        //返回代理对象即可
        /**
         * ClassLoader loader : 类加载器 ，用于加载代理类。可以通过目标对象获得类加载器
         * Class<?>[] interfaces ： 代理类实现的接口的字节码对象
         * InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets proxyInstance = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理对象 和proxyObject对象是同一个对象，在这个方法中基本不用
                     * @param method 对接口中的方法进行封装的method对象
                     * @param args 调用方法的实际参数
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke方法执行了");
                        System.out.println("代售点收取一定的服务费用 jdk 动态代理");
                        //执行目标对象的方法
                        Object obj= method.invoke(trainStation, args);
                        return obj;
            }
        });
        return proxyInstance;
    }
}
