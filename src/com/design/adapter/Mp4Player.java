package com.design.adapter;

/**
 * Created by Administrator on 2018/2/22.
 */
public class Mp4Player implements AdvanceMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        //doNothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
