package com.lc.behavioralPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/4/14
 * @Description
 */
public class Home {
    List<Animal> nodeList = new ArrayList<>();

    void action(Person person){
      //遍历每一个动物进行访问
        nodeList.forEach(animal -> animal.accept(person));
    }

    void add(Animal animal){
        nodeList.add(animal);
    }
}
