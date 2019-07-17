package ch04_Log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogService {
	//Log log = LogFactory.getLog(LogService.class);
	Log log = LogFactory.getLog(this.getClass());
	
	public void loggingTest() {
		//log기록
		log.trace("trace 관련된 메시지입니다.");
		log.debug("debug 관련된 메시지입니다.");
		log.info("info 관련된 메시지입니다.");
		log.warn("warn 관련된 메시지입니다.");
		log.error("error 관련된 메시지입니다.");
		log.fatal("fatal 관련된 메시지입니다.");
	}
	
	public static void main(String[] args) {
		LogService service = new LogService();
		service.loggingTest();
	}
}
