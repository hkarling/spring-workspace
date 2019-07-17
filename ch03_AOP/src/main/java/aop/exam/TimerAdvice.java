package aop.exam;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * 공통기능 : 타겟 대상이 호출되기 전 시간과 호출된 시간을 구하여 총 소요 시간을 알아본다. - advice 종류: around
 */
@Component("advice")
@Aspect
public class TimerAdvice {
	
	@Pointcut("execution(public * aop.exam.*.*ello(..))")
	public void pointCut() { }
	
	/**
	 * @param : ProceedingJoinPoint 선언 - 타겟대상정보 + 타겟대상호출(!!)
	 * @return : Object - 타겟대상이 리턴한 값
	 */
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		// 사전처리
		String methodName = joinPoint.getSignature().getName();
		System.out.println("[LOG]" + methodName + " 호출되기 전..");
		StopWatch sw = new StopWatch();
		sw.start();
		
		// 타겟 대상의 호출
		Object obj = joinPoint.proceed();

		// 사후처리
		sw.stop();
		System.out.println("[LOG]" + methodName + "의 리턴값 : " + obj);
		System.out.println("[LOG]실행시간 : " + sw.getTotalTimeMillis() + "ms");
		System.out.println("[LOG]" + methodName + "호출 끗..");
		
		return obj;
	}
}
