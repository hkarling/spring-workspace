package hkarling.test.video;

import hkarling.test.service.Player;

public class VideoImpl implements Player {

    @Override
    public void start(int i) {
        System.out.println("VideoImpl start(int i) 호출..");
    }

    @Override
    public String pause() {
        System.out.println("VideoImpl pause() 호출..");
        return "Video 리턴값!";
    }

    @Override
    public void stop() {
        System.out.println("VideoImpl stop() 호출..");
    }
}