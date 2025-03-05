package pro.kmdo.game.notification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.UUID;

@NoArgsConstructor
@AllArgsConstructor()
@ToString
public class BaseGamingEvent<T> {

    @UUID(allowNil = false, version = 4, letterCase = UUID.LetterCase.INSENSITIVE)
    @JsonProperty
    String messageId;

    @Email
    @JsonProperty
    String userId;

    @Positive
    @JsonProperty
    long timestamp;

    @Valid
    @JsonProperty
    T eventMessage;
}
