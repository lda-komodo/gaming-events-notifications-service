package pro.kmdo.game.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pro.kmdo.game.notification.adapter.kafka.ListenersLoggingAspect;

@Configuration
@EnableAspectJAutoProxy
public class GameEventsNotificationsAppConfig {

    @Bean
    public ListenersLoggingAspect listenersLoggingAspect() {
        // Configure properties of the aspect here
        return new ListenersLoggingAspect();
    }


}