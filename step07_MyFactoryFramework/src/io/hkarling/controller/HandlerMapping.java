package io.hkarling.controller;

/**
 * 사용자 요청에 해당하는 Controller를 찾아주는 객체
 * 싱글톤
 */
public class HandlerMapping {
	
	private static HandlerMapping factory = new HandlerMapping();
	
	private HandlerMapping() { }
		
	public static HandlerMapping getFactory() {
		return factory;
	}

	public Controller creteController(String key) {
		Controller controller = null;
		if (key.equals("insert")) {
			controller = new InsertController();
		} else if (key.equals("select")) {
			controller = new SelectController();
		} else if (key.equals("update")) {
			controller = new UpdateController();
		} else if (key.equals("delete")) {
			controller = new DeleteController();
		}
		return controller;
	}
}
