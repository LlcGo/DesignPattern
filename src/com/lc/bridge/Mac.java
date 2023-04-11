package com.lc.bridge;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
    }
}
