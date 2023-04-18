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

    private Phone(Budiler budiler) {
        this.cpu = budiler.cpu;
        this.scree = budiler.scree;
        this.memory = budiler.memory;
        this.minboard = budiler.minboard;
    }

    public static final class Budiler{
       private String cpu;
       private String scree;
       private String memory;
       private String minboard;

       public Budiler cpu(String cpu) {
           this.cpu = cpu;
           return this;
       }

       public Budiler scree(String scree) {
           this.scree = scree;
           return this;
       }

       public Budiler memory(String memory) {
           this.memory = memory;
           return this;
       }

       public Budiler minboard(String minboard) {
           this.minboard = minboard;
           return this;
       }

       public  Phone budile(){
           return new Phone(this);
       }
   }
}
