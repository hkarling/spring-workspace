package kosta.test.tv;

import org.springframework.stereotype.Component;

import kosta.test.service.Player;

@Component("target2")
public class TvImpl implements Player {

	public void start(int i) {
		System.out.println("TvImpl start(int i) 호출..");
	}

	public String pause() {
		System.out.println("TvImpl pause() 호출..");
		return "TV 리턴값!";
	}

	public void stop() {
		System.out.println("TvImpl stop() 호출..");
	}
}
