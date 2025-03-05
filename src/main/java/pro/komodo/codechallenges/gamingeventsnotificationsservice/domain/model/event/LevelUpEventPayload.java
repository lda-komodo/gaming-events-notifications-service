package pro.komodo.codechallenges.gamingeventsnotificationsservice.domain.model.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = {@JsonCreator})
public class LevelUpEventPayload extends BaseGamingEvent {

    @Positive
    @JsonProperty
    int newLevel;
}
