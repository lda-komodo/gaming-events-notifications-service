package pro.kmdo.gamenotification.adapter.kafka;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pro.kmdo.gamenotification.domain.model.event.*;
import pro.kmdo.gamenotification.domain.port.inbound.ProcessEventUserNotifications;

@Component
@AllArgsConstructor
public class GamingEventsListener {
    
    private final ProcessEventUserNotifications<BaseGamingEvent<LevelUpEventMessage>> processLevelUpUseCase;
    private final ProcessEventUserNotifications<BaseGamingEvent<ItemAcquiredEventMessage>> processItemAcquiredUseCase;
    private final ProcessEventUserNotifications<BaseGamingEvent<ChallengeCompletedEventMessage>> processChallengeCompletedEventMessageUseCase;
    private final ProcessEventUserNotifications<BaseGamingEvent<PvPEventMessage>> processPvPEventMessageUseCase;
    
    @KafkaListener(
            topics = "gaming.level-up.topic")
    public void handleLevelUpEvent(@Payload @Valid BaseGamingEvent<LevelUpEventMessage> event) {
        processLevelUpUseCase.execute(event);
    }
    
    @KafkaListener(
            topics = "#{T(pro.kmdo.gamenotification.adapter.kafka.EventsTopics).ITEM_ACQUIRED.toString()}")
    public void handleItemAcquiredEvent(@Payload @Valid BaseGamingEvent<ItemAcquiredEventMessage> event) {
        processItemAcquiredUseCase.execute(event);
    }
    
    @KafkaListener(
            topics = "#{T(pro.kmdo.gamenotification.adapter.kafka.EventsTopics).CHALLENGE_COMPLETED.toString()}")
    public void handleChallengeCompletedEvent(@Payload @Valid BaseGamingEvent<ChallengeCompletedEventMessage> event) {
        processChallengeCompletedEventMessageUseCase.execute(event);
    }
    
    @KafkaListener(
            topics = "#{T(pro.kmdo.gamenotification.adapter.kafka.EventsTopics).PVP.toString()}")
    public void handlePvPEvent(@Payload @Valid BaseGamingEvent<PvPEventMessage> event) {
        processPvPEventMessageUseCase.execute(event);
    }
}
