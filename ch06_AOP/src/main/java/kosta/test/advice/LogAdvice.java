package kosta.test.advice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component("advice")
@Aspect
public class LogAdvice {
    Log log = LogFactory.getLog(this.getClass());

    @Around("execution(* kosta.test.*.*Impl.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
	String methodName = joinPoint.getSignature().getName();
	int args = joinPoint.getArgs().length;
	StopWatch sw = new StopWatch();
	sw.start();

	Object obj = joinPoint.proceed();

	sw.stop();
	log.info(methodName + " 호출 / 인수 갯수 : " + args + " 개 / 리턴값 : " + obj + " / 총 실행시간 : " + sw.getTotalTimeMillis()
		+ "ms");
	return obj;
    }
}
