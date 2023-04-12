package com.lc.StructuralPatterns.bridge;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Windows(new AVIFile());
        operatingSystem.play("来看电影");
        OperatingSystem operatingSystem1 = new Mac(new RMVBFile());
        operatingSystem1.play("来看电影");
    }
}
