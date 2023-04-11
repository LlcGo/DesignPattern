package com.lc.builderpattern.builder.demo2;

/**
 * @Author Lc
 * @Date 2023/4/10
 * @Description
 */
public class Phone {
    private String cpu;
    private String scree;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", scree='" + scree + '\'' +
                ", memory='" + memory + '\'' +
                ", minboard='" + minboard + '\'' +
                '}';
    }

    private String memory;
    private String minboard;

    //私有构造方法
    private Phone(Budiler budiler){
        this.cpu = budiler.cpu;
        this.scree = budiler.scree;
        this.memory = budiler.memory;
        this.minboard = budiler.minboard;
    };

    public static final class Budiler{
        private String cpu;
        private String scree;
        private String memory;
        private String minboard;

        public Budiler cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Budiler scree(String scree){
            this.scree = scree;
            return this;
        }

        public Budiler memory(String memory){
            this.memory = memory;
            return this;
        }

        public Budiler minboard(String minboard){
            this.minboard = minboard;
            return this;
        }
        //使用构建者创建phone
          public  Phone budile(){
           return new Phone(this);
          }
    }
}
