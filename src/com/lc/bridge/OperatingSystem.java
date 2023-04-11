package com.lc.bridge;

/**
 * @Author Lc
 * @Date 2023/4/11
 * @Description
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    abstract void play(String fileName);

}
