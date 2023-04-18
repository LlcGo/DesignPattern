package com.lc.builderpattern.builder.demo2;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Phone {
    private String cpu;
    private String scree;
    private String memory;
    private String minboard;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", scree='" + scree + '\'' +
                ", memory='" + memory + '\'' +
                ", minboard='" + minboard + '\'' +
                '}';
    }
   public static class Budiler{
       private String cpu;
       private String scree;
       private String memory;
       private String minboard;

       public Budiler setCpu(String cpu) {
           this.cpu = cpu;
           return this;
       }

       public Budiler scree(String scree) {
           this.scree = scree;
           return this;
       }

       public Budiler setMemory(String memory) {
           this.memory = memory;
           return this;
       }

       public Budiler setMinboard(String minboard) {
           this.minboard = minboard;
           return this;
       }

       public static Phone budile(){
           return this.;
       }
   }
}
