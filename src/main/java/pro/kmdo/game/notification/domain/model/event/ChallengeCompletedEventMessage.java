package pro.kmdo.game.notification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.ToString;

@ToString
public class ChallengeCompletedEventMessage {
    @NotNull
    @NotEmpty
    @NotBlank
    @JsonProperty
    String challengeName;
}