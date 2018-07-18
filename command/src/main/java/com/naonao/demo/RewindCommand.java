package com.naonao.demo;

/**
 * @author HuangHaodong
 * @create 2018-07-17 6:48 PM
 **/
public class RewindCommand implements Command {

    private AudioPlayer audioPlayer;

    RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
