package com.lc.bridge;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public class AVIFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("AVI文件" + fileName);
    }
}
