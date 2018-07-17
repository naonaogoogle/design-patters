package com.naonao.demo;

/**
 *
 * 接受者角色,由录音机扮演
 * @author HuangHaodong
 * @create 2018-07-17 6:46 PM
 **/
public class AudioPlayer {

    public void play() {
        System.out.println("播放...");
    }

    public void rewind() {
        System.out.println("倒带...");
    }

    public void stop() {
        System.out.println("停止...");
    }
}
