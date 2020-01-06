package hkarling.test.audio;

import hkarling.test.service.Player;

public class AudioImpl implements Player {

    @Override
    public void start(int i) {
        System.out.println("AudioImpl start(int i) 호출..");
    }

    @Override
    public String pause() {
        System.out.println("AudioImpl pause() 호출..");
        return "Audio 리턴값!";
    }

    @Override
    public void stop() {
        System.out.println("AudioImpl stop() 호출..");
    }
}
