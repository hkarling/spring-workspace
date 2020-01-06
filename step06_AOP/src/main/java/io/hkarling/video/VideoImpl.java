package io.hkarling.video;

import io.hkarling.service.Player;
import org.springframework.stereotype.Component;

@Component("target3")
public class VideoImpl implements Player {

	public void start(int i) {
		System.out.println("VideoImpl start(int i) 호출..");
	}

	public String pause() {
		System.out.println("VideoImpl pause() 호출..");
		return "Video 리턴값!";
	}

	public void stop() {
		System.out.println("VideoImpl stop() 호출..");		
	}
}
