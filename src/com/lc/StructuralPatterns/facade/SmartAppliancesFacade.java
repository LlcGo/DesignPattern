package com.lc.StructuralPatterns.facade;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public class SmartAppliancesFacade {
      private Light light;
      private TV tv;
      private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message){
       if(message.equals("打开")){
           on();
       }else if(message.equals("关闭")){
           off();
       }
    }

   private void on(){
        light.on();
        tv.on();
        airCondition.on();
    };

   private void off(){
        light.off();
        tv.off();
        airCondition.off();
    };

}
