package pro.kmdo.game.notification.adapter.kafka;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pro.kmdo.game.notification.domain.model.event.BaseGamingEvent;
import pro.kmdo.game.notification.domain.model.event.ChallengeCompletedEventMessage;
import pro.kmdo.game.notification.domain.model.event.ItemAcquiredEventMessage;
import pro.kmdo.game.notification.domain.model.event.LevelUpEventMessage;

@Component
public class GamingEventsListener {

    private static final Logger logger = LoggerFactory.getLogger(GamingEventsListener.class);

    @KafkaListener(
            topics = "#{T(pro.kmdo.game.notification.adapter.kafka.EventsTopics).PLAYER_LEVEL_UP.toString()}")
    public void handleLevelUpEvent(@Payload @Valid BaseGamingEvent<LevelUpEventMessage> event) {
    }

    @KafkaListener(
            topics = "#{T(pro.kmdo.game.notification.adapter.kafka.EventsTopics).ITEM_ACQUIRED.toString()}")
    public void handleItemAcquiredEvent(@Payload @Valid BaseGamingEvent<ItemAcquiredEventMessage> event) {
    }

    @KafkaListener(
            topics = "#{T(pro.kmdo.game.notification.adapter.kafka.EventsTopics).CHALLENGE_COMPLETED.toString()}")
    public void handleChallengeCompletedEvent(@Payload @Valid BaseGamingEvent<ChallengeCompletedEventMessage> event) {
    }
}
