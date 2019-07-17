package kosta.test.audio;

import org.springframework.stereotype.Component;

import kosta.test.service.Player;

@Component("target1")
public class AudioImpl implements Player{

	public void start(int i) {
		System.out.println("AudioImpl start(int i) 호출..");
	}

	public String pause() {
		System.out.println("AudioImpl pause() 호출..");
		return "Audio 리턴값!";
	}
	public void stop() {
		System.out.println("AudioImpl stop() 호출..");		
	}
}
