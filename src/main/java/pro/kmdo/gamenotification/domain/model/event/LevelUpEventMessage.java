package pro.kmdo.gamenotification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Positive;
import lombok.ToString;

@ToString(callSuper = true)
public class LevelUpEventMessage extends AbstractEventMessage {

    @Positive
    @JsonProperty
    int newLevel;
    
    public LevelUpEventMessage() {
        super(EventMessageType.PLAYER_LEVEL_UP);
    }
}