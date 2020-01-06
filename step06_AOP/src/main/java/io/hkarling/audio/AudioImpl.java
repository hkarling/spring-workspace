package io.hkarling.audio;

import io.hkarling.service.Player;
import org.springframework.stereotype.Component;

@Component("target1")
public class AudioImpl implements Player {

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
