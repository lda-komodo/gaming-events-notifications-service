package pro.komodo.codechallenges.gamingeventsnotificationsservice.adapter.kafka;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pro.komodo.codechallenges.gamingeventsnotificationsservice.domain.model.event.LevelUpEventPayload;

@Component
public class GamingPlatformEventsListener {

    private static final Logger logger = LoggerFactory.getLogger(GamingPlatformEventsListener.class);

    @KafkaListener(
            topicPattern = "gaming.*")
    public void handleEvent(@Payload @Valid LevelUpEventPayload event) {
        logger.info("Event received: {}", event);
    }
}
