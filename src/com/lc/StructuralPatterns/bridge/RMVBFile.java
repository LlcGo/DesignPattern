package com.lc.StructuralPatterns.bridge;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public class RMVBFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("RMVB文件" + fileName);
    }
}
