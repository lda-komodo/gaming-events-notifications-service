package pro.kmdo.gamenotification.adapter.kafka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;

@Aspect
public class ListenersLoggingAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(ListenersLoggingAspect.class);
	
	@Around("execution(* pro.kmdo.gamenotification.adapter.kafka.GamingEventsListener.handle*(..)) && args(event)")
	public Object logEvent(ProceedingJoinPoint proceedingJoinPoint, BaseGamingEvent<?> event) throws Throwable {
		logger.info("Entering method: {} with arguments: {}", proceedingJoinPoint.getSignature(), proceedingJoinPoint.getArgs());
		return proceedingJoinPoint.proceed();
	}
}


