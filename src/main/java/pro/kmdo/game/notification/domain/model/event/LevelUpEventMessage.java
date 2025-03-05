package pro.kmdo.game.notification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString()
public class LevelUpEventMessage {

    @Positive
    @JsonProperty
    int newLevel;
}