package pro.kmdo.game.notification.adapter.kafka;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pro.kmdo.game.notification.domain.model.event.BaseGamingEvent;

@Aspect
public class ListenersLoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(ListenersLoggingAspect.class);

    @Around("execution(* pro.kmdo.game.notification.adapter.kafka.GamingEventsListener.handle*(..)) && args(event)")
    public void logEvent(BaseGamingEvent<?> event) {
        logger.info("Event received: {}", event);
    }
}